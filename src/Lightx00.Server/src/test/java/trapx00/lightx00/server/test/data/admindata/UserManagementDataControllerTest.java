package trapx00.lightx00.server.test.data.admindata;

import com.j256.ormlite.dao.Dao;
import org.junit.Test;
import trapx00.lightx00.server.data.admindata.factory.AdminDataDaoFactory;
import trapx00.lightx00.server.data.admindata.factory.AdminDataFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.po.financestaff.FinanceStaffPo;
import trapx00.lightx00.shared.po.manager.ManagerPo;

import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UserManagementDataControllerTest {
    static {
        try {
            BaseDatabaseFactory.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private UserManagementDataService service = AdminDataFactory.getUserManagementDataService();
    private Dao<ManagerPo, String> managerDao = AdminDataDaoFactory.getManagerDao();
    private Dao<FinanceStaffPo, String> financeStaffDao = AdminDataDaoFactory.getFinanceStaffDao();
    private ManagerPo account = new ManagerPo("张三","001",new Date(),"张三","123456");
    private FinanceStaffPo financeStaffPo = new FinanceStaffPo("财务人员","003",new Date(), "1234","123456");

    @Test
    public void queryOneTable() throws Exception {
        ManagerPo anotherManagerPo = new ManagerPo("张四","0002", new Date(),"123","12345");
        managerDao.create(account);
        managerDao.create(anotherManagerPo);
        try {

            assertEquals(2, service.query(x -> x.getPosition().equals(EmployeePosition.Manager)).length);
            assertEquals(1, service.query(x -> x.getUsername().equals("123")).length);
            assertEquals(0, service.query(x -> x.getPosition().equals(EmployeePosition.Admin)).length);
        } finally {
            managerDao.deleteById(account.getId());
            managerDao.deleteById(anotherManagerPo.getId());
        }
    }

    @Test
    public void queryMultiTable() throws Exception {
        managerDao.create(account);
        financeStaffDao.create(financeStaffPo);
        try {
            assertEquals(2, service.query(x -> true).length);
            assertEquals("001", service.query(x -> x.getPosition().equals(EmployeePosition.Manager))[0].getId());
            assertEquals(0, service.query(x -> x.getPosition().equals(EmployeePosition.InventoryStaff)).length);
        } finally {
            managerDao.deleteById(account.getId());
            financeStaffDao.deleteById(financeStaffPo.getId());
        }

    }

    @Test
    public void addOne() throws Exception {
        try {
            long previous = managerDao.countOf();
            service.add(account);
            assertEquals(previous + 1, managerDao.countOf());
        } finally {
            managerDao.deleteById(account.getId());
        }
    }

    @Test(expected = IdExistsException.class)
    public void addOneIdExist() throws Exception {
        try {
            service.add(account);
            service.add(account);
        } finally {
            managerDao.deleteById(account.getId());
        }
    }

    @Test
    public void addMultipleInOneTable() throws Exception {
        ManagerPo another = new ManagerPo("123","123",new Date(), "123", "123");
        try {
            long previous = managerDao.countOf();
            service.add(account);
            service.add(another);
            assertEquals(previous + 2, managerDao.countOf());
        } finally {
            managerDao.deleteById(account.getId());
            managerDao.deleteById(another.getId());
        }
    }

    @Test
    public void addMultipleInDifferentTable() throws Exception {
        try {
            long previousManager = managerDao.countOf();
            long previousFinance = financeStaffDao.countOf();
            service.add(account);
            service.add(financeStaffPo);
            assertEquals(previousManager + 1, managerDao.countOf());
            assertEquals(previousFinance + 1, financeStaffDao.countOf());
        } finally {
            managerDao.deleteById(account.getId());
            financeStaffDao.deleteById(financeStaffPo.getId());
        }
    }

    @Test
    public void modify() throws Exception {
        try {
            managerDao.create(account);
            ManagerPo addedPo = managerDao.queryForId(account.getId());
            addedPo.setName("张六");
            service.modify(addedPo);
            addedPo = managerDao.queryForId(account.getId());
            assertEquals("张六", addedPo.getName());
        } finally {
            managerDao.deleteById(account.getId());
        }
    }

    @Test
    public void delete() throws Exception {
        try {
            managerDao.create(account);
            service.delete(account);
            assertNull(managerDao.queryForId(account.getId()));
        } finally {
            managerDao.deleteById(account.getId());
        }
    }

}