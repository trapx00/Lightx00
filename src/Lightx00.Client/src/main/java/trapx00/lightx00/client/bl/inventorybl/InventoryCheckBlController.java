package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.commoditybl.CommodityInfo;
import trapx00.lightx00.client.bl.commoditybl.factory.CommodityInfoFactory;
import trapx00.lightx00.client.bl.logbl.LogService;
import trapx00.lightx00.client.bl.logbl.factory.LogServiceFactory;
import trapx00.lightx00.client.bl.salebl.SaleBillBlInfo;
import trapx00.lightx00.client.bl.salebl.factory.SaleBillBlInfoFactory;
import trapx00.lightx00.client.bl.util.ExcelOutput;
import trapx00.lightx00.client.bl.util.FormatDateTime;
import trapx00.lightx00.client.bl.util.PoVoConverter;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.client.datafactory.inventorydataservicefactory.InventoryCheckDataServiceFactory;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryViewVo;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPictureItem;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;
import trapx00.lightx00.shared.po.log.LogSeverity;


import java.util.Date;

public class InventoryCheckBlController implements InventoryCheckBlService {

    private LogService logService = LogServiceFactory.getLogService();
    private InventoryCheckDataService dataService= InventoryCheckDataServiceFactory.getService();
    private CommodityInfo commodityInfo= CommodityInfoFactory.getCommodityInfo();
    private SaleBillBlInfo saleBillBlInfo= SaleBillBlInfoFactory.getSaleBillBlInfo();
    private PoVoConverter<CommodityPo,CommodityVo> commodityConver=CommodityInfoFactory.getPoVoConverter();

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
    public InventoryPictureVo getInventoryPicture() {
        CommodityVo[] commodidtyVos=commodityInfo.getAllCommodity();
        InventoryPictureItem[] inventoryPictureItems=new InventoryPictureItem[commodidtyVos.length];
        for(int i=0;i<inventoryPictureItems.length;i++){
            inventoryPictureItems[i]=new InventoryPictureItem(commodityConver.fromVoToPo(commodidtyVos[i]));
        }
        InventoryPictureVo inventoryPictureVo=new InventoryPictureVo(new Date(),inventoryPictureItems);
        logService.log(LogSeverity.Success,FormatDateTime.toShortDateString(new Date())+"库存盘点完毕");
        return inventoryPictureVo;
    }

    /**
     * Exports the inventory snapshot to the required file by excel
     * @param path
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(String path) {
        InventoryPictureVo operPicture=this.getInventoryPicture();
        String[]output=new String[operPicture.getItems().length+1];
        output[0]="名称-型号-库存数量-库存均价-批次-批号-出厂日期";
        for(int i=0;i<operPicture.getItems().length;i++){
            output[i+1]=operPicture.getItems()[i].getName()+"-"+operPicture.getItems()[i].getType()+"-"+
                    operPicture.getItems()[i].getAmount()+"-"+operPicture.getItems()[i].getPrice()+"-"+
                    operPicture.getItems()[i].getBatch()+"-"+operPicture.getItems()[i].getBatchNo()+"-"+
                    FormatDateTime.toShortDateString(operPicture.getItems()[i].getDate());
        }
        try{
            ResultMessage opResult= ExcelOutput.createExcel(path,output,"库存快照");
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
