package trapx00.lightx00.client.test.presentationdriver.promotionblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;

import java.util.Date;

import static org.junit.Assert.*;

public class PromotionManagementBlServieDriver {
    PromotionManagementBlService service = new PromotionManagementBlServieStub();
    PromotionVoBase promotion = null;
    @Before
    public void setUp() throws Exception{
        promotion = service.resume();
    }
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
    public void resume() throws Exception {
        assertNotNull(service.resume());
    }

    @Test
    public void queryPromotion() throws Exception {
        PromotionQueryVo query = new PromotionQueryVo("0001",PromotionType.CommodityOnSale,new Date(),new Date(),0,0,0);
        assertEquals("0001",service.queryPromotion(query)[0].getid());
    }

    @Test
    public void queryCommodity() throws Exception {
        CommodityQueryVo query = new CommodityQueryVo("00001","落地灯",null);
        assertEquals("00001",service.queryCommodity(query)[0].getId());
    }

}