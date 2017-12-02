package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.client.bl.salebl.SaleBillBlInfo;
import trapx00.lightx00.client.bl.salebl.factory.SaleBillBlInfoFactory;
import trapx00.lightx00.client.blservice.financeblservice.SaleDetailBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.financestaff.SaleDetailQueryVo;
import trapx00.lightx00.client.vo.financestaff.SaleDetailVo;

public class SaleDetailBlController implements SaleDetailBlService {
    private SaleBillBlInfo saleBillBlInfo = SaleBillBlInfoFactory.getSaleBillBlInfo();
    /**
     * Queries SaleDetail.
     *
     * @param query SaleDetail query conditions
     * @return SaleDetail that matches query conditions
     */
    @Override
    public SaleDetailVo query(SaleDetailQueryVo query) {
        return null;
    }

    /**
     * Exports a SaleDetail.
     *
     * @param detail SaleDetail to be exported
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(SaleDetailVo detail) {
        return null;
    }
}
