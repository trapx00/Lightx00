package trapx00.lightx00.shared.po.failuremessage.database;

import trapx00.lightx00.shared.po.failuremessage.FailureMessage;
import trapx00.lightx00.shared.po.failuremessage.FailureType;

public class DatabaseFailureMessage extends FailureMessage {

    private DatabaseFailureType databaseFailureType;

    public DatabaseFailureMessage(DatabaseFailureType type) {
        super(FailureType.Database);
        this.databaseFailureType = type;
    }

    public DatabaseFailureMessage(DatabaseFailureType type, String message) {
        super(FailureType.Database, message);
        this.databaseFailureType = type;
    }

    public DatabaseFailureType getDatabaseFailureType() {
        return databaseFailureType;
    }
}
