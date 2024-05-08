package TWITTER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TWITTERMAIN extends JFrame {
    private JPanel loginPanel;
    private JPanel mainPanel;
    private JTextField emailField;
    private JTextField aliasField;
    private JTextField followField;
    private JTextArea infoArea;
    private UserAccount user1;
    private List<UserAccount> allUsers;
    private JButton followButton;
    private JButton showInfoButton;
    private JButton tweetButton;
    private JButton loadUserButton;
    private JButton sortButton;

    public TWITTERMAIN() {
        allUsers = new ArrayList<>();
        setTitle("Twitter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new CardLayout());

        // Panel de inicio de sesión
        loginPanel = new JPanel(new FlowLayout());
        emailField = new JTextField(20);
        aliasField = new JTextField(20);
        infoArea = new JTextArea(10, 30); // Inicializar infoArea aquí
        infoArea.setEditable(false);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String alias = aliasField.getText();

                if (Utils.isValidEmail(email) && Utils.isValidAlias(alias)) {
                    user1 = new UserAccount(alias, email);
                    allUsers.add(user1);

                    // Agregar la información del usuario
                    UserAccount user2 = new UserAccount("alias2", "email2@example.com");
                    user1.follow(user2);

                    Tweet2 tweet1 = new Tweet2("Hola, este es mi primer tweet", user1);
                    Tweet2 tweet2 = new Tweet2("Hola, este es mi segundo tweet", user2);

                    user1.getTweets().add(tweet1);
                    user2.getTweets().add(tweet2);

                    String info = "Alias del usuario: " + user1.getAlias() + "\n" +
                            "Usuario 1 está siguiendo a: " + user1.getFollowing().size() + " usuarios\n" +
                            "Usuario 2 tiene: " + user2.getFollowers().size() + " seguidores\n" +
                            "Tweets de Usuario 1: " + user1.getTweets().size() + "\n" +
                            "Tweets de Usuario 2: " + user2.getTweets().size();
                    infoArea.setText(info);

                    // Cambiar a la interfaz principal
                    ((CardLayout) getContentPane().getLayout()).show(getContentPane(), "MainPanel");
                } else {
                    JOptionPane.showMessageDialog(TWITTERMAIN.this, "Email o alias invalido. Por favor, introduce un email y alias valido.");
                }
            }
        });
        loginPanel.add(new JLabel("Email:"));
        loginPanel.add(emailField);
        loginPanel.add(new JLabel("Alias:"));
        loginPanel.add(aliasField);
        loginPanel.add(loginButton);

        // Panel principal
        mainPanel = new JPanel(new FlowLayout());
        followField = new JTextField(20);

        followButton = new JButton("Follow");
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
        showInfoButton = new JButton("Show Info");
        showInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user1 != null) {
                    infoArea.setText(user1.toString());
                }
            }
        });

        tweetButton = new JButton("Publicar Tweet");
        tweetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tweetContent = JOptionPane.showInputDialog("Introduce el contenido del tweet:");
                if (tweetContent != null && !tweetContent.isEmpty()) {
                    Tweet2 newTweet = new Tweet2(tweetContent, user1);
                    user1.getTweets().add(newTweet);
                    infoArea.setText("Has publicado un nuevo tweet: " + tweetContent);
                } else {
                    JOptionPane.showMessageDialog(TWITTERMAIN.this, "El contenido del tweet no puede estar vacío.");
                }
            }
        });

        loadUserButton = new JButton("Cargar Usuario");
        loadUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String alias = JOptionPane.showInputDialog("Introduce el alias del usuario que quieres cargar:");
                UserAccount userToLoad = findUserByAlias(alias);
                if (userToLoad != null) {
                    user1 = userToLoad;
                    infoArea.setText("Has cargado el usuario: " + alias);
                } else {
                    JOptionPane.showMessageDialog(TWITTERMAIN.this, "No se encontró el usuario con el alias: " + alias);
                }
            }
        });

        sortButton = new JButton("Ordenar Usuarios");
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(allUsers, new Comparator<UserAccount>() {
                    @Override
                    public int compare(UserAccount user1, UserAccount user2) {
                        return user1.getAlias().compareTo(user2.getAlias());
                    }
                });
                StringBuilder sortedUsers = new StringBuilder("Usuarios ordenados por alias:\n");
                for (UserAccount user : allUsers) {
                    sortedUsers.append(user.getAlias()).append("\n");
                }
                infoArea.setText(sortedUsers.toString());
            }
        });

        mainPanel.add(followButton);
        mainPanel.add(showInfoButton);
        mainPanel.add(tweetButton);
        mainPanel.add(loadUserButton);
        mainPanel.add(sortButton);
        mainPanel.add(new JScrollPane(infoArea));

        // Agregar los paneles al marco
        add(loginPanel, "LoginPanel");
        add(mainPanel, "MainPanel");
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
                new TWITTERMAIN().setVisible(true);
            }
        });
    }
}