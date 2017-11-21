package trapx00.lightx00.shared.po.failuremessage;

public abstract class FailureMessage {
    private FailureType type;
    private String message;

    public FailureMessage(FailureType type) {
        this.type = type;
    }

    public FailureMessage(FailureType type, String message) {
        this.type = type;
        this.message = message;
    }

    public FailureType getType() {
        return type;
    }



    public String getMessage() {
        return message;
    }
}
