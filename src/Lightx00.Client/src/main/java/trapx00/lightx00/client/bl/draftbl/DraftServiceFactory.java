package trapx00.lightx00.client.bl.draftbl;

import trapx00.lightx00.client.bl.draftbl.DraftBlController;
import trapx00.lightx00.client.bl.draftbl.DraftService;

public class DraftServiceFactory {

    private static DraftService instance = new DraftBlController();

    /**
     * Gets a DraftService instance.
     * @return DraftService instance
     */
    public static DraftService getInstance() {
        return instance;
    }
}
