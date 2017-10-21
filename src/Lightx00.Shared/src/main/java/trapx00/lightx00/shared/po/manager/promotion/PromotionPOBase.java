package trapx00.lightx00.shared.po.manager.promotion;


public class PromotionPoBase{
    String Id;
    PromotionType type;
    String startDate;
    String endDate;
    PromotionState state;

    public PromotionPoBase(String Id, PromotionType type, String startDate, String endDate, PromotionState state) {
        this.Id = Id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = state;
    }
}
