package trapx00.lightx00.client.presentation.commodityui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import com.sun.istack.internal.NotNull;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.Region;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.log.LogVo;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.util.DateHelper;

import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CommoditySelectingDialog extends SelectingDialog {

    @FXML
    public JFXTreeTableView<CommoditySelectionItemModel> commodityTable;
    public JFXTreeTableColumn<CommoditySelectionItemModel, String> tableNameColumn;
    public JFXTreeTableColumn<CommoditySelectionItemModel, String> tableSortColumn;
    public JFXTreeTableColumn<CommoditySelectionItemModel, String> tableAmountColumn;
    public JFXTreeTableColumn<CommoditySelectionItemModel, String> tableIdColumn;
    public JFXTreeTableColumn<CommoditySelectionItemModel, String> tableDateColumn;
    @FXML private JFXButton btnSelect;
    @FXML private JFXButton btnClose;
    private Consumer<List<CommodityVo>> callback;

    private ObservableList<CommoditySelectionItemModel> commodityModels = FXCollections.observableArrayList();
    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/CommoditySelectingDialog.fxml").loadAndGetPackageWithoutException();
    }

    @FXML
    private void initialize() {
        initCommodityItem();
        CommodityVo commoditVo=new CommodityVo("123","SmallLed","Led",34
                ,new Date(),"No.1","No.2",43,53,44,
                45,45);
        commodityModels.clear();
        commodityModels.add(new CommoditySelectionItemModel(new CommodityVo("123","SmallLed","Led",34
                ,new Date(),"No.1","No.2",43,53,44,
                45,45)));
        commodityModels.add(new CommoditySelectionItemModel(new CommodityVo("123","SmallLed","Led",34
                ,new Date(),"No.1","No.2",43,53,44,
                45,45)));
        commodityModels.add(new CommoditySelectionItemModel(new CommodityVo("123","SmallLed","Led",34
                ,new Date(),"No.1","No.2",43,53,44,
                45,45)));
        commodityModels.add(new CommoditySelectionItemModel(new CommodityVo("123","SmallLed","Led",34
                ,new Date(),"No.1","No.2",43,53,44,
                45,45)));
    }



    @FXML
    private void initCommodityItem() {
        tableDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getCommodityVoObjectProperty().getProductionDate())));
        tableNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityVoObjectProperty().getName()));
        tableIdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getCommodityVoObjectProperty().getId())));
        tableAmountColumn.setCellValueFactory(cellData->new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getCommodityVoObjectProperty().getAmount())));

        TreeItem<CommoditySelectionItemModel> root = new RecursiveTreeItem<>(commodityModels, RecursiveTreeObject::getChildren);
        commodityTable.setRoot(root);
        commodityTable.setShowRoot(false);
        commodityTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //支持多选，没有这句话就是不支持
    }

    /**
     * 获得当前已经选择的日志。如果没有选择的，那么这个是空List（不是null！！！）
     * @return 当前已经选择的项
     */
    private List<CommodityVo> getSelected() {
        return commodityTable.getSelectionModel().getSelectedItems().stream()
                .map(x -> x.getValue().getCommodityVoObjectProperty())
                .collect(Collectors.toList());
    }

    /**
     * 设置目前选择的。用于刚开始的时候初始化已经选择的项。
     * @param selected 已经选择的项
     */
    private void setSelected(@NotNull List<CommodityVo> selected) {
        List<String> ids = selected.stream().map(CommodityVo::getId).collect(Collectors.toList());
        for (int i = 0; i < commodityTable.getCurrentItemsCount(); i++) {
            if (ids.contains(commodityTable.getTreeItem(i).getValue().getCommodityVoObjectProperty().getId())) {
                commodityTable.getSelectionModel().select(i);
            }
        }
    }


    /**
     * 重点方法。也是外界调用的方法。
     * @param defaultSelection 默认选中的方法
     * @param callback 选择结束后的回调函数。如果用户点了取消按钮，那么直接退出，不会触发回调函数。
     *                 用法参见……
     *
     */
    public void showSelectLogDialog(@NotNull List<CommodityVo> defaultSelection, Consumer<List<CommodityVo>> callback) {
        ExternalLoadedUiPackage uiPackage = load();
        CommoditySelectingDialog controller = (CommoditySelectingDialog) uiPackage.getController();
        controller.setSelected(defaultSelection);
        controller.callback = callback;
        JFXDialog dialog = PromptDialogHelper.start("","").create();
        dialog.setContent((Region) uiPackage.getComponent());
        FrameworkUiManager.getCurrentDialogStack().pushAndShow(dialog);
    }

    @FXML
    private void onBtnSelectClicked(ActionEvent actionEvent) {
        if (callback != null) {
            callback.accept(getSelected()); //选择结束，调用回调方法。
        }
        onClose(); //一定要调用这个来把弹出框关了。
    }

    @FXML
    private void onBtnCloseClicked(ActionEvent actionEvent) {
        onClose();
    }
}
