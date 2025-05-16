package intLogin;

import javax.swing.*;
import java.awt.*;

public class PntLogin {
    private static JFrame loginFrame;
    private static JFrame registerFrame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> showLoginScreen());
    }

    // Pantalla de inicio de sesión
    private static void showLoginScreen() {
        loginFrame = new JFrame("Restaurante El Primo - Iniciar Sesión");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        loginFrame.setLayout(new BorderLayout());
        loginFrame.getContentPane().setBackground(new Color(255, 245, 200));
        loginFrame.setLocationRelativeTo(null);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(255, 245, 200));
        topPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel backLabel = new JLabel("< Regresar");
        backLabel.setForeground(Color.ORANGE);
        backLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(loginFrame, "Regresando...");
                loginFrame.dispose();
            }
        });

        ImageIcon logoIcon = new ImageIcon(PntLogin.class.getResource("/Iconos/RestauranteEP.png"));
        Image logoImage = logoIcon.getImage();
        int logoWidth = 200;
        int logoHeight = 100;
        Image scaledLogoImage = logoImage.getScaledInstance(logoWidth, logoHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledLogoIcon = new ImageIcon(scaledLogoImage);
        JLabel logoLabel = new JLabel(scaledLogoIcon);
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);

        topPanel.add(backLabel, BorderLayout.WEST);
        topPanel.add(logoLabel, BorderLayout.CENTER);

        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(new Color(255, 245, 200));
        loginPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        JLabel userLabel = new JLabel("Usuario (correo o teléfono)");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(userLabel, gbc);

        JTextField userField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 1;
        userField.setPreferredSize(new Dimension(300, 30));
        loginPanel.add(userField, gbc);

        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 2;
        loginPanel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField();
        gbc.gridx = 0;
        gbc.gridy = 3;
        passwordField.setPreferredSize(new Dimension(300, 30));
        loginPanel.add(passwordField, gbc);

        JButton loginButton = new JButton("Ingresar");
        loginButton.setBackground(Color.ORANGE);
        loginButton.setForeground(Color.BLACK);
        loginButton.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 4;
        loginButton.setPreferredSize(new Dimension(150, 40));
        loginPanel.add(loginButton, gbc);

        JLabel createAccountLabel = new JLabel("<html><u>Crear cuenta</u></html>", SwingConstants.CENTER);
        createAccountLabel.setForeground(Color.ORANGE);
        createAccountLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        createAccountLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 5;
        loginPanel.add(createAccountLabel, gbc);

        loginButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(loginFrame, "No tienes una cuenta. Por favor, crea una.");
            loginFrame.setVisible(false);
            showRegisterScreen();
        });

        createAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginFrame.setVisible(false);
                showRegisterScreen();
            }
        });

        loginFrame.add(topPanel, BorderLayout.NORTH);
        loginFrame.add(loginPanel, BorderLayout.CENTER);
        loginFrame.setVisible(true);
    }

    private static void showRegisterScreen() {
        registerFrame = new JFrame("Restaurante El Primo - Crear Cuenta");
        registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        registerFrame.setLayout(new BorderLayout());
        registerFrame.getContentPane().setBackground(new Color(255, 245, 200));
        registerFrame.setLocationRelativeTo(null);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(255, 245, 200));
        topPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel backLabel = new JLabel("< Regresar");
        backLabel.setForeground(Color.ORANGE);
        backLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerFrame.setVisible(false);
                showLoginScreen();
            }
        });

        ImageIcon logoIcon = new ImageIcon(PntLogin.class.getResource("/Iconos/RestauranteEP.png"));
        Image logoImage = logoIcon.getImage();
        int logoWidth = 200;
        int logoHeight = 100;
        Image scaledLogoImage = logoImage.getScaledInstance(logoWidth, logoHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledLogoIcon = new ImageIcon(scaledLogoImage);
        JLabel logoLabel = new JLabel(scaledLogoIcon);
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);

        topPanel.add(backLabel, BorderLayout.WEST);
        topPanel.add(logoLabel, BorderLayout.CENTER);

        JPanel registerPanel = new JPanel();
        registerPanel.setBackground(new Color(255, 245, 200));
        registerPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        JLabel nameLabel = new JLabel("Nombre");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        registerPanel.add(nameLabel, gbc);

        JTextField nameField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 1;
        nameField.setPreferredSize(new Dimension(300, 30));
        registerPanel.add(nameField, gbc);

        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 2;
        registerPanel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField();
        gbc.gridx = 0;
        gbc.gridy = 3;
        passwordField.setPreferredSize(new Dimension(300, 30));
        registerPanel.add(passwordField, gbc);

        JLabel emailPhoneLabel = new JLabel("Correo o teléfono");
        emailPhoneLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 4;
        registerPanel.add(emailPhoneLabel, gbc);

        JTextField emailPhoneField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 5;
        emailPhoneField.setPreferredSize(new Dimension(300, 30));
        registerPanel.add(emailPhoneField, gbc);

        JLabel addressLabel = new JLabel("Domicilio");
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 6;
        registerPanel.add(addressLabel, gbc);

        JLabel colonyLabel = new JLabel("Colonia");
        colonyLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 7;
        registerPanel.add(colonyLabel, gbc);

        JTextField colonyField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 8;
        colonyField.setPreferredSize(new Dimension(300, 30));
        registerPanel.add(colonyField, gbc);

        JLabel streetLabel = new JLabel("Calle");
        streetLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 9;
        registerPanel.add(streetLabel, gbc);

        JTextField streetField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 10;
        streetField.setPreferredSize(new Dimension(300, 30));
        registerPanel.add(streetField, gbc);

        JLabel numberLabel = new JLabel("Número");
        numberLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 11;
        registerPanel.add(numberLabel, gbc);

        JTextField numberField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 12;
        numberField.setPreferredSize(new Dimension(300, 30));
        registerPanel.add(numberField, gbc);

        JLabel cpLabel = new JLabel("C.P.");
        cpLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 13;
        registerPanel.add(cpLabel, gbc);

        JTextField cpField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 14;
        cpField.setPreferredSize(new Dimension(300, 30));
        registerPanel.add(cpField, gbc);

        JButton continueButton = new JButton("Continuar");
        continueButton.setBackground(Color.ORANGE);
        continueButton.setForeground(Color.BLACK);
        continueButton.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 15;
        continueButton.setPreferredSize(new Dimension(150, 40));
        registerPanel.add(continueButton, gbc);

        continueButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(registerFrame, "Cuenta creada exitosamente!");
            registerFrame.setVisible(false);
            showLoginScreen();
        });

        JScrollPane scrollPane = new JScrollPane(registerPanel);
        registerFrame.add(topPanel, BorderLayout.NORTH);
        registerFrame.add(scrollPane, BorderLayout.CENTER);
        registerFrame.setVisible(true);
    }
}

