package trapx00.lightx00.shared.bldriver.promotiondataservice;

import trapx00.lightx00.shared.dataservice.promotiondataservice.ClientPromotionDataService;
import trapx00.lightx00.shared.dataservicestub.promotiondataservice.ClientPromotionDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;

import java.util.Date;

public class ClientPromotionDataServiceDriver {
    ClientPromotionDataService service = new ClientPromotionDataServiceStub();
    ClientPromotionPo promtion = new ClientPromotionPo("0001",new Date(),new Date(), PromotionState.Waiting,0,0);

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(promtion));
    }

    @Test
    public void queryPromotion() throws Exception {
        assertEquals("0001",service.queryPromotion(query)[0].getId());
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(promtion));
    }

    @Test
    public String getId(){
        assertEquals(null,service.getId());
    }
}
