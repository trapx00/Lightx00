package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

public class CommodityPo {//商品
    String Id;//型号+名称生成
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

    public CommodityPo(String Id, String name, String type, double amount, Date productionDate, String batch, String batchNo, double purchasePrice, double recentPurchasePrice, double retailPrice, double recentRetailPrice, double warningValue) {
        this.Id = Id;
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
}


