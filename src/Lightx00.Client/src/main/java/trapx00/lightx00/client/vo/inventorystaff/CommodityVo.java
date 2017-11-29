package trapx00.lightx00.client.vo.inventorystaff;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class CommodityVo {
    //商品
    String id;//型号+名称生成
    String name;
    String type;
    double amount;
    Date productionDate;//生产日期
    String batch;//批次
    String batchNo;//批号
    double purchasePrice;//进价
    double recentPurchasePrice;//最近进价
    double retailPrice;//售价
    double recentRetailPrice;//最近售价
    double warningValue;//警戒值

    public static CommodityPo commodityVoToPo(CommodityVo commodityVo){
        return new CommodityPo(commodityVo.getId(),commodityVo.getName(),commodityVo.getType(),commodityVo.getAmount(),
                commodityVo.getProductionDate(),commodityVo.getBatch(),commodityVo.getBatchNo(),commodityVo.getPurchasePrice(),
                commodityVo.getRecentPurchasePrice(),commodityVo.getRetailPrice(),commodityVo.getRecentRetailPrice(),
                commodityVo.getWarningValue());
    }

    public static CommodityVo commodityPotoVo(CommodityPo commodityPo){
        return new CommodityVo(commodityPo.getId(),commodityPo.getName(),commodityPo.getType(),commodityPo.getAmount(),
                commodityPo.getProductionDate(),commodityPo.getBatch(),commodityPo.getBatchNo(),commodityPo.getPurchasePrice(),
                commodityPo.getRecentPurchasePrice(),commodityPo.getRetailPrice(),commodityPo.getRecentRetailPrice(),
                commodityPo.getWarningValue());
    }

    public CommodityVo(String id, String name, String type, double amount, Date productionDate,
                       String batch, String batchNo, double purchasePrice,
                       double recentPurchasePrice, double retailPrice, double recentRetailPrice,
                       double warningValue) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.productionDate = productionDate;
        this.batch = batch;
        this.batchNo = batchNo;
        this.purchasePrice = purchasePrice;
        this.recentPurchasePrice = recentPurchasePrice;
        this.retailPrice = retailPrice;
        this.recentRetailPrice = recentRetailPrice;
        this.warningValue = warningValue;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public String getBatch() {
        return batch;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getRecentPurchasePrice() {
        return recentPurchasePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public double getRecentRetailPrice() {
        return recentRetailPrice;
    }

    public double getWarningValue() {
        return warningValue;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setRecentPurchasePrice(double recentPurchasePrice) {
        this.recentPurchasePrice = recentPurchasePrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setRecentRetailPrice(double recentRetailPrice) {
        this.recentRetailPrice = recentRetailPrice;
    }

    public void setWarningValue(double warningValue) {
        this.warningValue = warningValue;
    }
}
