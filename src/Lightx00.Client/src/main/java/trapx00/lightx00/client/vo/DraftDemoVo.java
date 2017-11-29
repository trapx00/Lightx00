package trapx00.lightx00.client.vo;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.presentation.helpui.DraftContinueWritableDemoUiController;
import trapx00.lightx00.client.presentation.helpui.DraftContinueWritableUiController;

import java.util.HashMap;

public class DraftDemoVo implements Draftable {
    private String draftContent = "123";

    /**
     * Gets DeleteService corresponding to this type of draft.
     *
     * @return DeleteService
     */
    @Override
    public DraftDeleteService deleteService() {
        return null;
    }

    /**
     * Gets the DraftContinueWritableUiController service corresponding to this type of draft.
     *
     * @return DraftContinueWritableUiController
     */
    @Override
    public DraftContinueWritableUiController continueWritableUi() {
        return new DraftContinueWritableDemoUiController();
    }

    /**
     * Gets the key-value maps to display the properties.
     *
     * @return key-value maps for the properties
     */
    @Override
    public HashMap<String, String> properties() {
        HashMap<String, String> content = new HashMap<>();
        content.put("draftContent", "123");
        return content;
    }

    public String getDraftContent() {
        return draftContent;
    }
}
