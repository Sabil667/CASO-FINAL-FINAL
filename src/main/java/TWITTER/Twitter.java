package TWITTER;


public class Twitter {
    public static void main(String[] args) {
        UserAccount user1 = new UserAccount("alias1", "email1@example.com");
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
