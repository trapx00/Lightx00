package trapx00.lightx00.server.data.promotiondata.Mock;

import trapx00.lightx00.server.data.promotiondata.TotalPricePromotionDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;

public class TotalPricePromotionDataControllerMock extends TotalPricePromotionDataController {

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
    protected TotalPricePromotionDataControllerMock() throws RemoteException {
    }

    /**
     * submit a completed TotalPricePromotionPo
     * @param promotion the TotalPricePromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(TotalPricePromotionPo promotion){
        return super.submit(promotion);
    }

    /**
     * filter TotalPricePromotionPo
     * @param query the filter conditions
     * @return array of TotalPricePromotionPo which match the conditions
     */
    public TotalPricePromotionPo[] queryPromotion(PromotionQueryVo query) {
        return super.queryPromotion(query);
    }

    /**
     * delete a useless TotalPricePromotionPo
     * @param promotion the TotalPricePromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(TotalPricePromotionPo promotion) {
        return super.delete(promotion);
    }

    /**
     * get id for the next promotion
     *
     * @return id for the next promotion
     */
    public String getId(){
        return super.getId();
    }
}
