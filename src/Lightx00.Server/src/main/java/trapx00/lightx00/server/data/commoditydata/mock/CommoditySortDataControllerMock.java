package trapx00.lightx00.server.data.commoditydata.mock;

import trapx00.lightx00.server.data.commoditydata.CommoditySortDataController;
import trapx00.lightx00.shared.dataservicestub.commoditydataservice.CommoditySortDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;
import trapx00.lightx00.shared.queryvo.CommoditySortQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;


public class CommoditySortDataControllerMock extends CommoditySortDataServiceStub {

    public CommoditySortDataControllerMock() throws RemoteException {
    }

    String commodityIdList[]={"C0001","C0002"};
    String nextIds[]={"S0002"};
    String lowNextIds[]={""};

    @Override
    public ResultMessage add(CommoditySortPo newCSort, CommoditySortPo parentSort) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(CommoditySortPo commoditySort) {
        return ResultMessage.Success;
    }

    @Override
    public CommoditySortPo[] query(CommoditySortQueryVo commoditySortQueryVo) {
        return new CommoditySortPo[]{
                new CommoditySortPo("S0001","Led", null,
                        "", nextIds)
        };
    }

    @Override
    public ResultMessage delete(CommoditySortPo commoditySort) {
        return ResultMessage.Success;
    }

    @Override
    public CommoditySortPo[] display() {
        return new CommoditySortPo[]{
                new CommoditySortPo("S0001","Led", null,
                        "", nextIds)
        };
    }

    @Override
    public CommoditySortPo[] dispaly(CommoditySortPo commoditySort) {
        return new CommoditySortPo[]{
                new CommoditySortPo(commoditySort.getId(),commoditySort.getName(), null,
                        "", nextIds)
        };
    }

    @Override
    public void init() {

    }
}
