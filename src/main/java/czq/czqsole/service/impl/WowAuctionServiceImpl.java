package czq.czqsole.service.impl;

import czq.czqsole.dao.ItemPriceMapper;
import czq.czqsole.domain.ItemPrice;
import czq.czqsole.service.WowAuctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Author: BG366783
 * Date: 2020-04-02 16:28
 */
@Component
public class WowAuctionServiceImpl implements WowAuctionService {

    public static Logger logger = LoggerFactory.getLogger(WowAuctionServiceImpl.class);
    @Resource
    private ItemPriceMapper itemPriceMapper;

    @Override
    public void getPriceHistory(Date startTime, Date endTime, String itemName) {

    }

    @Override
    public List<ItemPrice> getItemPriceList() {
        return readFile();
    }

    private List<ItemPrice> readFile() {
        List<ItemPrice> result = new ArrayList<>();

        String filePath = "/Applications/World of Warcraft/_classic_/WTF/Account/187610327#1/SavedVariables/TradeSkillMaster.lua";
        try {
            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
                BufferedReader bufferedReader = new BufferedReader(reader);
                String lineString = "";
                while ((lineString = bufferedReader.readLine()) != null) {
                    if (lineString.contains("csvAuctionDBScan")) {
                        int index = lineString.indexOf("lastScan") + 10;
                        String data = lineString.substring(index);
//                        data = data.replaceAll("\\n", "#");
                        String[] itemList = data.split("i:");
                        for(String item: itemList) {
                            // test print
//                            System.out.println(item);
                            if(StringUtils.isEmpty(item)) {
                                continue;
                            }
                            // itemString,minBuyout,marketValue,numAuctions,quantity,lastScan
                            // i:14484,   25000,    26999,      9,          9,       1585808471
                            item = item.replaceAll("\\n", "");
                            String[] itemInfo = item.split(",");
                            int itemId = Integer.valueOf(itemInfo[0]);
                            int minBuyout = Integer.valueOf(itemInfo[1]);
                            int marketValue = Integer.valueOf(itemInfo[2]);
                            int numAuctions = Integer.valueOf(itemInfo[3]);
                            int quantity = Integer.valueOf(itemInfo[4]);
                            Long lastScan = Long.valueOf(
                                    itemInfo[5].replace("\\n", "").replace("\"", "").replace("\\r\\n", ""));
                            ItemPrice itemPrice = new ItemPrice();
                            itemPrice.setItemId(itemId);
                            itemPrice.setMinBuyout(minBuyout);
                            itemPrice.setMarketValue(marketValue);
                            itemPrice.setNumAuctions(numAuctions);
                            itemPrice.setQuantity(quantity);
                            itemPrice.setLastScan(new Date(lastScan * 1000));
                            itemPriceMapper.insert(itemPrice);
                            result.add(itemPrice);
                        }
                        bufferedReader.close();
                        reader.close();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Read file error: ", e);
        }

        return result;
    }

}
