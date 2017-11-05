package trapx00.lightx00.client.bl.financebl;

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
