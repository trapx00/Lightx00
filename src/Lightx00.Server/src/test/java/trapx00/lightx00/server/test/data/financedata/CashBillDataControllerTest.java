package trapx00.lightx00.server.test.data.financedata;

import com.j256.ormlite.dao.Dao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.server.data.financedata.factory.CashBillDataFactory;
import trapx00.lightx00.server.data.financedata.factory.FinanceDataDaoFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.CashBillDataServiceStub;
import trapx00.lightx00.shared.exception.database.BillInvalidStateException;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.exception.database.NoMoreBillException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.queryvo.CashBillQueryVo;

import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.*;

public class CashBillDataControllerTest {
    static {
        try {
            BaseDatabaseFactory.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private Dao<CashBillPo, String> dao = FinanceDataDaoFactory.getCashBillDao();
    private CashBillDataService service = CashBillDataFactory.getService();
    private final CashBillPo bill = new CashBillPo("XJFYD-20171122-00001",new Date(), BillState.Draft, "123","123",null);

    @Before
    public void setUp() throws Exception {
        dao.deleteById(bill.getId());
    }

    @Test
    public void submitOne() throws Exception {
        try {
            service.submit(bill);
            assertTrue(dao.idExists(bill.getId()));
        } finally {
            dao.deleteById(bill.getId());
        }

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
        service.submit(bill);
        service.submit(bill);

    }

    @Test
    public void activate() throws Exception {
        try {
            bill.setState(BillState.WaitingForApproval);
            service.submit(bill);
            service.activate(bill.getId());
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
        assertEquals(1, service.query(new CashBillQueryVo(q->q.where().eq("id",bill.getId()).prepare())).length);
        assertEquals(0, service.query(new CashBillQueryVo(q->q.where().eq("operatorId","12").prepare())).length);
    }

    @Test
    public void getId() throws Exception {
        service.submit(bill);
        assertEquals("00002", service.getId().split("-")[2]);
    }

    @Test(expected = NoMoreBillException.class)
    public void getIdTooMany() throws Exception {
        try {
            bill.setId("XJFYD-20171122-99999");
            service.submit(bill);
            service.getId();
        } finally {
            dao.deleteById(bill.getId());
            bill.setId("XJFYD-20171122-00001");
        }
    }
}