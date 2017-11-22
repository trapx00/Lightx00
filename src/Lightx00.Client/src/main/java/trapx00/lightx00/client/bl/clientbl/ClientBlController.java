package trapx00.lightx00.client.bl.clientbl;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.draftbl.DraftableQueryService;
import trapx00.lightx00.client.blservice.clientblservice.ClientBlService;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.shared.po.ClientModificationFlag;
import trapx00.lightx00.shared.po.ResultMessage;

public class ClientBlController implements ClientBlService, DraftDeleteService, ClientModificationService, DraftableQueryService, ClientQueryService {

    /**
     * Deletes a draft.
     *
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return null;
    }

    /**
     * Query clients which includes the words
     *
     * @param query condition
     * @return the clients which corresponds to the query
     */
    @Override
    public ClientVo[] query(String query) {
        return new ClientVo[0];
    }

    /**
     * Saves a half-completed client as draft.
     *
     * @param client ClientVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(ClientVo client) {
        return null;
    }

    /**
     * Gets the id for the next client
     *
     * @return id for the next client
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * modify a client
     *
     * @param client to be modified
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(ClientVo client) {
        return null;
    }

    /**
     * add a client
     *
     * @param client to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(ClientVo client) {
        return null;
    }

    /**
     * delete some clients
     *
     * @param id of the client to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(String[] id) {
        return null;
    }

    /**
     * modify the pay or receive of client
     *
     * @param clientId the id of the client
     * @param flag     to pay or to receive
     * @param delta    to alter number
     * @return Result:SECCESS or FAILED
     */
    @Override
    public ResultMessage modifyClient(String clientId, ClientModificationFlag flag, double delta) {
        return null;
    }

    /**
     * Queries draft with id.
     *
     * @param id id
     * @return draft
     */
    @Override
    public Draftable queryDraft(String id) {
        return null;
    }
}
