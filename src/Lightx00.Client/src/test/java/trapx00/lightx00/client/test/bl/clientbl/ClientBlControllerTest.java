package trapx00.lightx00.client.test.bl.clientbl;

import org.junit.Test;
import trapx00.lightx00.client.bl.clientbl.ClientBlController;
import trapx00.lightx00.client.bl.clientbl.factory.ClientBlFactory;
import trapx00.lightx00.client.bl.clientbl.mock.ClientBlControllerMock;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.shared.po.ClientModificationFlag;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.*;

public class ClientBlControllerTest {

    ClientBlController clientBlController= ClientBlFactory.getClientBlController();

    @Test
    public void deleteDraft() throws Exception {
        assertEquals(ResultMessage.Success,clientBlController.delete(new String[]{"1","0"}));
    }

    @Test
    public void query() throws Exception {
        assertEquals("0",clientBlController.query("123")[0].getId());
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,clientBlController.saveAsDraft(null));
    }

    @Test
    public void getId() throws Exception {
        assertEquals("0",clientBlController.getId());
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,clientBlController.modify(null));
    }

    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,clientBlController.add(null));
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,clientBlController.delete(new String[]{"0","1"}));
    }

    @Test
    public void modifyClient() throws Exception {
        assertEquals(ResultMessage.Success,clientBlController.modifyClient("0", ClientModificationFlag.PAYABLE,100));
    }

}