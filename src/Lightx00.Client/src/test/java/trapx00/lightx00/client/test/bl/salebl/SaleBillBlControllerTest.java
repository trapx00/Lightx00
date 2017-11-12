package trapx00.lightx00.client.test.bl.salebl;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;
import trapx00.lightx00.client.bl.salebl.SaleBillBlController;
import trapx00.lightx00.client.bl.salebl.factory.SaleBillBlFactory;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.*;

public class SaleBillBlControllerTest {
    SaleBillBlController saleBillBlController= SaleBillBlFactory.getSaleBillBlController();

    @Test
    public void deleteDraft() throws Exception {
        assertEquals(ResultMessage.Success,saleBillBlController.deleteDraft("0"));
    }

    @Test
    public void abandon() throws Exception {
        assertEquals(ResultMessage.Success,saleBillBlController.abandon("0"));
    }

    @Test
    public void activate() throws Exception {
        assertEquals(ResultMessage.Success,saleBillBlController.activate("0"));
    }

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,saleBillBlController.submit(null));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,saleBillBlController.saveAsDraft(null));
    }

    @Test
    public void getId() throws Exception {
        assertEquals("0",saleBillBlController.getId());
    }

    @Test
    public void querySaleBill() throws Exception {
        assertEquals("0",saleBillBlController.querySaleBill(null)[0].getId());
    }

}