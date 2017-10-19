package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

public class CommodityPO {//商品
    String ID;//型号+名称生成
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
}


