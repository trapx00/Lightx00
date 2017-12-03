package trapx00.lightx00.client.vo.financestaff;

public class TradeSituationVo { //经营历程表
    private double saleIncome; //销售收入
    private double commodityIncome; //商品类收入
    private double saleCost; //销售成本
    private double commodityCost; //商品支出
    private double profit;

    public TradeSituationVo(double saleIncome, double commodityIncome, double saleCost,
                            double commodityCost,
                            double profit) {
        this.saleIncome = saleIncome;
        this.commodityIncome = commodityIncome;
        this.saleCost = saleCost;
        this.commodityCost = commodityCost;
        this.profit = profit;
    }

    public double getSaleIncome() {
        return saleIncome;
    }

    public void setSaleIncome(double saleIncome) {
        this.saleIncome = saleIncome;
    }

    public double getCommodityIncome() {
        return commodityIncome;
    }

    public void setCommodityIncome(double commodityIncome) {
        this.commodityIncome = commodityIncome;
    }

    public double getSaleCost() {
        return saleCost;
    }

    public void setSaleCost(double saleCost) {
        this.saleCost = saleCost;
    }

    public double getCommodityCost() {
        return commodityCost;
    }

    public void setCommodityCost(double commodityCost) {
        this.commodityCost = commodityCost;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
