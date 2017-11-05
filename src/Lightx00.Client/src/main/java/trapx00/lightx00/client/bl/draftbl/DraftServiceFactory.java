package trapx00.lightx00.client.bl.draftbl;

import trapx00.lightx00.client.bl.draftbl.DraftBlController;
import trapx00.lightx00.client.bl.draftbl.DraftService;

public class DraftServiceFactory {
    /**
     * Gets a DraftService instance.
     * @return DraftService instance
     */
    public static DraftService getInstance() {
        return new DraftBlController();
    }
}
