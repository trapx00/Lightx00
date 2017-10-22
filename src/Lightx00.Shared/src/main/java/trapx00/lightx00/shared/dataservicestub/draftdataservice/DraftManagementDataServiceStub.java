package trapx00.lightx00.shared.dataservicestub.draftdataservice;

import trapx00.lightx00.shared.dataservice.draftdataservice.DraftManagementDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

import java.util.Date;

public class DraftManagementDataServiceStub implements DraftManagementDataService {
    @Override
    public BillPo[] update() {
        return new BillPo[]{
                new PaymentBillPo("123", new Date(), BillState.Draft, "","",null,0)
        };
    }

    @Override
    public ResultMessage delete(BillPo bill) {
        return ResultMessage.Success;
    }
}
