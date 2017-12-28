package trapx00.lightx00.client.presentation.promotionui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.Region;
import trapx00.lightx00.client.bl.promotionbl.PromotionInfo;
import trapx00.lightx00.client.bl.promotionbl.factory.PromotionInfoFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.client.vo.salestaff.SaleBillVo;
import trapx00.lightx00.shared.util.DateHelper;

import java.util.function.Consumer;

public class PromotionSelectionUi extends SelectingDialog implements PromotionSelection {
    public JFXTreeTableView<PromotionSelectionItemModel> tbPromotion;
    public JFXTreeTableColumn<PromotionSelectionItemModel, String> tcId;
    public JFXTreeTableColumn<PromotionSelectionItemModel, String> tcStartDate;
    public JFXTreeTableColumn<PromotionSelectionItemModel, String> tcEndDate;
    public JFXTreeTableColumn<PromotionSelectionItemModel, String> tcType;
    public JFXButton btnSelect;
    public JFXButton btnClose;

    private Consumer<PromotionVoBase> callback;
    private ObservableList<PromotionSelectionItemModel> promotionSelectionItemModelObservableList = FXCollections.observableArrayList();

    private PromotionInfo promotionInfo = PromotionInfoFactory.getPromotionInfo();
    private PromotionVoBase[] available = null;

    @FXML
    private void initialize() {
        initTable();
        update();

    }

    private void update() {
        promotionSelectionItemModelObservableList.clear();
        for(PromotionVoBase promotion:available) {
            promotionSelectionItemModelObservableList.add(new PromotionSelectionItemModel(promotion));
        }
    }


    @FXML
    private void initTable() {
        tcId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getPromotionVoObjectProperty().getId()));
        tcStartDate.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getPromotionVoObjectProperty().getStartDate())));
        tcEndDate.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getPromotionVoObjectProperty().getEndDate())));
        tcType.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().getValue().getPromotionVoObjectProperty().getType().toString()));
        TreeItem<PromotionSelectionItemModel> root = new RecursiveTreeItem<>(promotionSelectionItemModelObservableList, RecursiveTreeObject::getChildren);
        tbPromotion.setRoot(root);
        tbPromotion.setShowRoot(false);
        tbPromotion.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    @Override
    public void showEmployeeSelectDialog(Consumer<PromotionVoBase> callback, SaleBillVo bill) {
        available = promotionInfo.queryPromotion(bill);
        if(available==null){
            PromptDialogHelper.start("查询结果", "无可用促销策略！")
                    .addCloseButton("好的", "CHECK", e -> onClose())
                    .createAndShow();
        }
        else {
            ExternalLoadedUiPackage uiPackage = load();
            PromotionSelectionUi controller = (PromotionSelectionUi) uiPackage.getController();
            controller.callback = callback;
            JFXDialog dialog = PromptDialogHelper.start("", "").create();
            dialog.setContent((Region) uiPackage.getComponent());
            FrameworkUiManager.getCurrentDialogStack().pushAndShow(dialog);
        }
    }

    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/managerui/PromotionInfoUi.fxml").loadAndGetPackageWithoutException();
    }
}
