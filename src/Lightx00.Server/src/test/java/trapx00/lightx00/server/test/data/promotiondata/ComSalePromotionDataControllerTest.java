package trapx00.lightx00.server.test.data.promotiondata;

import org.junit.Test;
import trapx00.lightx00.server.data.promotiondata.factory.ComSalePromotionDataFactory;
import trapx00.lightx00.shared.dataservice.promotiondataservice.ComSalePromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;
import trapx00.lightx00.shared.queryvo.Promotion.ComSalePromotionQueryVo;

import static org.junit.Assert.*;

public class ComSalePromotionDataControllerTest {
    private ComSalePromotionDataService service = ComSalePromotionDataFactory.getService();
    private ComSalePromotionPo promotion = service.queryPromotion(new ComSalePromotionQueryVo())[0];

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