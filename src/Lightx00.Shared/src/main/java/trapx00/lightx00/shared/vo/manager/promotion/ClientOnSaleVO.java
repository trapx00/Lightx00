package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

public class ClientOnSaleVo extends PromotionVoBase {
    int clientLevel;
    double onSalePrice;

    public ClientOnSaleVo(String Id, String startDate, String endDate, PromotionState state, int clientLevel, double onSalePrice) {
        super(Id, PromotionType.ClientOnSale, startDate, endDate, state);
        this.clientLevel = clientLevel;
        this.onSalePrice = onSalePrice;
    }
}
