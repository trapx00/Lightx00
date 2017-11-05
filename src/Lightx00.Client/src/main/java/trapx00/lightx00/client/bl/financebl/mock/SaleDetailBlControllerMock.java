package trapx00.lightx00.client.bl.financebl.mock;

import trapx00.lightx00.client.bl.financebl.SaleDetailBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailQueryVo;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailVo;

public class SaleDetailBlControllerMock extends SaleDetailBlController {
    /**
     * Queries SaleDetail.
     *
     * @param query SaleDetail query conditions
     * @return SaleDetail that matches query conditions
     */
    @Override
    public SaleDetailVo query(SaleDetailQueryVo query) {
        return super.query(query);
    }

    /**
     * Exports a SaleDetail.
     *
     * @param detail SaleDetail to be exported
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(SaleDetailVo detail) {
        return super.export(detail);
    }


}
