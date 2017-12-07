package trapx00.lightx00.client.presentation.inventoryui;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.util.DateHelper;

import java.io.IOException;

public class InventoryGiftUiController implements DraftContinueWritableUiController, ExternalLoadableUiController,ReversibleUi {

    public JFXTextField tfBillState;
    public JFXTextField tfOperator;
    public JFXTextField tfDate;
    public JFXTextField tfId;
    public JFXTreeTableView<InventoryGiftItemModel> inventoryGiftItems;
    public JFXTreeTableColumn<InventoryGiftItemModel, String> tcName;
    public JFXTreeTableColumn<InventoryGiftItemModel, String> tcPrice;
    public JFXTreeTableColumn<InventoryGiftItemModel, String> tcAmount;

    private ObservableList<InventoryGiftItemModel> inventoryGiftItemModelObservableList = FXCollections.observableArrayList();

    /**
     * Start continuing write a draft. Returns a External loaded ui package.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return External loaded ui package including a controller and the component.
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        /**
         * 草稿功能实现。
         * 和对应单据详细界面一样，通过传入的参数初始化对应的控件元素信息。
         */
        InventoryGiftVo inventoryGiftVo = (InventoryGiftVo) draft;
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        InventoryGiftUiController inventoryGiftUiController = (InventoryGiftUiController) externalLoadedUiPackage.getController();
        inventoryGiftUiController.tfId.setText(inventoryGiftVo.getId());
        inventoryGiftUiController.tfDate.setText(DateHelper.fromDate(inventoryGiftVo.getDate()));
        inventoryGiftUiController.tfBillState.setText(inventoryGiftVo.getState().toString());
        inventoryGiftUiController.tfOperator.setText(inventoryGiftVo.getOperatorId());
        inventoryGiftUiController.addGiftItems(inventoryGiftVo.getGifts());
        return externalLoadedUiPackage;
    }


    public void addGiftItems(PromotionCommodity[] promotionCommodities) {
        for (PromotionCommodity promotionCommodity : promotionCommodities) {
            inventoryGiftItemModelObservableList.add(new InventoryGiftItemModel(promotionCommodity));
        }

    }
    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/InventoryGiftUi.fxml").loadAndGetPackageWithoutException();
    }

    @Override
    public ExternalLoadedUiPackage revertReversible(Reversible reversible) {
        return null;
    }
}
