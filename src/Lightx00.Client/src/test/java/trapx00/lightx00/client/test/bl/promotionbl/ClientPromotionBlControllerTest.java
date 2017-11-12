package trapx00.lightx00.client.test.bl.promotionbl;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.bl.promotionbl.ClientPromotionBlController;
import trapx00.lightx00.client.bl.promotionbl.mock.ClientPromotionBlControllerMock;
import trapx00.lightx00.client.vo.manager.promotion.ClientPromotionVo;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;

import java.util.Date;

import static org.junit.Assert.*;

public class ClientPromotionBlControllerTest {
    private ClientPromotionBlController controller = new ClientPromotionBlControllerMock();
    private ClientPromotionVo promotion = null;
    private PromotionVoBase[] promotions = null;
    @Before
    public void setUp() {
        promotion = new ClientPromotionVo("0001",new Date(),new Date(), PromotionState.Waiting,1,200,null,0);
        promotions[0] = promotion;
    }
    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,controller.submit(promotion));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,controller.saveAsDraft(promotion));
    }

    @Test
    public void queryPromotion() throws Exception {
        assertEquals(promotions[0],controller.queryPromotion(x->true));
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,controller.delete(promotion));
    }

    @Test
    public void getId() throws Exception {
        assertEquals(ResultMessage.Success,controller.getId());
    }

    @Test
    public void deleteDraft() throws Exception {
        assertEquals(ResultMessage.Success,controller.deleteDraft("0001"));
    }

}