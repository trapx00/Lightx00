package trapx00.lightx00.client.vo.draft;

import trapx00.lightx00.client.bl.draftbl.DraftableQueryService;
import trapx00.lightx00.client.bl.financebl.factory.BillDraftQueryServiceFactory;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.shared.po.draft.DraftType;

public enum DraftTypeWithQueryService {
    //Client
    //Promotion
    Bill(BillDraftQueryServiceFactory.getQueryService());

    private DraftableQueryService queryService;

    DraftTypeWithQueryService(DraftableQueryService queryService) {
        this.queryService = queryService;
    }

    public static DraftTypeWithQueryService fromDraftType(DraftType draftType) {
        return DraftTypeWithQueryService.valueOf(draftType.toString());
    }

    public Draftable query(String id) {
        return this.queryService.queryDraft(id);
    }


    public DraftableQueryService getQueryService() {
        return queryService;
    }
}
