package czq.czqsole;

import czq.czqsole.dao.ItemPriceMapper;
import czq.czqsole.domain.ItemPrice;
import czq.czqsole.service.WowAuctionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: BG366783
 * Date: 2020-04-03 03:00
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ItemPriceMapperTest {
    private static final Logger log = LoggerFactory.getLogger(ProcessWorkMapperTest.class);

    @Resource
    private ItemPriceMapper itemPriceMapper;

    @Resource
    private WowAuctionService wowAuctionService;

//    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public void testInsert() {

        ItemPrice itemPrice = new ItemPrice();
        itemPrice.setItemId(14484);
        itemPrice.setMinBuyout(25000);
        itemPrice.setMarketValue(26999);
        itemPrice.setNumAuctions(9);
        itemPrice.setQuantity(9);
//        Date date = new Date(1585808471000L);
//        format.format(date);
        itemPrice.setLastScan(new Date(1585808471000L));

        try {
            itemPriceMapper.insert(itemPrice);
        } catch (Exception e) {
            log.info("error", e);
        }
    }

    @Test
    public void testReadFile() {
        wowAuctionService.getItemPriceList();
    }
}
