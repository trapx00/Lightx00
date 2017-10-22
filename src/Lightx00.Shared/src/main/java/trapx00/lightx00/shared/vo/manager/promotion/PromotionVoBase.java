package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public class PromotionVoBase {
    private String id;
    private PromotionType type;
    private Date startDate;
    private Date endDate;
    private PromotionState state;

    public PromotionVoBase(String id, PromotionType type, Date startDate, Date endDate,
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

    public Date getEndDate() {
        return endDate;
    }

    public String getid() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setid(String id) {
        this.id = id;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setState(PromotionState state) {
        this.state = state;
    }

    public void setType(PromotionType type) {
        this.type = type;
    }
}
