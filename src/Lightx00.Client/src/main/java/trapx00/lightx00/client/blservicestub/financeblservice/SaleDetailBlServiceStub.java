package trapx00.lightx00.client.blservicestub.financeblservice;

import trapx00.lightx00.client.blservice.financeblservice.SaleDetailBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailQueryVo;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailVo;
import trapx00.lightx00.shared.vo.financestaff.SaleRecordVo;

import java.util.Date;

public class SaleDetailBlServiceStub implements SaleDetailBlService {
    @Override
    public SaleDetailVo query(SaleDetailQueryVo query) {
        return new SaleDetailVo(new SaleRecordVo[]
                { new SaleRecordVo(
                        new Date(),query.getCommodityName(),"123",0,0,0) });
    }

    @Override
    public ResultMessage export(SaleDetailVo detail) {
        return ResultMessage.Success;
    }
}
