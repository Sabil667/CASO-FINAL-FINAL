package TWITTER;

import java.util.*;

public class UserAccount {
    private String alias;
    private String email;
    private List<Tweet2> tweets; // Cambiado de Tweet a Tweet2
    private Set<UserAccount> followers;
    private Set<UserAccount> following;

    public UserAccount(String alias, String email) {
        if (!Utils.isValidEmail(email)) {
            throw new IllegalArgumentException("Email invalido");
        }
        if (!Utils.isValidAlias(alias)) {
            throw new IllegalArgumentException("Alias invalido");
        }
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.followers = new HashSet<>();
        this.following = new HashSet<>();
    }

    public void follow(UserAccount targetUser) {
        if (this.following.contains(targetUser)) {
            throw new IllegalArgumentException("Ya estas siguiendo a este usuario");
        }
        this.following.add(targetUser);
        targetUser.followers.add(this);
    }

    public List<Tweet2> getTweets() { // Cambiado de Tweet a Tweet2
        return new ArrayList<>(this.tweets);
    }

    public Set<UserAccount> getFollowers() {
        return new HashSet<>(this.followers);
    }

    public Set<UserAccount> getFollowing() {
        return new HashSet<>(this.following);
    }

    public String getEmail() {
        return this.email;
    }

    public String getAlias() {
        return this.alias;
    }

    @Override
    public String toString() {
        return "Alias: " + this.alias + ", Email: " + this.email;
    }
}