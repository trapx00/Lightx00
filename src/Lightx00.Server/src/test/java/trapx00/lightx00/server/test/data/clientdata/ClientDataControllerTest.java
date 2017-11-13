package trapx00.lightx00.server.test.data.clientdata;

import trapx00.lightx00.server.data.clientdata.factory.ClientDataFactory;
import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.assertEquals;

public class ClientDataControllerTest {
    ClientDataService service = ClientDataFactory.getClientDataController();

    @org.junit.Test
    public void query() throws Exception {
        assertEquals("0", service.query(null)[0].getId());
    }

    @org.junit.Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success, service.modify(null));
    }

    @org.junit.Test
    public void getId() throws Exception {
        assertEquals("0", service.getId());
    }

    @org.junit.Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success, service.add(null));
    }

    @org.junit.Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success, service.delete(null));
    }

}
