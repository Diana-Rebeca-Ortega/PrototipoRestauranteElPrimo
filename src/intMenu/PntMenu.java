package intMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PntMenu {

    private static JFrame frame;
    private static JPanel menuPanel;
    private static List<JMenuItem> menuItems = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Restaurante El Primo - Menú");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(245, 222, 179));

        JPanel headerPanel = createHeaderPanel();
        mainPanel.add(headerPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane();
        menuPanel = createMenuPanel();
        scrollPane.setViewportView(menuPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JButton realizarPedidoButton = createRealizarPedidoButton();
        mainPanel.add(realizarPedidoButton, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private static JPanel createHeaderPanel() {
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(245, 222, 179));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        headerPanel.setLayout(new BorderLayout());

        JLabel backLabel = new JLabel("< Regresar");
        backLabel.setForeground(new Color(255, 165, 0));
        backLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame.dispose();
            }
        });
        headerPanel.add(backLabel, BorderLayout.WEST);

        JLabel titleLabel = new JLabel("Menú", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(new Color(160, 82, 45));
        headerPanel.add(titleLabel, BorderLayout.CENTER);

        return headerPanel;
    }

    private static JPanel createMenuPanel() {
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(245, 222, 179));
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        JPanel comidasPanel = createCategoryPanel("Comidas");
        JPanel bebidasPanel = createCategoryPanel("Bebidas");

        menuPanel.add(comidasPanel);
        menuPanel.add(bebidasPanel);

        return menuPanel;
    }

    private static JPanel createCategoryPanel(String categoryName) {
        JPanel categoryPanel = new JPanel();
        categoryPanel.setBackground(new Color(245, 222, 179));
        categoryPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;

        JLabel titleLabel = new JLabel(categoryName, SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(255, 165, 0));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        categoryPanel.add(titleLabel, gbc);

        // Arrays to hold menu item details for ordering
        String[] itemNames = new String[6];
        JLabel[] priceLabels = new JLabel[6];
        JButton[] addButtons = new JButton[6];
        JPanel[] itemPanels = new JPanel[6];

        for (int i = 0; i < 6; i++) {
            JMenuItem menuItem;
            if (categoryName.equals("Comidas")) {
                menuItem = new JMenuItem("Platillo " + (i + 1));
                itemNames[i] = "Platillo " + (i+1);
            } else {
                menuItem = new JMenuItem("Bebida " + (i + 1));
                itemNames[i] = "Bebida " + (i+1);
            }
            menuItem.setFont(new Font("Arial", Font.PLAIN, 16));
            menuItem.setForeground(Color.BLACK);
            menuItem.setBackground(new Color(255, 255, 240));
            menuItem.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
            menuItem.setPreferredSize(new Dimension(120, 80));

            itemPanels[i] = new JPanel();
            itemPanels[i].setLayout(new GridBagLayout());
            itemPanels[i].setBackground(new Color(245, 222, 179));
            GridBagConstraints itemGbc = new GridBagConstraints();
            itemGbc.insets = new Insets(0, 0, 0, 0);
            itemGbc.fill = GridBagConstraints.BOTH;
            itemGbc.weightx = 0.33;
            itemGbc.weighty = 1.0;

            priceLabels[i] = new JLabel("$");
            priceLabels[i].setFont(new Font("Arial", Font.BOLD, 14));
            priceLabels[i].setForeground(new Color(199, 116, 11));
            itemGbc.gridx = 0;
            itemGbc.gridy = 0;
            itemGbc.anchor = GridBagConstraints.WEST;
            itemPanels[i].add(priceLabels[i], itemGbc);

            itemGbc.gridx = 1;
            itemGbc.gridy = 0;
            itemGbc.anchor = GridBagConstraints.CENTER;
            itemPanels[i].add(menuItem, itemGbc);

            addButtons[i] = new JButton("+");
            addButtons[i].setFont(new Font("Arial", Font.BOLD, 18));
            addButtons[i].setBackground(new Color(50, 205, 50));
            addButtons[i].setForeground(Color.WHITE);
            addButtons[i].setPreferredSize(new Dimension(30, 30));
            itemGbc.gridx = 2;
            itemGbc.gridy = 0;
            itemGbc.anchor = GridBagConstraints.EAST;
            itemPanels[i].add(addButtons[i], itemGbc);

            final int itemIndex = i; // Create a final variable for the ActionListener
            addButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Agregado " + itemNames[itemIndex] + " al pedido.");
                }
            });

            menuItems.add(menuItem);
        }

        // Add items to the category panel in the correct order
        for (int i = 0; i < 6; i++) {
            gbc.gridx = i % 3;
            gbc.gridy = 1 + i / 3;
            gbc.gridwidth = 1;
            gbc.weightx = 1.0;
            categoryPanel.add(itemPanels[i], gbc);
        }

        return categoryPanel;
    }

    private static JButton createRealizarPedidoButton() {
        JButton realizarPedidoButton = new JButton("Realizar Pedido");
        realizarPedidoButton.setBackground(new Color(255, 165, 0));
        realizarPedidoButton.setForeground(Color.BLACK);
        realizarPedidoButton.setFont(new Font("Arial", Font.BOLD, 20));
        realizarPedidoButton.setPreferredSize(new Dimension(200, 50));
        realizarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Pedido realizado. ¡Gracias!");
            }
        });
        return realizarPedidoButton;
    }
}

