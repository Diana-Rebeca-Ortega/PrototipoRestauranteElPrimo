import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MenuPrincipal extends JFrame {

    private Map<String, String[]> menuItems = new HashMap<>();

    public MenuPrincipal() {
        setTitle("Realizar Pedido");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(248, 240, 227));
        setLayout(new BorderLayout(10, 10));
        getRootPane().setBorder(new EmptyBorder(15, 20, 15, 20));


        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerPanel.setBackground(new Color(248, 240, 227));
        JButton regresarButton = new JButton("< Regresar");
        regresarButton.setFocusPainted(false);
        headerPanel.add(regresarButton);
        JLabel tituloLabel = new JLabel("REALIZAR PEDIDO");
        tituloLabel.setFont(new Font("Bagel Fat One", Font.PLAIN, 24));
        headerPanel.add(tituloLabel);
        JPanel tipoEntregaPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        tipoEntregaPanel.setBackground(new Color(248, 240, 227));
        JLabel tipoEntregaLabel = new JLabel("Tipo de entrega:");
        tipoEntregaLabel.setFont(new Font("Niconne", Font.ITALIC, 12));
        String[] opcionesEntrega = {"Seleccionar", "A domicilio", "Recoger"};
        JComboBox<String> tipoEntregaCombo = new JComboBox<>(opcionesEntrega);
        tipoEntregaPanel.add(tipoEntregaLabel);
        tipoEntregaPanel.add(tipoEntregaCombo);
        headerPanel.add(Box.createHorizontalGlue());
        headerPanel.add(tipoEntregaPanel);
        add(headerPanel, BorderLayout.NORTH);

        // Panel Menu
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBackground(new Color(248, 240, 227));
        JScrollPane scrollPane = new JScrollPane(menuPanel);
        scrollPane.setBorder(null);
        add(scrollPane, BorderLayout.CENTER);

        // Bsqueda
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        searchPanel.setBackground(new Color(248, 240, 227));
        JTextField searchTextField = new JTextField(25);
        JButton searchButton = new JButton("Buscar");
        searchPanel.add(searchTextField);
        searchPanel.add(searchButton);
        menuPanel.add(searchPanel);
        menuPanel.add(Box.createVerticalStrut(15));

        // Menu
        menuItems.put("TORTAS", new String[]{"Chorizo", "Adobada", "Birria", "Lomo", "Bistec", "Jamón"});
        menuItems.put("TACOS", new String[]{"Chorizo", "Adobada", "Birria", "Lomo", "Bistec", "Jamón"});
        menuItems.put("DESAYUNOS", new String[]{"Chorizo", "Adobada", "Birria", "Lomo", "Bistec", "Jamón"});
        menuItems.put("GORDITAS", new String[]{"Chorizo", "Adobada", "Birria", "Lomo", "Bistec", "Jamón"});
        menuItems.put("QUESADILLAS", new String[]{"Chorizo", "Adobada", "Birria", "Lomo", "Bistec", "Jamón"});

        // Categorias
        for (String categoria : menuItems.keySet()) {
            JPanel categoriaTituloPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            categoriaTituloPanel.setBackground(new Color(248, 240, 227));
            JLabel categoriaTitulo = new JLabel(categoria);
            categoriaTitulo.setFont(new Font("Alkatra", Font.BOLD, 16));
            categoriaTitulo.setForeground(new Color(122, 92, 61));
            categoriaTituloPanel.add(categoriaTitulo);
            menuPanel.add(categoriaTituloPanel);
            menuPanel.add(Box.createVerticalStrut(5));

            JPanel itemsGridPanel = new JPanel(new GridLayout(0, 3, 10, 10));
            itemsGridPanel.setBackground(new Color(248, 240, 227));
            for (String item : menuItems.get(categoria)) {
                JPanel itemPanel = new JPanel(new BorderLayout());
                itemPanel.setBackground(new Color(255, 255, 224));
                itemPanel.setBorder(BorderFactory.createLineBorder(new Color(228, 213, 189)));

                JLabel itemNameLabel = new JLabel(item, SwingConstants.CENTER);
                itemNameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
                JButton addButton = new JButton(new ImageIcon(new ImageIcon("images/add.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
                addButton.setFocusPainted(false);
                addButton.setHorizontalAlignment(SwingConstants.CENTER);
                addButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new DetallePlatillo(item).setVisible(true);
                        dispose();
                    }
                });

                JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                buttonPanel.setOpaque(false);
                buttonPanel.add(addButton);

                itemPanel.add(buttonPanel, BorderLayout.CENTER);
                itemPanel.add(itemNameLabel, BorderLayout.SOUTH);

                itemsGridPanel.add(itemPanel);
            }
            menuPanel.add(itemsGridPanel);
            menuPanel.add(Box.createVerticalStrut(20));
        }

        setSize(700, 550);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuPrincipal::new);
    }
}