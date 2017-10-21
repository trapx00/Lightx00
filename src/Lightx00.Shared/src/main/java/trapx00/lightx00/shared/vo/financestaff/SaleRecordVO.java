package trapx00.lightx00.shared.vo.financestaff;

import java.util.Date;

public class SaleRecordVo { //商品销售记录
    Date date;
    String commodityName;
    String model;
    double amount;
    double unitPrice;
    double total;

    public SaleRecordVo(Date date, String commodityName, String model, double amount, double unitPrice, double total) {
        this.date = date;
        this.commodityName = commodityName;
        this.model = model;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.total = total;
    }
}
