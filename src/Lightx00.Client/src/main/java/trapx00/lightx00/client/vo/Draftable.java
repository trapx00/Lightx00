package trapx00.lightx00.client.vo;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.presentation.helpui.ContinueWritable;

import java.util.HashMap;

public interface Draftable {
    /**
     * Gets the key-value maps to display the properties.
     * @return key-value maps for the properties
     */
    HashMap<String, String> properties();

    /**
     * Gets DeleteService corresponding to this type of draft.
     * @return DeleteService
     */
    DraftDeleteService deleteService();


    /**
     * Gets the ContinueWritable service corresponding to this type of draft.
     * @return ContinueWritable
     */
    ContinueWritable continueWriteService();



}
