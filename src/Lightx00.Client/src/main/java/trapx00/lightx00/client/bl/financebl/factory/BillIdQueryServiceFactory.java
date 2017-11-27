package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.financebl.BillIdQueryService;

public class BillIdQueryServiceFactory {
    private static BillIdQueryService billIdQueryService = TradeHistoryBlFactory.getController();

    public static BillIdQueryService getBillIdQueryService() {
        return billIdQueryService;
    }
}
