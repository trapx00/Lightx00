package trapx00.lightx00.shared.bldriver.promotiondataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.promotiondataservice.TotalPricePromotionDataService;
import trapx00.lightx00.shared.dataservicestub.promotiondataservice.TotalPricePromotionDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class TotalPricePromotionDataServiceDriver {
    TotalPricePromotionDataService service = new TotalPricePromotionDataServiceStub();
    TotalPricePromotionPo promtion = new TotalPricePromotionPo("0001",new Date(),new Date(), PromotionState.Waiting,0,0);

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(promtion));
    }

   /* @Test
    public void queryPromotion() throws Exception {
        assertEquals("0001",service.queryPromotion(query)[0].getId());
    }*/

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(promtion));
    }

}
