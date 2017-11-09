package trapx00.lightx00.client.test.presentationdriver.clientblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.clientblservice.ClientBlService;
import trapx00.lightx00.client.blservicestub.clientblservice.ClientBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.salestaff.ClientVo;

import static org.junit.Assert.*;

public class ClientBlServiceDriver {

    ClientBlService service=new ClientBlServiceStub();
    ClientVo clientVo;
    ClientVo[] clientVos;

    @Test
    public void query() throws Exception {
        assertEquals("12345678",service.query("xiaoming")[0].getPhone());
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,service.saveAsDraft(clientVo));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify(clientVo));
    }

    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,service.add(clientVo));
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(clientVos));
    }

    @Test
    public void detail() throws Exception {
        assertEquals("12345678",service.detail(clientVo).getPhone());
    }

}