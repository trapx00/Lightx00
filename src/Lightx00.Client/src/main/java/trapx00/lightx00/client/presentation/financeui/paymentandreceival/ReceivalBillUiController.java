package trapx00.lightx00.client.presentation.financeui.paymentandreceival;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;
import org.bridj.cpp.com.VARIANT;
import trapx00.lightx00.client.bl.financebl.factory.ReceivalBillBlFactory;
import trapx00.lightx00.client.blservice.financeblservice.ReceivalBillBlService;
import trapx00.lightx00.client.presentation.adminui.EmployeeSelection;
import trapx00.lightx00.client.presentation.adminui.factory.UserManagementUiFactory;
import trapx00.lightx00.client.presentation.bankaccountui.BankAccountSelection;
import trapx00.lightx00.client.presentation.bankaccountui.factory.BankAccountUiFactory;
import trapx00.lightx00.client.presentation.clientui.ClientInfoUi;
import trapx00.lightx00.client.presentation.clientui.factory.ClientInfoUiFactory;
import trapx00.lightx00.client.presentation.financeui.TranscationModel;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.financestaff.BankAccountVo;
import trapx00.lightx00.client.vo.financestaff.PaymentBillVo;
import trapx00.lightx00.client.vo.financestaff.ReceivalBillVo;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.exception.database.NoMoreBillException;
import trapx00.lightx00.shared.exception.presentation.NotCompleteException;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.Transcation;
import trapx00.lightx00.shared.util.BillHelper;
import trapx00.lightx00.shared.util.DateHelper;

import java.util.Date;

public class ReceivalBillUiController extends PaymentAndReceivalUiController {
    public ReceivalBillUiController() {
        super(ReceivalBillBlFactory.getController(), ReceivalBillVo.class);
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/financeui/ReceivalBillUi.fxml").loadAndGetPackageWithoutException();
    }

}
