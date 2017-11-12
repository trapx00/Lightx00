package trapx00.lightx00.client.test.bl.promotionbl;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.bl.promotionbl.PromotionInfoController;
import trapx00.lightx00.client.bl.promotionbl.mock.PromotionInfoControllerMock;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.client.vo.manager.promotion.TotalPricePromotionVo;
import trapx00.lightx00.client.vo.salestaff.SaleBillType;
import trapx00.lightx00.client.vo.salestaff.SaleBillVo;
import trapx00.lightx00.client.vo.salestaff.SaleStaffVo;
import trapx00.lightx00.shared.dataservice.promotiondataservice.TotalPricePromotionDataService;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;

import java.util.Date;

import static org.junit.Assert.*;

public class PromotionInfoControllerTest {
    private PromotionInfoController controller = new PromotionInfoControllerMock();
    private SaleBillVo sale = null;
    private TotalPricePromotionVo promotion = null;
    private PromotionVoBase[] promotions = null;
    @Before
    public void setUp(){
        sale = new SaleBillVo("0001",new Date(), BillState.Approved, SaleBillType.Sale,"opple", null, null,22,null,1000,0,0,0,"");
        promotion = new TotalPricePromotionVo("0001",new Date(),new Date(), PromotionState.Waiting,200,1000,null);
        promotions[0] = promotion;
    }
    @Test
    public void queryPromotion() throws Exception {
        assertEquals(promotions[0],controller.queryPromotion(sale));
    }

}