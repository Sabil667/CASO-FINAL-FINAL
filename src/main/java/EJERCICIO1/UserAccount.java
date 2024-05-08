package EJERCICIO1;

import java.util.*;

public class UserAccount {
    private String alias;
    private String email;
    private List<Tweet> tweets;
    private Set<UserAccount> followers;
    private Set<UserAccount> following;
    private List<Tweet> timeline;

    public UserAccount(String alias, String email) {
        if (!Utils.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (!Utils.isValidAlias(alias)) {
            throw new IllegalArgumentException("Invalid alias");
        }
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.followers = new HashSet<>();
        this.following = new HashSet<>();
        this.timeline = new ArrayList<>();
    }
}