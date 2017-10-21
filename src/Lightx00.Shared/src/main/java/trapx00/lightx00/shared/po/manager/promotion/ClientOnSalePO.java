package trapx00.lightx00.shared.po.manager.promotion;

public class ClientOnSalePo extends PromotionPoBase {
    private int clientLevel;
    private double onSalePrice;

    public ClientOnSalePo(String id, String startDate, String endDate, PromotionState state, int clientLevel, double onSalePrice) {
        super(id, PromotionType.ClientOnSale, startDate, endDate, state);
        this.clientLevel = clientLevel;
        this.onSalePrice = onSalePrice;
    }

    public int getClientLevel() {
        return clientLevel;
    }

    public void setClientLevel(int clientLevel) {
        this.clientLevel = clientLevel;
    }

    public double getOnSalePrice() {
        return onSalePrice;
    }

    public void setOnSalePrice(double onSalePrice) {
        this.onSalePrice = onSalePrice;
    }
}
