package trapx00.lightx00.client.bl.promotionbl;

public class PromotionInfoFactory {
    private static PromotionInfo instance = new PromotionInfoController();

    /**
     * get a PromotionInfo instance.
     * @return PromotionInfo instance
     */

    public static PromotionInfo getInstance() {
        return instance;
    }
}

