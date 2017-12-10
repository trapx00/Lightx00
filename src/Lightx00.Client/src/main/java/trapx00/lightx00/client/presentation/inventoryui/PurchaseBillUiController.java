package trapx00.lightx00.client.presentation.inventoryui;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.StackPane;
import trapx00.lightx00.client.presentation.clientui.ClientInfoUi;
import trapx00.lightx00.client.presentation.clientui.factory.ClientInfoUiFactory;
import trapx00.lightx00.client.presentation.financeui.CashBillItemModel;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.client.vo.salestaff.PurchaseBillVo;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.po.salestaff.CommodityItem;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PurchaseBillUiController implements DraftContinueWritableUiController, ExternalLoadableUiController, ReversibleUi {

    public StackPane mainPane;
    public JFXTextField tfBillId;
    public JFXTextField tfOperatorId;
    public JFXTextField tfClientId;
    public JFXComboBox<Integer> cbRepository;
    public JFXTextField tfBillTotal;
    public JFXTextField tfComment;
    public JFXTreeTableColumn<CommodityItemModel, String> tcCommodityIdColumn;
    public JFXTreeTableColumn<CommodityItemModel, String> tcCommodityNameColumn;
    public JFXTreeTableColumn<CommodityItemModel, String> tcCommodityTypeColumn;
    public JFXTreeTableColumn<CommodityItemModel, Double> tcCommodityNumberColumn;
    public JFXTreeTableColumn<CommodityItemModel, Double> tcCommodityPriceColumn;
    public JFXTreeTableColumn<CommodityItemModel, Double> tcCommodityTotalColumn;
    public JFXTreeTableColumn<CommodityItemModel, Double> tcCommodityCommentColumn;

    private ObservableList<CommodityItemModel> commodityItemModelObservableList = FXCollections.observableArrayList();
    private ClientInfoUi clientInfoUi = ClientInfoUiFactory.getClientInfoUi();

    /**
     * Start continuing write a draft. Returns a ExternalLoadableUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a ExternalLoadableUiController
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        PurchaseBillVo purchaseBillVo = (PurchaseBillVo) draft;
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        PurchaseBillUiController purchaseBillUiController = (PurchaseBillUiController) externalLoadedUiPackage.getController();
        purchaseBillUiController.tfBillId.setText(purchaseBillVo.getId());
        purchaseBillUiController.tfOperatorId.setText(purchaseBillVo.getOperatorId());
        purchaseBillUiController.tfClientId.setText(purchaseBillVo.getClientId());
        purchaseBillUiController.cbRepository.setValue(purchaseBillVo.getRepository());
        purchaseBillUiController.tfBillTotal.setText(purchaseBillVo.getTotal() + "");
        purchaseBillUiController.addCommodityListItems(purchaseBillVo.getCommodityList());
        return externalLoadedUiPackage;
    }

    public void addCommodityListItems(CommodityItem[] commodityItems) {
        for (CommodityItem commodityItem : commodityItems) {
            commodityItemModelObservableList.add(new CommodityItemModel(commodityItem));
        }
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/PurchaseBillUi.fxml").loadAndGetPackageWithoutException();
    }

    public void initialize() {
        tfOperatorId.setOnAction(event -> {
            onClientClicked();
        });
        ObservableList<Integer> integerObservableList = FXCollections.observableArrayList(
                1, 2, 3
        );
        cbRepository.setItems(integerObservableList);
    }

    /**
     * Revert a reversible.
     *
     * @param reversible reversible
     * @return External loaded ui package including a controller and the component.
     */
    @Override
    public ExternalLoadedUiPackage revertReversible(Reversible reversible) {
        return null;
    }

    @FXML
    private void onClientClicked() {
        System.out.println("run here");
        clientInfoUi.showClientSelectDialog(list -> {
        });
    }

    @FXML
    private void onDraftFunctionButtonClicked() {

    }

    @FXML
    private void onSubmitButtonClicked() {
        PromptDialogHelper.start("单据详情", null)
                .addCloseButton("确认提交", "DONE", e -> submitSuccess())
                .addCloseButton("取消", "CLOSE", null)
                .addTable(
                        ReadOnlyPairTableHelper.start()
                                .addPair("单据编号", tfBillId.getText())
                                .addPair("操作员", tfOperatorId.getText())
                                .addPair("供应商", tfClientId.getText())
                                .addPair("仓库", cbRepository.getValue() + "")
                                .addPair("总额合计", tfBillTotal.getText())
                                .addPair("备注", tfComment.getText())
                                .create())
                .create(this.mainPane)
                .show();
    }

    @FXML
    private void onCancelButtonClicked() {
        PromptDialogHelper.start("是否要存入草稿箱", null)
                .addCloseButton("存入", "DONE", null)
                .addCloseButton("不存入", "CLOSE", null)
                .addCloseButton("取消", "UNDO", null)
                .create(this.mainPane)
                .show();
    }

    @FXML
    private void submitSuccess() {
        PromptDialogHelper.start("提交成功", null)
                .addCloseButton("确定", "DONE", null)
                .create(this.mainPane)
                .show();
    }
}

