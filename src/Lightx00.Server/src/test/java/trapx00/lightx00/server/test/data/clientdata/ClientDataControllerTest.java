package trapx00.lightx00.server.test.data.clientdata;

import trapx00.lightx00.server.data.clientdata.factory.ClientDataFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.client.ClientType;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class ClientDataControllerTest {
    static {
        try {
            BaseDatabaseFactory.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    ClientDataService service = ClientDataFactory.getService();

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
        ClientPo clientPo=new ClientPo("0", ClientType.Retailer,5,"xiaoming","123456789","123456789","215000","12345679@qq.com",43.7,37.5,"0");
        assertEquals(ResultMessage.Success, service.add(clientPo));
    }

    @org.junit.Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success, service.delete(null));
    }

}
