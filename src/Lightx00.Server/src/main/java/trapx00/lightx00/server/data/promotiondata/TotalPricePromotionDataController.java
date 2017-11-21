package trapx00.lightx00.server.data.promotiondata;

import trapx00.lightx00.shared.dataservice.promotiondataservice.TotalPricePromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.queryvo.TotalPricePromotionQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class TotalPricePromotionDataController extends UnicastRemoteObject implements TotalPricePromotionDataService {

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
    protected TotalPricePromotionDataController() throws RemoteException {
    }

    /**
     * Submit a completed TotalPricePromotionPo.
     * @param promotion the TotalPricePromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(TotalPricePromotionPo promotion) {
        return null;
    }

    /**
     * Filter TotalPricePromotionPo.
     * @param query the filter conditions
     * @return array of TotalPricePromotionPo which match the conditions
     */
    public TotalPricePromotionPo[] queryPromotion(TotalPricePromotionQueryVo query) {
        return new TotalPricePromotionPo[0];
    }

    /**
     * Delete a useless TotalPricePromotionPo.
     * @param promotion the TotalPricePromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(TotalPricePromotionPo promotion) {
        return null;
    }

    /**
     * Get id for the next promotion.
     *
     * @return id for the next promotion
     */
    public String getId() {
        return null;
    }
}
