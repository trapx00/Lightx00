package trapx00.lightx00.shared.po.manager.promotion;


import java.util.Date;

public class PromotionPoBase{
    private String id;
    private PromotionType type;
    private Date startDate;
    private Date endDate;
    private PromotionState state;

    public PromotionPoBase(String id, PromotionType type, Date startDate, Date endDate, PromotionState state) {
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

    public String getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setId(String id) {
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
