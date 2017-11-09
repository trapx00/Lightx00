package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.financebl.FinanceBillInfo;
import trapx00.lightx00.client.bl.financebl.TradeHistoryBlController;

public class FinanceBillInfoFactory {
    private static FinanceBillInfo instance = new TradeHistoryBlController();

    /**
     * Gets a FinanceBillInfo instance
     * @return FinanceBillInfo instance
     */
    public static FinanceBillInfo getInstance() {
        return instance;
    }
}
