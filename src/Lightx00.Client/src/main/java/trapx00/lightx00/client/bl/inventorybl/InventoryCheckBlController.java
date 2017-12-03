package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.logbl.LogService;
import trapx00.lightx00.client.bl.logbl.factory.LogServiceFactory;
import trapx00.lightx00.client.bl.salebl.SaleBillBlInfo;
import trapx00.lightx00.client.bl.salebl.factory.SaleBillBlInfoFactory;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.client.datafactory.inventorydataservicefactory.InventoryCheckDataServiceFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryViewVo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;
import trapx00.lightx00.shared.po.log.LogSeverity;


import java.util.Date;

public class InventoryCheckBlController implements InventoryCheckBlService {

    private LogService logService = LogServiceFactory.getLogService();
    private InventoryCheckDataService dataService= InventoryCheckDataServiceFactory.getService();
    private SaleBillBlInfo saleBillBlInfo= SaleBillBlInfoFactory.getSaleBillBlInfo();

    public InventoryViewVo fromPoToVo(InventoryViewPo po) {
        return new InventoryViewVo(po.getId(), po.getTime(),po.getItems());

    }

    public InventoryViewPo fromVoToPo(InventoryViewVo vo) {
        return new InventoryViewPo(vo.getId(),vo.getTime(),vo.getItems());
    }

    /**
     * Checks the invenntory change between the begintime and endtime
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time rangeget
     */
    @Override
    public InventoryViewVo[] getInventoryView(Date beginTime, Date endTime) {
       return null;
    }

    /**
     * Gets the inventory snapshot
     * @return The inventory snapshot during that day
     */
    @Override
    public InventoryPictureVo[] getInventoryPicture() {
             return null;

    }

    /**
     * Exports the inventory snapshot to the required file by excel
     * @param path
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(String path) {
        /**  //  public static void main (String[]args){
         //    String[]outputMessage={"名称-型号-库存数量-库存均价-批次-批号","nan-led-123-45-No.1-Batch2",
         //            "nan-led-123-45-No.1-Batch2","nan-led-123-45-No.1-Batch2","nan-led-123-45-No.1-Batch2","nan-led-123-45-No.1-Batch2",
         //            "nan-led-123-45-No.1-Batchqwe","nan-led-12223-45-No.1-Batc123h2","nan-led-123-45-No.1-Batch2"};
         //    String path="C:\\Users\\liangnan\\Desktop";
         //    String name="库存盘点";
         //     ExcelOutput.createExcel(path,outputMessage,name);
         //  }**/
        InventoryPictureVo[] inventoryPicture=this.getInventoryPicture();
        InventoryPictureVo operPicture=inventoryPicture[0];
        try{
            ResultMessage opResult=ResultMessage.Success;
            //= ExcelOutput.createExcel(path,operPicture);
            if (opResult.isSuccess()) {
                logService.log(LogSeverity.Success, String.format("导出成功"));
            } else {
                logService.log(LogSeverity.Failure, String.format("导出失败"));
            }
        }catch(Exception e){
            logService.log(LogSeverity.Failure, String.format( "导出excel失败，原因位置错误，具体信息是%s。", e.getMessage()));
            throw e;
        }

        return ResultMessage.Success;
    }



}
