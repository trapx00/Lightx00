package trapx00.lightx00.shared.po.financestaff;

public class  ReceivalPaymentBillPOBase extends FinancialBillPO {
    String ID; //收款单格式是SKD-yyyyMMDD-00001，付款单格式是FKD-yyyyMMDD-00001
    String clientID;
    String operatorID;
    Transcation[] transcations;
    double total;
}
