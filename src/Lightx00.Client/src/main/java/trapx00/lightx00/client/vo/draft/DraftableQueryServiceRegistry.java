package trapx00.lightx00.client.vo.draft;

import trapx00.lightx00.client.bl.draftbl.DraftableQueryService;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.shared.po.draft.DraftPo;
import trapx00.lightx00.shared.po.draft.DraftType;
import trapx00.lightx00.shared.queryvo.DraftQueryVo;

import java.util.HashMap;

public class DraftableQueryServiceRegistry {
    private static HashMap<DraftType, DraftableQueryService> registry = new HashMap<>();

    /**
     * Registers DraftType with service.
     * @param draftType DraftType
     * @param service DraftableQueryService
     */
    public static void register(DraftType draftType, DraftableQueryService service) {
        registry.put(draftType, service);
    }

    /**
     * Queries Draftable with registered service.
     * @param draftType DraftType
     * @param id id for the draft
     * @return Draftable
     */

    public static Draftable queryDraftable(DraftType draftType, String id) {
        return registry.get(draftType).queryDraft(id);
    }

}
