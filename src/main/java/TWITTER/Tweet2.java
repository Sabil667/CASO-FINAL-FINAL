package TWITTER;

import java.time.LocalDate;

public class Tweet2 {
    protected String message;
    protected UserAccount sender;
    protected LocalDate time;

    public Tweet2(String message, UserAccount sender) {
        if (message.length() > 140) {
            throw new IllegalArgumentException("El mensaje no puede tener más de 140 caracteres");
        }
        this.message = message;
        this.sender = sender;
        this.time = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Tweet2{" +
                "message='" + message + '\'' +
                ", sender=" + sender +
                ", time=" + time +
                '}';
    }
}
