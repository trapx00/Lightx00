package trapx00.lightx00.client.presentation.notificationui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.client.vo.notification.billapproval.BillApprovalNotificationVo;
import trapx00.lightx00.shared.util.DateHelper;

import java.io.IOException;

@SuppressWarnings("unchecked")
public class BillApprovalNotificationDetailDisplayUiController extends NotificationDetailUi<BillApprovalNotificationVo> {
    public JFXButton btnAcknowledge;
    public JFXButton btnModify;
    public JFXButton btnBack;
    public JFXTextField tfDate;
    public JFXTextField tfBillId;
    public JFXButton btnBillDetail;
    public JFXTextField tfSender;
    public JFXTextField tfId;

    private BillVo billVo;
    private BillApprovalNotificationVo notificationVo;


    @Override
    public ExternalLoadedUiPackage showContent(BillApprovalNotificationVo arg) {
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        BillApprovalNotificationDetailDisplayUiController controller = (BillApprovalNotificationDetailDisplayUiController) externalLoadedUiPackage.getController();
        controller.tfId.setText(String.valueOf(arg.getId()));
        controller.tfDate.setText(DateHelper.fromDate(arg.getDate()));
        controller.tfSender.setText(arg.getSender().getName());
        controller.tfBillId.setText(arg.getBill().getId());
        controller.btnBillDetail.setOnAction(e -> {
            controller.currentDialog.close();
            JFXDialog dialog = PromptDialogHelper.start("","").create(controller.dialogContainer);
            ExternalLoadedUiPackage externalLoadedUiPackage1 = (arg.getBill()).billDetailUi().showContent(arg.getBill());
            BillDetailUi billDetailUi = (BillDetailUi) externalLoadedUiPackage1.getController();
            billDetailUi.setCurrentDialog(dialog);
            billDetailUi.setFatherDialog(controller.currentDialog);
            dialog.setContent((Region) externalLoadedUiPackage1.getComponent());
            dialog.show();
        });
        controller.billVo = arg.getBill();
        controller.notificationVo = arg;
        return externalLoadedUiPackage;
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load(){
        return new UiLoader("/fxml/notificationui/BillApprovalNotificationDetailDisplayUi.fxml").loadAndGetPackageWithoutException();
    }

    public void onBtnAcknowledgeClicked(ActionEvent actionEvent) {
        billVo.notificationActivateService().activate(billVo.getId());

        if (onAcknowledgeClicked != null) {
            onAcknowledgeClicked.accept(notificationVo);
        }
    }

    public void onBtnBackClicked(ActionEvent actionEvent) {
        if (onIgnoreClicked != null) {
            onIgnoreClicked.accept(notificationVo);
        }
    }

    public void onBtnModifyClicked(ActionEvent actionEvent) {
        try {
            billVo.continueWritableUi().continueWriting(billVo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
