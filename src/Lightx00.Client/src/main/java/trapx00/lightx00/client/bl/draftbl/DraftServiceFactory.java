package trapx00.lightx00.client.bl.draftbl;

public class DraftServiceFactory {
    /**
     * Gets a DraftService instance.
     * @return DraftService instance
     */
    public static DraftService getInstance() {
        return new DraftBlController();
    }
}
