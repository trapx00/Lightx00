package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public class ClientOnSaleVo extends PromotionVoBase {
    private int clientLevel;
    private double onSalePrice;

    public ClientOnSaleVo(String id, Date startDate, Date endDate, PromotionState state, int clientLevel, double onSalePrice) {
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
