package trapx00.lightx00.client.vo.draft;

import trapx00.lightx00.client.bl.draftbl.DraftableQueryService;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.shared.po.draft.DraftType;

import java.util.HashMap;

public class DraftableQueryServiceRegistry {
    private static HashMap<DraftType, DraftableQueryService> map = new HashMap<>();

    public static void register(DraftType draftType, DraftableQueryService service) {
        map.put(draftType, service);
    }

    public static Draftable queryDraftable(DraftType draftType, String id) {
        DraftableQueryService queryService = map.get(draftType);
        if (queryService != null) {
            return queryService.queryDraft(id);
        } else {
            return null;
        }
    }
}
