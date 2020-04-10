package czq.czqsole.domain;

import java.util.Date;

/**
 * Author: BG366783
 * Date: 2020-04-02 16:32
 */
public class ItemPrice {
    private Integer id;
    private Integer itemId;
    private Integer minBuyout;
    private Integer marketValue;
    private Integer numAuctions;
    private Integer quantity;
    private Date lastScan;
    private String itemName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getMinBuyout() {
        return minBuyout;
    }

    public void setMinBuyout(Integer minBuyout) {
        this.minBuyout = minBuyout;
    }

    public Integer getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Integer marketValue) {
        this.marketValue = marketValue;
    }

    public Integer getNumAuctions() {
        return numAuctions;
    }

    public void setNumAuctions(Integer numAuctions) {
        this.numAuctions = numAuctions;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getLastScan() {
        return lastScan;
    }

    public void setLastScan(Date lastScan) {
        this.lastScan = lastScan;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
