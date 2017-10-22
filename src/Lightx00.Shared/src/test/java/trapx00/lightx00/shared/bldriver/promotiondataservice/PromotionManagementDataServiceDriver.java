package trapx00.lightx00.shared.bldriver.promotiondataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.promotiondataservice.PromotionManagementDataService;
import trapx00.lightx00.shared.dataservicestub.promotiondataservice.PromotionManagementDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

import static org.junit.Assert.*;

public class PromotionManagementDataServiceDriver {
    PromotionManagementDataService service = new PromotionManagementDataServiceStub();
    PromotionPoBase promtion = new PromotionPoBase("0001", PromotionType.CommodityOnSale,new Date(),new Date(), PromotionState.Waiting);
    CommodityPo commodity = new CommodityPo("000001","落地灯",null,1,new Date(),null,null,100,100,150,150,10);
    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(promtion));
    }

    @Test
    public void queryPromotion() throws Exception {
        assertEquals("0001",service.queryPromotion(null,PromotionType.CommodityOnSale,0,0)[0].getId());
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(promtion));
    }

    @Test
    public void queryCommodity() throws Exception {
        assertEquals("000001",service.queryCommodity("00001","落地灯",null)[0].getId());
    }

}