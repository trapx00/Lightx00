package trapx00.lightx00.shared.dataservicestub.approvaldataservice;

import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.client.vo.manager.BillQueryVo;

import java.util.Date;

public class AuditDataServiceStub implements AuditDataService {
    @Override
    public BillVo[] query(BillQueryVo query) {

        return new BillVo[]{
                new BillVo(query.getType(),query.getId(),new Date(), query.getState())
        };

    }

    @Override
    public ResultMessage reject(BillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage pass(BillVo bill) {
        return ResultMessage.Success;
    }
}
