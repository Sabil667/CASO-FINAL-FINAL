package TWITTER;

public class Retweet extends Tweet2 {
    private Tweet2 originalTweet;

    public Retweet(String message, UserAccount sender, Tweet2 originalTweet) {
        super(message, sender);
        this.originalTweet = originalTweet;
    }

    @Override
    public String toString() {
        return "Retweet{" +
                "message='" + message + '\'' +
                ", sender=" + sender +
                ", time=" + time +
                ", originalTweet=" + originalTweet +
                '}';
    }
}