package TWITTER;
import java.util.Date;
public class Tweet {
    private String content;
    private UserAccount user;
    private Date date;

    public Tweet(String content, UserAccount user) {
        this.content = content;
        this.user = user;
        this.date = new Date();
    }
}