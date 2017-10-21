package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

public class PromotionVoBase{
    String id;
    PromotionType type;
    String startDate;
    String endDate;
    PromotionState state;

    public PromotionVoBase(String id, PromotionType type, String startDate, String endDate,
                           PromotionState state) {
        this.id = id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = state;
    }
}
