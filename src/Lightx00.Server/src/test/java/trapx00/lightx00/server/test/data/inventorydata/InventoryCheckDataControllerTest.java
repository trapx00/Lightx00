package trapx00.lightx00.server.test.data.inventorydata;

import com.j256.ormlite.dao.Dao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryCheckDataFactory;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryOtherDataDaoFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;
import trapx00.lightx00.shared.queryvo.InventoryPictureQueryVo;
import trapx00.lightx00.shared.queryvo.InventoryViewQueryVo;

import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.*;

public class InventoryCheckDataControllerTest {

    static {
        try {
            BaseDatabaseFactory.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Dao<InventoryViewPo, String> inventoryViewDao = InventoryOtherDataDaoFactory.getInventoryViewDao();
    private Dao<InventoryPicturePo,String> inventoryPictureDao=InventoryOtherDataDaoFactory.getInventoryPictureDao();
    private InventoryCheckDataService inventoryCheckDataService=InventoryCheckDataFactory.getService();
    private InventoryViewPo inventoryViewPo=new InventoryViewPo("VIEW-0001-0001",new Date(),1,1,
            1,1,1,1,1);
    private InventoryPicturePo inventoryPicturePo=new InventoryPicturePo("PICT-0001-0001",new Date(),null);

    @Test
    public void picture() throws Exception {
        inventoryPictureDao.create(inventoryPicturePo);
        assertEquals(0, inventoryCheckDataService.getInventoryPicture(new InventoryPictureQueryVo().eq("id","PICT-0001-0001")).length);
        inventoryPictureDao.delete(inventoryPicturePo);
    }

    @Test
    public void view() throws Exception {
        inventoryViewDao.create(inventoryViewPo);
        assertEquals(1, inventoryCheckDataService.getInventoryView(new InventoryViewQueryVo().eq("id","VIEW-0001-0001")).length);
        inventoryViewDao.delete(inventoryViewPo);
    }

}