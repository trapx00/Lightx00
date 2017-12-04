package trapx00.lightx00.client.test.bl.inventorybl;

import org.junit.Test;
import trapx00.lightx00.client.bl.inventorybl.PurchaseRefundBillBlController;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseBillBlFactory;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseRefundBillBlFactory;
import trapx00.lightx00.client.bl.inventorybl.mock.PurchaseRefundBillBlControllerMock;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.*;

public class PurchaseRefundBillBlControllerTest {

    PurchaseRefundBillBlController purchaseRefundBillBlController = PurchaseRefundBillBlFactory.getPurchaseRefundBillBlController();

}