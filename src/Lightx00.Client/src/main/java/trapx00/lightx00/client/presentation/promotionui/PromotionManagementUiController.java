package trapx00.lightx00.client.presentation.promotionui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.bl.promotionbl.PromotionInfo;
import trapx00.lightx00.client.blservice.promotionblservice.*;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.presentation.promotionui.detail.ComSalePromotionDetailUi;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;
import trapx00.lightx00.shared.queryvo.promotion.ClientPromotionQueryVo;
import trapx00.lightx00.shared.queryvo.promotion.ComSalePromotionQueryVo;
import trapx00.lightx00.shared.queryvo.promotion.TotalPricePromotionQueryVo;
import trapx00.lightx00.shared.util.DateHelper;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PromotionManagementUiController implements ExternalLoadableUiController {
    public JFXTextField tfSearch;
    public JFXButton btnSearch;
    public JFXTreeTableView<PromotionInfoModel> tablePromotion;
    public JFXTreeTableColumn<PromotionInfoModel, String> tcId;
    public JFXTreeTableColumn<PromotionInfoModel, String> tcType;
    public JFXTreeTableColumn<PromotionInfoModel, String> tcStartDate;
    public JFXTreeTableColumn<PromotionInfoModel, String> tcEndDate;
    public JFXTreeTableColumn<PromotionInfoModel, String> tcState;
    public JFXButton btnDetail;
    public JFXButton btnDelete;

    private ObservableList<PromotionInfoModel> promotionInfoModels = FXCollections.observableArrayList();
    private ClientPromotionBlService clientPromotionBlService = ClientPromotionBlServiceFactory.getInstance();
    private ComSalePromotionBlService comSalePromotionBlService = ComSalePromotionBlServiceFactory.getInstance();
    private TotalPricePromotionBlService totalPricePromotionBlService = TotalPricePromotionBlServiceFactory.getInstance();

    public void onBtnSearchClicked() {
        updateItems();
    }

    public void initialize() {
        initTable();
        updateItems();
    }

    private void updateItems() {
        promotionInfoModels.clear();
        ComSalePromotionQueryVo comSalePromotionQueryVo = new ComSalePromotionQueryVo();
        TotalPricePromotionQueryVo totalPricePromotionQueryVo = new TotalPricePromotionQueryVo();
        ClientPromotionQueryVo clientPromotionQueryVo = new ClientPromotionQueryVo();

        PromotionVoBase[] result1 = comSalePromotionBlService.queryPromotion(comSalePromotionQueryVo);
        promotionInfoModels.addAll(Arrays.stream(result1).map(PromotionInfoModel::new).collect(Collectors.toList()));
        PromotionVoBase[] result2 = totalPricePromotionBlService.queryPromotion(totalPricePromotionQueryVo);
        promotionInfoModels.addAll(Arrays.stream(result2).map(PromotionInfoModel::new).collect(Collectors.toList()));
        PromotionVoBase[] result3 = clientPromotionBlService.queryPromotion(clientPromotionQueryVo);
        promotionInfoModels.addAll(Arrays.stream(result3).map(PromotionInfoModel::new).collect(Collectors.toList()));

        tablePromotion.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                onBtnDetailClicked();
            }
        });
    }

    private void initTable() {
        tcId.setCellValueFactory(cellData -> cellData.getValue().getValue().idProperty());
        tcStartDate.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getStartDate())));
        tcEndDate.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getEndDate())));
        tcType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getType().toString()));
        tcState.setCellValueFactory(cellData ->  new SimpleStringProperty(cellData.getValue().getValue().getState().toString()));

        TreeItem<PromotionInfoModel> root = new RecursiveTreeItem<>(promotionInfoModels, RecursiveTreeObject::getChildren);
        tablePromotion.setRoot(root);
        tablePromotion.setShowRoot(false);
        tablePromotion.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        tablePromotion.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                onBtnDetailClicked();
            }
        });
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/managerui/PromotionManagementUi.fxml").loadAndGetPackageWithoutException();
    }

    public PromotionVoBase getSelected() {
        try {
            return tablePromotion.getSelectionModel().getSelectedItem().getValue().getPromotion();
        } catch (Exception e) {
            new PromptDialogHelper("未选择！","请先选择一个促销策略！")
                    .addCloseButton("好","CHECK", null)
                    .createAndShow();
            return null;
        }
    }

    public void onBtnDeleteClicked() {
        PromotionVoBase selected = getSelected();
        if (selected != null) {
            new PromptDialogHelper("确定删除？", "促销策略将被废弃，无法撤销。")
                    .addCloseButton("取消","CLOSE",null)
                    .addButton("确定","CHECK",e -> {
                        ResultMessage result = delete(selected.getId(),selected.getType());
                        if(result.equals(ResultMessage.Success)) {
                            new PromptDialogHelper("删除成功","")
                                    .addCloseButton("好","CHECK", e2 -> {
                                        FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();
                                        updateItems();
                                    })
                                    .createAndShow();
                        }
                        else {
                            new PromptDialogHelper("删除失败","")
                                    .addCloseButton("好","CHECK", e2 -> {
                                        FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();
                                        updateItems();
                                    })
                                    .createAndShow();
                        }
                    })
                    .createAndShow();
        }
    }

    private ResultMessage delete(String id, PromotionType type) {
        switch (type) {
            case ComSalePromotion:
                return comSalePromotionBlService.delete(id);
            case TotalPricePromotion:
                return totalPricePromotionBlService.delete(id);
            case ClientPromotion:
                return clientPromotionBlService.delete(id);
                default:
                    return ResultMessage.Failure;
        }

    }
    public void onBtnDetailClicked() {
        TreeItem<PromotionInfoModel> selectedItem = tablePromotion.getSelectionModel().getSelectedItem();
        if(selectedItem.getValue()!=null) {
            PromotionVoBase promotion = selectedItem.getValue().getPromotion();
            PromptDialogHelper.start("促销策略详细信息","")
                    .setContent(promotion.promotionDetailUi().showContent(promotion).getComponent())
                    .addCloseButton("返回","REFRESH",null)
                    .createAndShow();
        }
        else {
            PromptDialogHelper.start("错误","请先选择一条促销策略。")
                    .addCloseButton("好的","DONE",null)
                    .createAndShow();
        }
    }

}
