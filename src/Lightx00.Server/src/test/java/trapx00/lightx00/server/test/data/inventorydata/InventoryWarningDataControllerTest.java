package trapx00.lightx00.server.test.data.inventorydata;

import com.j256.ormlite.dao.Dao;
import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryDataDaoFactory;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryWarningDataFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;
import trapx00.lightx00.shared.exception.database.BillInvalidStateException;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.exception.database.NoMoreBillException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;
import trapx00.lightx00.shared.po.inventorystaff.InventoryDetailBillPo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;
import trapx00.lightx00.shared.util.BillHelper;

import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.*;

public class InventoryWarningDataControllerTest {

    CommodityPo commodityPo=null;

    static {
        try {
            BaseDatabaseFactory.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private Dao<InventoryDetailBillPo, String> dao = InventoryDataDaoFactory.getInventoryDetailBillDao();
    private InventoryWarningDataService service = InventoryWarningDataFactory.getService();
    private final InventoryDetailBillPo bill = new InventoryDetailBillPo("Inventory-20171122-00001",new Date(), BillState.Approved, InventoryBillType.Loss
            ,null,null,null);
    @Before
    public void setUp() throws Exception {
        dao.deleteById(bill.getId());
    }

    @Test
    public void submitOne() throws Exception {
       assertEquals(ResultMessage.Success,service.submit(bill));
       dao.deleteById(bill.getId());
    }

    @Test(expected = IdExistsException.class)
    public void submitButIdExistsAndItIsNotDraft() throws Exception {
        try {
            bill.setState(BillState.WaitingForApproval);
            service.submit(bill);
            service.submit(bill);
        } finally {
            bill.setState(BillState.Draft);
            dao.deleteById(bill.getId());
        }
    }

    @Test
    public void submitButActuallyUpdateIfExistingIsDraft() throws Exception {
        try {
            service.submit(bill);
            service.submit(bill);
        } finally {
            dao.deleteById(bill.getId());
        }
    }

    @Test
    public void activate() throws Exception {
        try {
            bill.setState(BillState.WaitingForApproval);
            service.submit(bill);
            service.approvalComplete(bill.getId(),BillState.Approved);
            assertEquals(BillState.Approved, dao.queryForEq("id",bill.getId()).get(0).getState());
        } finally {
            bill.setState(BillState.Draft);
            dao.deleteById(bill.getId());
        }
    }

    @Test(expected = BillInvalidStateException.class)
    public void activateButTheStateIsNotWaitingForApproval() throws Exception {
        try {
            service.submit(bill);
            service.activate(bill.getId());
        } finally {
            dao.deleteById(bill.getId());
        }
    }

    @Test
    public void abandonDraft() throws Exception {
        service.submit(bill);
        service.abandon(bill.getId());
        assertFalse(dao.idExists(bill.getId()));
    }

    @Test
    public void abandonWaitingForApprovalBill() throws Exception {
        bill.setState(BillState.WaitingForApproval);
        service.submit(bill);
        service.abandon(bill.getId());
        assertEquals(BillState.Abandoned, dao.queryForEq("id", bill.getId()).get(0).getState());
    }

    @Test
    public void query() throws Exception {
        service.submit(bill);
        assertEquals(1, service.query(new InventoryBillQueryVo(q->q.where().eq("id",bill.getId()).prepare())).length);
        assertEquals(0, service.query(new InventoryBillQueryVo(q->q.where().eq("operatorId","12").prepare())).length);
    }

    @Test
    public void getId() throws Exception {
        bill.setId(String.format("Inventory-%s-00001", BillHelper.currentDateStringForBill()));
        service.submit(bill);
        assertEquals("00002", service.getId().split("-")[2]);
    }

    @Test(expected = NoMoreBillException.class)
    public void getIdTooMany() throws Exception {
        try {
            bill.setId(String.format("Inventory-%s-99999", BillHelper.currentDateStringForBill()));
            service.submit(bill);
            service.getId();
        } finally {
            dao.deleteById(bill.getId());
            bill.setId("Inventory-20171122-00001");
        }
    }

    @Test
    public void changeState() throws Exception {
        bill.setState(BillState.WaitingForApproval);
        dao.create(bill);
        String id = dao.extractId(bill);
        try {
            service.approvalComplete(bill.getId(),BillState.Approved);
            assertEquals(BillState.Approved, dao.queryForId(bill.getId()).getState());
        } finally {
            dao.deleteById(id);
            bill.setState(BillState.Draft);
        }
    }

    @Test(expected = BillInvalidStateException.class)
    public void changeStateInvalidState() throws Exception {
        dao.create(bill);
        String id = dao.extractId(bill);
        try {
            service.approvalComplete(bill.getId(),BillState.Approved);
        } finally {
            dao.deleteById(id);
        }
    }

}