package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.draftbl.DraftQueryService;

public class BillDraftQueryServiceFactory {
    private static DraftQueryService queryService = TradeHistoryBlFactory.getController();

    public static DraftQueryService getQueryService() {
        return queryService;
    }
}
