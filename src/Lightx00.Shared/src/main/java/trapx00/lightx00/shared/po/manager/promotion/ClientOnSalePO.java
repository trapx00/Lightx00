package trapx00.lightx00.shared.po.manager.promotion;

public class ClientOnSalePo extends PromotionPoBase {
    int clientLevel;
    double onSalePrice;

    public ClientOnSalePo(String Id, String startDate, String endDate, PromotionState state, int clientLevel, double onSalePrice) {
        super(Id, PromotionType.ClientOnSale, startDate, endDate, state);
        this.clientLevel = clientLevel;
        this.onSalePrice = onSalePrice;
    }
}
