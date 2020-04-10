package czq.czqsole.dao;

import czq.czqsole.domain.ItemPrice;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: BG366783
 * Date: 2020-04-03 02:42
 */
@Mapper
public interface ItemPriceMapper {
    @Insert("INSERT INTO item_price (item_id, min_buyout, market_value, num_auctions, quantity, last_scan, item_name) " +
            "VALUES (#{itemId}, #{minBuyout}, #{marketValue}, #{numAuctions}, #{quantity}, #{lastScan}, #{itemName})")
    void insert(ItemPrice itemPrice);
}
