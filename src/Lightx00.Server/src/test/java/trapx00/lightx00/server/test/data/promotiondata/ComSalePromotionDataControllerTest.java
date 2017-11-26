package trapx00.lightx00.server.test.data.promotiondata;

import com.j256.ormlite.dao.Dao;
import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.server.data.promotiondata.factory.ComSalePromotionDataFactory;
import trapx00.lightx00.server.data.promotiondata.factory.PromotionDataDaoFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.promotiondataservice.ComSalePromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.queryvo.Promotion.ComSalePromotionQueryVo;

import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.*;

public class ComSalePromotionDataControllerTest {
    static {
        try {
            BaseDatabaseFactory.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private Dao<ComSalePromotionPo, String> dao = PromotionDataDaoFactory.getComSalePromotionDao();
    private ComSalePromotionDataService service = ComSalePromotionDataFactory.getService();
    private final ComSalePromotionPo promotion = new ComSalePromotionPo("SPJJCXCL-20171112-00001",new Date(),new Date(), PromotionState.Draft,null,0);

    @Before
    public void setUp() throws Exception {
        dao.deleteById(promotion.getId());
    }

    @Test
    public void submitOne() throws Exception {
        try {
            service.submit(promotion);
            assertTrue(dao.idExists(promotion.getId()));
        } finally {
            dao.deleteById(promotion.getId());
        }

    }

    @Test
    public void deleteWaitingPromotion() throws Exception {
        dao.create(promotion);
        service.delete(promotion.getId());
        assertEquals(PromotionState.Abandoned, dao.queryForEq("id", promotion.getId()).get(0).getState());
    }

    @Test
    public void deleteActivePromotion() throws Exception {
        dao.create(promotion);
        service.delete(promotion.getId());
        assertFalse(dao.idExists(promotion.getId()));
    }

    @Test
    public void deleteOverduePromotion() throws Exception {
        promotion.setState(PromotionState.Overdue);
        dao.create(promotion);
        service.delete(promotion.getId());
        assertFalse(dao.idExists(promotion.getId()));
    }

    @Test
    public void query() throws Exception {
        service.submit(promotion);
        assertEquals(1, service.queryPromotion(new ComSalePromotionQueryVo(q->q.where().eq("id",promotion.getId()).prepare())).length);
        assertEquals(0, service.queryPromotion(new ComSalePromotionQueryVo(q->q.where().eq("operatorId","12").prepare())).length);
    }

    @Test
    public void getId() throws Exception {
        service.submit(promotion);
        assertEquals("00002", service.getId().split("-")[2]);
    }

}