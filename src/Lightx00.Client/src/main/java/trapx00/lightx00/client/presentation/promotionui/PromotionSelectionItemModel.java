package trapx00.lightx00.client.presentation.promotionui;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;

public class PromotionSelectionItemModel extends RecursiveTreeObject<PromotionSelectionItemModel> {
    public ObjectProperty<PromotionVoBase> promotionVoObjectProperty;

    public PromotionSelectionItemModel(PromotionVoBase promotion) {
        this.promotionVoObjectProperty = new SimpleObjectProperty<>(promotion);
    }

    public PromotionVoBase getPromotionVoObjectProperty() {
        return promotionVoObjectProperty.get();
    }

    public ObjectProperty<PromotionVoBase> promotionVoObjectPropertyProperty() {
        return promotionVoObjectProperty;
    }

    public void setPromotionVoObjectProperty(PromotionVoBase promotion) {
        this.promotionVoObjectProperty.set(promotion);
    }
}
