package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.commoditybl.CommodityInfo;
import trapx00.lightx00.client.bl.commoditybl.factory.CommodityInfoFactory;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseBillBlInfoFactory;
import trapx00.lightx00.client.bl.logbl.LogService;
import trapx00.lightx00.client.bl.logbl.factory.LogServiceFactory;
import trapx00.lightx00.client.bl.salebl.SaleBillBlInfo;
import trapx00.lightx00.client.bl.salebl.factory.SaleBillBlInfoFactory;
import trapx00.lightx00.client.bl.util.ExcelOutput;
import trapx00.lightx00.client.bl.util.FormatDateTime;
import trapx00.lightx00.client.bl.util.PoVoConverter;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.client.vo.inventorystaff.*;
import trapx00.lightx00.client.vo.salestaff.PurchaseBillVo;
import trapx00.lightx00.client.vo.salestaff.PurchaseRefundBillVo;
import trapx00.lightx00.client.vo.salestaff.SaleBillVo;
import trapx00.lightx00.client.vo.salestaff.SaleRefundBillVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.queryvo.PurchaseBillQueryVo;
import trapx00.lightx00.shared.queryvo.PurchaseRefundBillQueryVo;
import trapx00.lightx00.shared.queryvo.SaleBillQueryVo;
import trapx00.lightx00.shared.queryvo.SaleRefundBillQueryVo;

import java.util.Date;

public class InventoryCheckBlController implements InventoryCheckBlService {

    private LogService logService = LogServiceFactory.getLogService();
    private CommodityInfo commodityInfo= CommodityInfoFactory.getCommodityInfo();
    private SaleBillBlInfo saleBillBlInfo= SaleBillBlInfoFactory.getSaleBillBlInfo();
    private PurchaseBillBlInfo purchaseBillBlInfo= PurchaseBillBlInfoFactory.getPurchaseBillBlInfo();
    private PoVoConverter<CommodityPo,CommodityVo> commodityConver=CommodityInfoFactory.getPoVoConverter();

    /**
     * Checks the invenntory change between the begintime and endtime
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time rangeget
     */
    @Override
    public InventoryViewVo getInventoryView(Date beginTime, Date endTime) {
        PurchaseBillVo [] purchaseBillVos=purchaseBillBlInfo.queryPurchaseBillVo(new PurchaseBillQueryVo()
                .between("date",beginTime,endTime));
        PurchaseRefundBillVo[] purchaseRefundBillVos=purchaseBillBlInfo.queryPurchaseRefundBillVo(new PurchaseRefundBillQueryVo()
                .between("date",beginTime,endTime));
        SaleBillVo[]saleBillVos=saleBillBlInfo.querySaleBill(new SaleBillQueryVo()
                .between("date",beginTime,endTime));
        SaleRefundBillVo[] saleRefundBillVos=saleBillBlInfo.querySaleRefundBill(new SaleRefundBillQueryVo()
                .between("date",beginTime,endTime).and());

        InventoryViewVo inventoryViewVo=new InventoryViewVo("View"+FormatDateTime.toShortDateString(new Date()),new Date(),null);
        InventoryViewItem inventoryViewItem=new InventoryViewItem(new Date(),0,
                0,0,0,0,0,
                0);
        System.out.println(saleBillVos.length);
        System.out.println(saleBillVos[0].getCommodityList()[0].getNumber());
        for(int i=0;i<purchaseBillVos.length;i++){
            for(int j=0;j<purchaseBillVos[i].getCommodityList().length;j++) {
                inventoryViewItem.setInventoryAmount(inventoryViewItem.getInventoryAmount() + purchaseBillVos[i].getCommodityList()[j].getNumber());
                inventoryViewItem.setInventoryMoney(inventoryViewItem.getOutOfInVentoryMoney() + purchaseBillVos[i].getCommodityList()[j].getPrice()
                        *purchaseBillVos[i].getCommodityList()[j].getNumber());
            }
        }
        for(int i=0;i<purchaseRefundBillVos.length;i++){
            for(int j=0;j<purchaseRefundBillVos[i].getCommodityList().length;j++) {
                inventoryViewItem.setOutOfInventoryAmount(inventoryViewItem.getOutOfInVentoryMoney() + purchaseRefundBillVos[i].getCommodityList()[j].getNumber());
                inventoryViewItem.setOutOfInVentoryMoney(inventoryViewItem.getOutOfInVentoryMoney() + purchaseRefundBillVos[i].getCommodityList()[j].getPrice()
                        *purchaseRefundBillVos[i].getCommodityList()[j].getNumber());
            }
        }

        for(int i=0;i<saleBillVos.length;i++){
            for(int j=0;j<saleBillVos[i].getCommodityList().length;j++) {
                inventoryViewItem.setOutOfInventoryAmount(inventoryViewItem.getOutOfInVentoryMoney() + saleBillVos[i].getCommodityList()[j].getNumber());
                inventoryViewItem.setOutOfInVentoryMoney(inventoryViewItem.getOutOfInVentoryMoney() + saleBillVos[i].getCommodityList()[j].getPrice()
                        *saleBillVos[i].getCommodityList()[j].getNumber());
            }
        }

        for(int i=0;i<saleRefundBillVos.length;i++){
            for(int j=0;j<saleRefundBillVos[i].getCommodityList().length;j++) {
                inventoryViewItem.setInventoryAmount(inventoryViewItem.getInventoryAmount() + saleRefundBillVos[i].getCommodityList()[j].getNumber());
                inventoryViewItem.setInventoryMoney(inventoryViewItem.getOutOfInVentoryMoney() + saleRefundBillVos[i].getCommodityList()[j].getPrice()
                        *saleRefundBillVos[i].getCommodityList()[j].getNumber());
            }
        }

        inventoryViewItem.setSum(inventoryViewItem.getInventoryAmount()-inventoryViewItem.getOutOfInventoryAmount());
        inventoryViewItem.setInSoldPrice(inventoryViewItem.getInventoryMoney()/inventoryViewItem.getInventoryAmount());
        inventoryViewItem.setOutSoldPrice(inventoryViewItem.getOutOfInVentoryMoney()/inventoryViewItem.getOutOfInventoryAmount());
        inventoryViewVo.setItems(inventoryViewItem);
        System.out.println(inventoryViewVo.getItems().getInventoryAmount());
        System.out.println(inventoryViewVo.getItems().getSum());
        return inventoryViewVo;



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
