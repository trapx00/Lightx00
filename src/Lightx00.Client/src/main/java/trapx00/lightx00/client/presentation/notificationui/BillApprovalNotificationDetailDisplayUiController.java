package trapx00.lightx00.client.presentation.notificationui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import trapx00.lightx00.client.bl.notificationbl.factory.NotificationBlFactory;
import trapx00.lightx00.client.blservice.notificationblservice.NotificationBlService;
import trapx00.lightx00.client.blservice.notificationblservice.NotificationBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.client.vo.notification.billapproval.BillApprovalNotificationVo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.util.DateHelper;

import java.awt.*;
import java.io.IOException;

@SuppressWarnings("unchecked")
public class BillApprovalNotificationDetailDisplayUiController extends NotificationDetailUi<BillApprovalNotificationVo> {
    public JFXButton btnAcknowledge;
    public JFXButton btnModify;
    public JFXButton btnBack;
    public JFXTextField tfDate;
    public JFXTextField tfBillId;
    public JFXTextField tfSender;
    public JFXTextField tfId;
    public JFXButton btnAbandon;
    public JFXTextField tfResult;

    private BillVo billVo;
    private BillApprovalNotificationVo notificationVo;

    @Override
    public ExternalLoadedUiPackage showContent(BillApprovalNotificationVo arg) {
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        BillApprovalNotificationDetailDisplayUiController controller = externalLoadedUiPackage.getController();
        controller.tfId.setText(String.valueOf(arg.getId()));
        controller.tfDate.setText(DateHelper.fromDate(arg.getDate()));
        controller.tfSender.setText(arg.getSender().getName());
        controller.tfBillId.setText(arg.getBill().getId());
        controller.billVo = arg.getBill();
        controller.tfResult.setText(arg.getBill().getState().toString());
        if (arg.getBill().getState().equals(BillState.Rejected)) {
            controller.btnAcknowledge.setDisable(true);
        }
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
            close();
        }
    }

    public void onBtnBackClicked(ActionEvent actionEvent) {
        if (onIgnoreClicked != null) {
            onIgnoreClicked.accept(notificationVo);
        }
    }

    private void abandon() {
        notificationVo.operationService().abandon(notificationVo);
    }

    public void onBtnModifyClicked(ActionEvent actionEvent) {
        try {
            ExternalLoadedUiPackage uiPackage = billVo.continueWritableUi().continueWriting(billVo);
            FrameworkUiManager.switchFunction(uiPackage.getController(), "修改单据",true);
            close();
            abandon();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onBtnAbandonClicked(ActionEvent actionEvent) {
        abandon();
    }

    public void onTfBillIdClicked(MouseEvent mouseEvent) {
        PromptDialogHelper.start("单据详情","")
            .setContent(billVo.billDetailUi().showContent(billVo).getComponent())
            .createAndShow();
    }
}
