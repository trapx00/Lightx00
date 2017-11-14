package trapx00.lightx00.client.test.presentationdriver.promotionblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.blservice.promotionblservice.ClientPromotionBlService;
import trapx00.lightx00.client.blservicestub.promotionblservice.ClientPromotionBlServiceStub;
import trapx00.lightx00.client.vo.manager.promotion.ClientPromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.util.Date;

import static org.junit.Assert.*;

public class PromotionManagementBlServiceDriver {
    private ClientPromotionBlService service = new ClientPromotionBlServiceStub();
    private ClientPromotionVo promotion = null;

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(promotion));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,service.saveAsDraft(promotion));
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(promotion));
    }

    @Test
    public void queryPromotion() throws Exception {

        assertEquals("0001",service.queryPromotion(x->true)[0].getId());
    }
}