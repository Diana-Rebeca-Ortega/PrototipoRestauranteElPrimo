package intPedidos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PntPedidos {

    private static JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Restaurante El Primo - Pedidos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(252, 231, 155));

        JPanel headerPanel = createHeaderPanel();
        mainPanel.add(headerPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane();
        JPanel bodyPanel = createBodyPanel();
        scrollPane.setViewportView(bodyPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private static JPanel createHeaderPanel() {
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(252, 231, 155));
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel backLabel = new JLabel("< Regresar");
        backLabel.setForeground(new Color(228, 106, 0));
        backLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
            }
        });
        headerPanel.add(backLabel, BorderLayout.WEST);

        JLabel titleLabel = new JLabel("Pedidos", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(new Color(160, 82, 45));
        headerPanel.add(titleLabel, BorderLayout.CENTER);

        return headerPanel;
    }

    private static JPanel createBodyPanel() {
        JPanel bodyPanel = new JPanel();
        bodyPanel.setBackground(new Color(252, 231, 155));
        bodyPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.gridwidth = 2;

        JLabel numeroLabel = new JLabel("Número de Pedido:");
        numeroLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        bodyPanel.add(numeroLabel, gbc);

        JTextField numeroField = new JTextField();
        numeroField.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 0;
        gbc.gridy = 1;
        bodyPanel.add(numeroField, gbc);

        JLabel estadoLabel = new JLabel("Estado:");
        estadoLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        bodyPanel.add(estadoLabel, gbc);

        JTextField estadoField = new JTextField();
        estadoField.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 0;
        gbc.gridy = 3;
        bodyPanel.add(estadoField, gbc);

        JLabel confirmacionLabel = new JLabel("Si tu pedido ya fue entregado, por favor presiona el botón de confirmación:");
        confirmacionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        bodyPanel.add(confirmacionLabel, gbc);

        JButton confirmacionButton = new JButton("Confirmación");
        confirmacionButton.setBackground(new Color(247, 150, 70));
        confirmacionButton.setForeground(Color.BLACK);
        confirmacionButton.setFont(new Font("Arial", Font.BOLD, 18));
        confirmacionButton.setPreferredSize(new Dimension(150, 40));
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        bodyPanel.add(confirmacionButton, gbc);

        confirmacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "¡Pedido confirmado!");
            }
        });

        JLabel pendientesLabel = new JLabel("Si tu pedido aún no ha sido entregado, verifica los pendientes que existen antes del tuyo: )");
        pendientesLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        bodyPanel.add(pendientesLabel, gbc);

        return bodyPanel;
    }
}

