package trapx00.lightx00.server.test.data.promotiondata;

import org.junit.Test;
import trapx00.lightx00.server.data.promotiondata.factory.ClientPromotionDataFactory;
import trapx00.lightx00.shared.dataservice.promotiondataservice.ClientPromotionDataService;
import trapx00.lightx00.shared.dataservicestub.promotiondataservice.ClientPromotionDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ClientPromotionDataControllerTest {
    ClientPromotionDataService service = ClientPromotionDataFactory.getService();
    ClientPromotionPo promtion = new ClientPromotionPo("0001",new Date(),new Date(), PromotionState.Waiting,1,200,null,0);
    PromotionPoBase[] promotions = {promtion};

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(promtion));
    }

    @Test
    public void queryPromotion() throws Exception {
        assertEquals(promotions[0],service.queryPromotion(x->true));
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(promtion));
    }

}