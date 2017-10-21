package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

public class PromotionVoBase {
    private String id;
    private PromotionType type;
    private String startDate;
    private String endDate;
    private PromotionState state;

    public PromotionVoBase(String id, PromotionType type, String startDate, String endDate,
                           PromotionState state) {
        this.id = id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = state;
    }

    public PromotionState getState() {
        return state;
    }

    public PromotionType getType() {
        return type;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getid() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setid(String id) {
        this.id = id;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setState(PromotionState state) {
        this.state = state;
    }

    public void setType(PromotionType type) {
        this.type = type;
    }
}
