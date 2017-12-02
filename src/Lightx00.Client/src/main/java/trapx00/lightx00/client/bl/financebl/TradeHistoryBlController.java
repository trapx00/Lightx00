package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.client.bl.draftbl.DraftableQueryService;
import trapx00.lightx00.client.bl.financebl.factory.SpecificFinanceBillQueryFactory;
import trapx00.lightx00.client.bl.inventorybl.PurchaseBillBlInfo;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseBillBlInfoFactory;
import trapx00.lightx00.client.bl.salebl.SaleBillBlInfo;
import trapx00.lightx00.client.bl.salebl.factory.SaleBillBlInfoFactory;
import trapx00.lightx00.client.blservice.financeblservice.TradeHistoryBlService;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.queryvo.FinanceBillQueryVo;
import trapx00.lightx00.client.vo.financestaff.FinanceBillVo;
import trapx00.lightx00.client.vo.financestaff.TradeHistoryQueryVo;
import trapx00.lightx00.client.vo.financestaff.TradeHistoryVo;

public class TradeHistoryBlController implements TradeHistoryBlService, FinanceBillInfo, BillInfo,  DraftableQueryService {
    private CashBillInfo cashBillInfo = SpecificFinanceBillQueryFactory.getCashbillInfo();
    private PaymentBillInfo paymentBillInfo = SpecificFinanceBillQueryFactory.getPaymentBillInfo();
    private ReceivalBillInfo receivalBillInfo = SpecificFinanceBillQueryFactory.getReceivalBillInfo();
    private PurchaseBillBlInfo purchaseBillBlInfo = PurchaseBillBlInfoFactory.getPurchaseBillBlInfo();
    private SaleBillBlInfo saleBillBlInfo = SaleBillBlInfoFactory.getSaleBillBlInfo();

    /**
     * Queries FinanceBill
     *
     * @param query FinanceBill query condition
     * @return Finance bills that match query condition
     */
    @Override
    public FinanceBillVo[] query(FinanceBillQueryVo query) {

        return cashBillInfo.query(query.getSpecificFinanceBillQueryVo(FinanceBillType.CashBill));
    }

    /**
     * Queries a TradeHistory
     *
     * @param query TradeHistory query condition
     * @return TradeHistory that matches query condition
     */
    @Override
    public TradeHistoryVo query(TradeHistoryQueryVo query) {
        return null;
    }

    /**
     * Export a TradeHistory
     *
     * @param tradeHistory TradeHistory to be exported
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(TradeHistoryVo tradeHistory) {
        return null;
    }



    /**
     * Queries Bill with id.
     *
     * @param id bill id
     * @return BillVos that has the
     */
    @Override
    public BillVo queryBill(String id) {
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
        return queryBill(id);
    }
}
