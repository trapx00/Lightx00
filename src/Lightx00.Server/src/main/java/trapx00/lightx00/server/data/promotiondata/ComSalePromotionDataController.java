package trapx00.lightx00.server.data.promotiondata;

import trapx00.lightx00.shared.dataservice.promotiondataservice.ComSalePromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;
import trapx00.lightx00.shared.queryvo.ComSalePromotionQueryVo;
import trapx00.lightx00.shared.queryvo.TotalPricePromotionQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class ComSalePromotionDataController extends UnicastRemoteObject implements ComSalePromotionDataService {
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
    protected ComSalePromotionDataController() throws RemoteException {
    }

    /**
     * Submit a completed ComSalePromotionPo.
     * @param promotion the ComSalePromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ComSalePromotionPo promotion) {
        return null;
    }

    /**
     * Filter ComSalePromotionPo.
     * @param query the filter conditions
     * @return array of ComSalePromotionPo which match the conditions
     */
    public ComSalePromotionPo[] queryPromotion(ComSalePromotionQueryVo query) {
        return new ComSalePromotionPo[0];
    }

    /**
     * Delete a useless ComSalePromotionPo.
     * @param promotion the ComSalePromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ComSalePromotionPo promotion) {
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
