package trapx00.lightx00.shared.vo.financestaff;

public class TradeSituationVo { //经营历程表
    double saleIncome; //销售收入
    double commodityIncome; //商品类收入
    double saleCost; //销售支出
    double commodityCost; //商品支出
    double profit;

    public TradeSituationVo(double saleIncome, double commodityIncome, double saleCost, double commodityCost,
                            double profit) {
        this.saleIncome = saleIncome;
        this.commodityIncome = commodityIncome;
        this.saleCost = saleCost;
        this.commodityCost = commodityCost;
        this.profit = profit;
    }
}
