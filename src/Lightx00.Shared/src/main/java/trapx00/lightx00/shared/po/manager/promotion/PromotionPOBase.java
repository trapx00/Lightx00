package trapx00.lightx00.shared.po.manager.promotion;


public class PromotionPoBase{
    private String id;
    private PromotionType type;
    private String startDate;
    private String endDate;
    private PromotionState state;

    public PromotionPoBase(String id, PromotionType type, String startDate, String endDate, PromotionState state) {
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

    public String getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setId(String id) {
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
