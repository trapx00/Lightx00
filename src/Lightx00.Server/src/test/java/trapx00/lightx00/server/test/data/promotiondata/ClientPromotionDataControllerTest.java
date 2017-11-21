package trapx00.lightx00.server.test.data.promotiondata;

import org.junit.Test;
import trapx00.lightx00.server.data.promotiondata.factory.ClientPromotionDataFactory;
import trapx00.lightx00.shared.dataservice.promotiondataservice.ClientPromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.queryvo.TotalPricePromotionQueryVo;

import java.util.Date;

import static org.junit.Assert.*;

public class ClientPromotionDataControllerTest {
    private ClientPromotionDataService service = ClientPromotionDataFactory.getService();
    private ClientPromotionPo promotion = service.queryPromotion(new TotalPricePromotionQueryVo())[0];
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