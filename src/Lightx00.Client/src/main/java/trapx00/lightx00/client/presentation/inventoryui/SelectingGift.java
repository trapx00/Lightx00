package trapx00.lightx00.client.presentation.inventoryui;

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
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.util.DateHelper;

import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SelectingGift extends SelectingDialog {
    @FXML
    private JFXTreeTableView<GiftSelectingItemModel> gitfTable;
    @FXML private JFXTreeTableColumn<GiftSelectingItemModel, String> giftDateColumn;
    @FXML private JFXTreeTableColumn<GiftSelectingItemModel, String> giftNameColumn;
    @FXML private JFXTreeTableColumn<GiftSelectingItemModel, String> giftIdColumn;
    @FXML private JFXButton btnSelect;
    @FXML private JFXButton btnClose;
    private Consumer<List<InventoryGiftVo>> callback;

    private ObservableList<GiftSelectingItemModel> giftSelectingItemModels = FXCollections.observableArrayList();
    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/SelectingGift.fxml").loadAndGetPackageWithoutException();
    }

    @FXML
    private void initialize() {
        initLogItem();

        giftSelectingItemModels.add(new GiftSelectingItemModel(new InventoryGiftVo("1", new Date(), BillState.Approved, null,"1")));
        giftSelectingItemModels.add(new GiftSelectingItemModel(new InventoryGiftVo("2", new Date(), BillState.Abandoned, null,"2")));

    }



    @FXML
    private void initLogItem() {
        giftDateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getInventoryGiftVoObjectProperty().getDate())));
        giftNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getInventoryGiftVoObjectProperty().getId()));
        giftIdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getInventoryGiftVoObjectProperty().getId()));
        TreeItem<GiftSelectingItemModel> root = new RecursiveTreeItem<>(giftSelectingItemModels, RecursiveTreeObject::getChildren);
        gitfTable.setRoot(root);
        gitfTable.setShowRoot(false);
        gitfTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //支持多选，没有这句话就是不支持
    }

    /**
     * 获得当前已经选择的日志。如果没有选择的，那么这个是空List（不是null！！！）
     * @return 当前已经选择的项
     */
    private List<InventoryGiftVo> getSelected() {
        return gitfTable.getSelectionModel().getSelectedItems().stream()
                .map(x -> x.getValue().getInventoryGiftVoObjectProperty())
                .collect(Collectors.toList());
    }

    /**
     * 设置目前选择的。用于刚开始的时候初始化已经选择的项。
     * @param selected 已经选择的项
     */
    private void setSelected(@NotNull List<InventoryGiftVo> selected) {
        List<String> ids = selected.stream().map(InventoryGiftVo::getId).collect(Collectors.toList());
        for (int i = 0; i < gitfTable.getCurrentItemsCount(); i++) {
            if (ids.contains(gitfTable.getTreeItem(i).getValue().getInventoryGiftVoObjectProperty().getId())) {
                gitfTable.getSelectionModel().select(i);
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
    public void showSelectLogDialog(@NotNull List<InventoryGiftVo> defaultSelection, Consumer<List<InventoryGiftVo>> callback) {
        ExternalLoadedUiPackage uiPackage = load();
        SelectingGift controller = (SelectingGift) uiPackage.getController();
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
