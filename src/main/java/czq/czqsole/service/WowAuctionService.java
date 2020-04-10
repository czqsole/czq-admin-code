package czq.czqsole.service;

import czq.czqsole.domain.ItemPrice;

import java.util.Date;
import java.util.List;

/**
 * Author: BG366783
 * Date: 2020-04-02 16:16
 */
public interface WowAuctionService {
    void getPriceHistory(Date startTime, Date endTime, String itemName);

    List<ItemPrice> getItemPriceList();
}
