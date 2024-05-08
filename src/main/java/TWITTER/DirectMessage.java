package TWITTER;

public class DirectMessage extends Tweet2 {
    private UserAccount receiver;

    public DirectMessage(String message, UserAccount sender, UserAccount receiver) {
        super(message, sender);
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "DirectMessage{" +
                "message='" + message + '\'' +
                ", sender=" + sender +
                ", time=" + time +
                ", receiver=" + receiver +
                '}';
    }
}