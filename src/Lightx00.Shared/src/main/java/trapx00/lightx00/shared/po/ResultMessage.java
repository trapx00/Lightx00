package trapx00.lightx00.shared.po;

import trapx00.lightx00.shared.po.failuremessage.FailureMessage;

public class ResultMessage {
    private FailureMessage failureMessage;
    private InnerResultMessage innerResultMessage;

    public static final ResultMessage Success = new ResultMessage(InnerResultMessage.Success);

    public static final ResultMessage Failure = new ResultMessage(InnerResultMessage.Failure);


    private ResultMessage(InnerResultMessage innerResultMessage) {
        this.innerResultMessage = innerResultMessage;
    }


    /**
     * Returns a ResultMessage.FailureWithInformation with a concrete FailureMessage.
     * @param failureMessage FailureMessage
     * @return ResultMessage.FailureWithInformation
     */
    public static ResultMessage failureWithInformation(FailureMessage failureMessage) {
        ResultMessage message = new ResultMessage(InnerResultMessage.FailureWithInformation);
        message.failureMessage = failureMessage;
        return message;
    }

    public FailureMessage getFailureMessage() {
        return failureMessage;
    }
}

enum InnerResultMessage {
    Success,
    Failure,
    FailureWithInformation
}
