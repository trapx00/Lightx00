package trapx00.lightx00.client.presentation.promotionui.factory;

import trapx00.lightx00.client.presentation.promotionui.PromotionInfo;
import trapx00.lightx00.client.presentation.promotionui.PromotionInfoUiController;

public class PromotionInfoFactory {
    private static PromotionInfo promotionInfo = new PromotionInfoUiController();

    public static PromotionInfo getEmployeeInfo() {
        return promotionInfo;
    }
}
