package trapx00.lightx00.client.bl.financebl.mock;

import trapx00.lightx00.client.bl.financebl.SaleDetailBlController;
import trapx00.lightx00.client.vo.financestaff.SaleRecordVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.financestaff.SaleDetailQueryVo;
import trapx00.lightx00.client.vo.financestaff.SaleDetailVo;

import java.util.Date;

public class SaleDetailBlControllerMock extends SaleDetailBlController {
    /**
     * Queries SaleDetail.
     *
     * @param query SaleDetail query conditions
     * @return SaleDetail that matches query conditions
     */
    @Override
    public SaleDetailVo query(SaleDetailQueryVo query) {
        return new SaleDetailVo(
                new SaleRecordVo[] {
                        new SaleRecordVo(new Date(),"123","123",0,0,0)
                }
        );
    }

    /**
     * Exports a SaleDetail.
     *
     * @param detail SaleDetail to be exported
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(SaleDetailVo detail) {
        return ResultMessage.Success;
    }


}
