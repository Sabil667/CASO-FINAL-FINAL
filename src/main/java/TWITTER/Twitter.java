package TWITTER;

import java.util.Scanner;

public class Twitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce tu email:");
        String email = scanner.nextLine();

        if (!Utils.isValidEmail(email)) {
            System.out.println("Email invalido. Por favor, introduce un email valido.");
            return;
        }

        System.out.println("Por favor, introduce tu alias:");
        String alias = scanner.nextLine();

        UserAccount user1 = new UserAccount(alias, email);
        UserAccount user2 = new UserAccount("alias2", "email2@example.com");

        user1.follow(user2);

        Tweet tweet1 = new Tweet("Hola, este es mi primer tweet", user1);
        Tweet tweet2 = new Tweet("Hola, este es mi segundo tweet", user2);

        user1.getTweets().add(tweet1);
        user2.getTweets().add(tweet2);

        System.out.println("Usuario 1 está siguiendo a: " + user1.getFollowing().size() + " usuarios");
        System.out.println("Usuario 2 tiene: " + user2.getFollowers().size() + " seguidores");

        System.out.println("Tweets de Usuario 1: " + user1.getTweets().size());
        System.out.println("Tweets de Usuario 2: " + user2.getTweets().size());
    }
}