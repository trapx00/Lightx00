package trapx00.lightx00.server.test.data.promotiondata;

import org.junit.Test;
import trapx00.lightx00.server.data.promotiondata.factory.TotalPricePromotionDataFactory;
import trapx00.lightx00.shared.dataservice.promotiondataservice.TotalPricePromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.queryvo.TotalPricePromotionQueryVo;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class TotalPricePromotionDataControllerTest {
    private TotalPricePromotionDataService service = TotalPricePromotionDataFactory.getService();
    private TotalPricePromotionPo promotion = service.queryPromotion(new TotalPricePromotionQueryVo())[0];

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(promotion));
    }

    @Test
    public void queryPromotion() throws Exception {
        assertEquals("0001",promotion.getId());
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(promotion));
    }

}