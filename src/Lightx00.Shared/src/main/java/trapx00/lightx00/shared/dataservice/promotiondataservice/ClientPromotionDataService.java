package trapx00.lightx00.shared.dataservice.promotiondataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;
import trapx00.lightx00.shared.queryvo.Promotion.ClientPromotionQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientPromotionDataService extends Remote {
    /**
     * Submit a completed ClientPromotionPo.
     * @param promotion the ClientPromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(ClientPromotionPo promotion)throws RemoteException;

    /**
     * Filter ClientPromotionPo.
     * @param query the filter conditions
     * @return array of ClientPromotionPo which match the conditions
     */
    ClientPromotionPo[] queryPromotion(ClientPromotionQueryVo query)throws RemoteException;

    /**
     * Delete a useless ClientPromotionPo.
     * @param id id of the ClientPromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(String id)throws RemoteException;

    /**
     * Get id for the next promotion.
     *
     * @return id for the next promotion
     */
    String getId()throws RemoteException;
}
