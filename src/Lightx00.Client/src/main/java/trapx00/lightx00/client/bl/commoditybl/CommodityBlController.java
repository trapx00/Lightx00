package trapx00.lightx00.client.bl.commoditybl;

import trapx00.lightx00.client.bl.logbl.LogService;
import trapx00.lightx00.client.bl.logbl.factory.LogServiceFactory;
import trapx00.lightx00.client.bl.util.PoVoConverter;
import trapx00.lightx00.client.blservice.commodityblservice.CommodityBlService;
import trapx00.lightx00.client.datafactory.commoditydataservicefactory.CommodityDataServiceFactory;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.exception.database.IdNotExistsException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryModificationFlag;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;

import java.rmi.RemoteException;


public class CommodityBlController implements CommodityBlService,CommodityInfo,InventoryModificationService,PoVoConverter<CommodityPo,CommodityVo> {
    private LogService logService = LogServiceFactory.getLogService();
    private CommodityDataService dataService= CommodityDataServiceFactory.getService();

    /**
     * Add a new commoditybl
     * @param newCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommodityVo newCommodity) {
        CommodityPo commodityPo = fromVoToPo(newCommodity);
        try{
            ResultMessage opResult = dataService.add(commodityPo);
            if (opResult.isSuccess()) {
                logService.log(LogSeverity.Success, String.format("创建了商品%s,编号为%s。", newCommodity.getName(), newCommodity.getId()));
            } else {
                logService.log(LogSeverity.Failure, String.format("创建商品%s失败，原因不明。",newCommodity.getName()));
            }
            return opResult;
        }catch (RemoteException e) { //RemoteException是网络原因的错误。这里记下日志，然后用UncheckedRemoteException包一下继续抛出。
            logService.log(LogSeverity.Failure, String.format("创建商品%s失败，原因网络原因，具体信息是%s，商品名是%s",newCommodity.getId(), e.getMessage(),newCommodity.getName()) );
            throw new UncheckedRemoteException(e);
        } catch (IdExistsException e) { //参考服务器端写的代码，直接抓对应的异常即可，记得如果不在这里处理，需要继续往外抛出。比如这里就需要UI层继续处理这个异常，所以需要继续抛出。
            logService.log(LogSeverity.Failure, String.format("创建商品%s重复，原因是商品id已经存在。已经更新商品%s", newCommodity.getId(), newCommodity.getName()));
            throw e;
        }


    }

    /**
     *  Modifys a commoditybl
     * @param updateCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommodityVo updateCommodity) {
        CommodityPo commodityPo=fromVoToPo(updateCommodity);
        try{
            ResultMessage opResult = dataService.modify(commodityPo);
            if (opResult.isSuccess()) {
                logService.log(LogSeverity.Success, String.format("更新了商品%s,编号为%s。", updateCommodity.getName(), updateCommodity.getId()));
            } else {
                logService.log(LogSeverity.Failure, String.format("更新商品%s失败，原因不明。",updateCommodity.getName()));
            }
            return opResult;
        }catch (RemoteException e) { //RemoteException是网络原因的错误。这里记下日志，然后用UncheckedRemoteException包一下继续抛出。
            logService.log(LogSeverity.Failure, String.format("更新商品%s失败，原因网络原因，具体信息是%s，商品名是%s",updateCommodity.getId(), e.getMessage(),updateCommodity.getName()) );
            throw new UncheckedRemoteException(e);
        } catch (IdNotExistsException e) { //参考服务器端写的代码，直接抓对应的异常即可，记得如果不在这里处理，需要继续往外抛出。比如这里就需要UI层继续处理这个异常，所以需要继续抛出。
            logService.log(LogSeverity.Failure, String.format("更新商品%s%s成功，但原商品不存在，创建了新商品", updateCommodity.getId(), updateCommodity.getName()));
            throw e;
        }

    }

    /**
     * Querys a commoditybl
     * @param commodityQueryVo
     * @return The commoditybl that match to the requirement
     */
    @Override
    public CommodityVo[] query(CommodityQueryVo commodityQueryVo) {
        return new CommodityVo[0];
    }

    /**
     * Deltes the existed commoditybl
     * @param commodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(CommodityVo commodity) {
        return ResultMessage.Success;
    }

    /**
     * Query a commoditybl
     * @param commodityQueryVo
     * @return Commodity that match query condition
     */
    @Override
    public CommodityVo[] queryCommodity(CommodityQueryVo commodityQueryVo) {
        return new CommodityVo[0];
    }

    @Override
    public ResultMessage update(String id, double value) {
        return null;
    }

    /**
     * Modify the inventoryNum
     * @param commodityId
     * @param flag
     * @param delta
     * @return ResultMessage
     */
    @Override
    public ResultMessage modifyInventory(String commodityId, InventoryModificationFlag flag, double delta) {
        return ResultMessage.Success;
    }

    @Override
    public CommodityPo fromVoToPo(CommodityVo commodityVo) {
        return new CommodityPo(commodityVo.getId(),commodityVo.getName(),commodityVo.getType(),commodityVo.getAmount(),
                commodityVo.getProductionDate(),commodityVo.getBatch(),commodityVo.getBatchNo(),commodityVo.getPurchasePrice(),
                commodityVo.getRecentPurchasePrice(),commodityVo.getRetailPrice(),commodityVo.getRecentRetailPrice(),
                commodityVo.getWarningValue());
    }

    @Override
    public CommodityVo fromPoToVo(CommodityPo commodityPo) {
        return new CommodityVo(commodityPo.getId(),commodityPo.getName(),commodityPo.getType(),commodityPo.getAmount(),
                commodityPo.getProductionDate(),commodityPo.getBatch(),commodityPo.getBatchNo(),commodityPo.getPurchasePrice(),
                commodityPo.getRecentPurchasePrice(),commodityPo.getRetailPrice(),commodityPo.getRecentRetailPrice(),
                commodityPo.getWarningValue());
    }
}
