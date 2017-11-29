package trapx00.lightx00.client.presentation.helpui;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import trapx00.lightx00.client.Client;
import trapx00.lightx00.client.vo.DraftDemoVo;

import java.io.IOException;

public class DraftContinueWritableDemoUiController implements ExternalLoadableUiController, DraftContinueWritableUiController<DraftDemoVo> {
    public Label lbTest;

    /**
     * Start continuing write a draft. Returns a External loaded ui package.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return External loaded ui package including a ExternalLoadableUiController and the component.
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(DraftDemoVo draft) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Client.class.getResource("/fxml/DraftContinueWritingDemoUi.fxml"));
        AnchorPane anchorPane = loader.load();
        DraftContinueWritableDemoUiController controller = loader.getController();
        controller.lbTest.setText(draft.getDraftContent());
        return new ExternalLoadedUiPackage(controller, anchorPane);
    }
}
