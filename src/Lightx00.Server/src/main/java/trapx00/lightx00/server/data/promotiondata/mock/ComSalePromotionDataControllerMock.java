package trapx00.lightx00.server.data.promotiondata.mock;

import trapx00.lightx00.server.data.promotiondata.ComSalePromotionDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.util.Date;

public class ComSalePromotionDataControllerMock extends ComSalePromotionDataController {


    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     *
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    public ComSalePromotionDataControllerMock() throws RemoteException {
    }

    /**
     * submit a completed ComSalePromotionPo
     * @param promotion the ComSalePromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ComSalePromotionPo promotion){
        return ResultMessage.Success;
    }

    /**
     * filter ComSalePromotionPo
     * @param query the filter conditions
     * @return array of ComSalePromotionPo which match the conditions
     */
    public ComSalePromotionPo[] queryPromotion(PromotionQueryVo query) {
        return new ComSalePromotionPo[]{
                new ComSalePromotionPo("0001",new Date(),new Date(), PromotionState.Waiting,null,0)
        };
    }


    /**
     * delete a useless ComSalePromotionPo
     * @param promotion the ComSalePromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ComSalePromotionPo promotion) {
        return ResultMessage.Success;
    }

    /**
     * get id for the next promotion
     *
     * @return id for the next promotion
     */
    public String getId(){
        return "0001";
    }
}
