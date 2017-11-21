package trapx00.lightx00.server.test.data.bankaccountdata;

import org.junit.Test;
import trapx00.lightx00.server.data.bankaccountdata.BankAccountDataController;
import trapx00.lightx00.server.data.bankaccountdata.factory.BankAccountDataFactory;
import trapx00.lightx00.shared.dataservice.bankaccountdataservice.BankAccountDataService;
import trapx00.lightx00.shared.dataservicestub.bankaccountdataservice.BankAccountDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;
import trapx00.lightx00.shared.queryvo.BankAccountQueryVo;

import static org.junit.Assert.*;

public class BankAccountDataControllerTest {
    private BankAccountDataService service = BankAccountDataFactory.getController();
    private BankAccountPo account = service.query(new BankAccountQueryVo())[0];
    @Test
    public void query() throws Exception {
        assertEquals(1, account.getId());
    }

    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success, service.add(account));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success, service.add(account));
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success, service.add(account));
    }

}