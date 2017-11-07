package trapx00.lightx00.shared.bldriver.bankaccountdataservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.shared.dataservice.bankaccountdataservice.BankAccountDataService;
import trapx00.lightx00.shared.dataservicestub.bankaccountdataservice.BankAccountDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;

import static org.junit.Assert.*;

public class BankAccountDataServiceDriver {
    BankAccountDataService service = new BankAccountDataServiceStub();
    BankAccountPo account = service.query(x->true)[0];
    @Test
    public void query() throws Exception {
        assertEquals("123", account.getId());
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