package trapx00.lightx00.server.data.promotiondata;

import trapx00.lightx00.shared.dataservice.promotiondataservice.ClientPromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class ClientPromotionDataController extends UnicastRemoteObject implements ClientPromotionDataService {
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
    protected ClientPromotionDataController() throws RemoteException {
    }

    /**
     * Submit a completed ClientPromotionPo.
     * @param promotion the ClientPromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ClientPromotionPo promotion) {
        return null;
    }

    /**
     * Filter ClientPromotionPo.
     * @param query the filter conditions
     * @return array of ClientPromotionPo which match the conditions
     */
    public ClientPromotionPo[] queryPromotion(PromotionQueryVo query) {
        return new ClientPromotionPo[0];
    }

    /**
     * Delete a useless promotion.
     * @param promotion the promotion to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ClientPromotionPo promotion) {
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
