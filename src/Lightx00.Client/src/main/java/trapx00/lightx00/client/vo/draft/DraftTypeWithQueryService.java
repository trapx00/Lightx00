package trapx00.lightx00.client.vo.draft;

import trapx00.lightx00.client.bl.draftbl.DraftQueryService;
import trapx00.lightx00.client.bl.financebl.factory.BillDraftQueryServiceFactory;
import trapx00.lightx00.shared.po.draft.DraftType;

public enum DraftTypeWithQueryService {
    //Client
    //Promotion
    Bill(BillDraftQueryServiceFactory.getQueryService());

    private DraftQueryService queryService;

    DraftTypeWithQueryService(DraftQueryService queryService) {
        this.queryService = queryService;
    }

    public static DraftTypeWithQueryService fromDraftType(DraftType draftType) {
        return DraftTypeWithQueryService.valueOf(draftType.toString());
    }


    public DraftQueryService getQueryService() {
        return queryService;
    }
}
