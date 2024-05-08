package TWITTER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TwitterGUI extends JFrame {
    private JTextField emailField;
    private JTextField aliasField;
    private JTextField followField;
    private JTextArea infoArea;
    private UserAccount user1;
    private List<UserAccount> allUsers;

    public TwitterGUI() {
        allUsers = new ArrayList<>();
        setTitle("Twitter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        emailField = new JTextField(20);
        aliasField = new JTextField(20);
        followField = new JTextField(20);
        infoArea = new JTextArea(10, 30);
        infoArea.setEditable(false);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String alias = aliasField.getText();

                if (Utils.isValidEmail(email)) {
                    user1 = new UserAccount(alias, email);
                    allUsers.add(user1);
                    UserAccount user2 = new UserAccount("alias2", "email2@example.com");
                    user1.follow(user2);

                    Tweet tweet1 = new Tweet("Hola, este es mi primer tweet", user1);
                    Tweet tweet2 = new Tweet("Hola, este es mi segundo tweet", user2);

                    user1.getTweets().add(tweet1);
                    user2.getTweets().add(tweet2);

                    String info = "Alias del usuario: " + user1.getAlias() + "\n" +
                            "Usuario 1 está siguiendo a: " + user1.getFollowing().size() + " usuarios\n" +
                            "Usuario 2 tiene: " + user2.getFollowers().size() + " seguidores\n" +
                            "Tweets de Usuario 1: " + user1.getTweets().size() + "\n" +
                            "Tweets de Usuario 2: " + user2.getTweets().size();
                    infoArea.setText(info);
                } else {
                    infoArea.setText("Email invalido. Por favor, introduce un email valido.");
                }
            }
        });

        JButton followButton = new JButton("Follow");
        followButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String followAlias = JOptionPane.showInputDialog("Introduce el alias del usuario que quieres seguir:");
                UserAccount userToFollow = findUserByAlias(followAlias);
                if (userToFollow != null) {
                    if (user1.getFollowing().contains(userToFollow)) {
                        infoArea.setText("Ya estás siguiendo a: " + followAlias);
                    } else {
                        user1.follow(userToFollow);
                        infoArea.setText("Has empezado a seguir a: " + followAlias);
                    }
                }
            }
        });

        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Alias:"));
        add(aliasField);
        add(submitButton);
        add(followButton);
        add(new JScrollPane(infoArea));
    }

    private UserAccount findUserByAlias(String alias) {
        for (UserAccount user : allUsers) {
            if (user.getAlias().equals(alias)) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TwitterGUI().setVisible(true);
            }
        });
    }
}