package trapx00.lightx00.client.test.bl.draftbl;

import org.junit.Test;
import trapx00.lightx00.client.bl.draftbl.DraftBlController;
import trapx00.lightx00.client.bl.draftbl.mock.DraftBlControllerMock;
import trapx00.lightx00.client.vo.financestaff.PaymentBillVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.Transcation;

import java.util.Date;

import static org.junit.Assert.*;

public class DraftBlControllerTest {
    private DraftBlController controller =  new DraftBlControllerMock();
    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success, controller.saveAsDraft( new PaymentBillVo("FXD-20171111-00001",new Date(), BillState.Approved, "123","123",new Transcation[] { new Transcation("123",0,"123")}, 0.0)));
    }

    @Test
    public void update() throws Exception {
        assertEquals(0, controller.update()[0].getId());
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success, controller.delete( new PaymentBillVo("FXD-20171111-00001",new Date(), BillState.Approved, "123","123",new Transcation[] { new Transcation("123",0,"123")}, 0.0)));
    }


}