import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetallePlatillo extends JFrame {

    private int cantidadTacos = 1;
    private JLabel cantidadLabel;
    private String nombrePlatillo;

    public DetallePlatillo(String platillo) {
        this.nombrePlatillo = platillo;
        setTitle(platillo);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(248, 240, 227));
        setLayout(new BorderLayout(10, 10));
        getRootPane().setBorder(new EmptyBorder(20, 20, 20, 20));

        // Header
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerPanel.setBackground(new Color(248, 240, 227));
        JButton regresarButton = new JButton("< Regresar");
        regresarButton.setFocusPainted(false);
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuPrincipal().setVisible(true);
                dispose();
            }
        });
        headerPanel.add(regresarButton);
        JLabel tituloLabel = new JLabel(platillo);
        tituloLabel.setFont(new Font("Alkatra", Font.BOLD, 24));
        headerPanel.add(tituloLabel);
        add(headerPanel, BorderLayout.NORTH);

        // Imagen tacos chorizo
        JPanel imagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        imagePanel.setBackground(new Color(248, 240, 227));
        JLabel imageLabel = new JLabel(new ImageIcon(new ImageIcon("images/tacos.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH))); // Replace with actual image based on platillo
        imagePanel.add(imageLabel);
        add(imagePanel, BorderLayout.CENTER);

        // Info
        JPanel infoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        infoPanel.setBackground(new Color(248, 240, 227));
        JTextArea infoText = new JTextArea("INFO: Detalles de " + platillo + ".");
        infoText.setEditable(false);
        infoText.setOpaque(false);
        infoText.setFont(new Font("Charm", Font.ITALIC, 14));
        infoPanel.add(infoText);
        add(infoPanel, BorderLayout.SOUTH);

        // Control de ordenes
        JPanel orderPanel = new JPanel();
        orderPanel.setLayout(new BoxLayout(orderPanel, BoxLayout.Y_AXIS));
        orderPanel.setBackground(new Color(255, 255, 224));
        orderPanel.setBorder(BorderFactory.createLineBorder(new Color(228, 213, 189), 2));
        orderPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        JLabel cantidadLabelText = new JLabel("Cantidad a ordenar");
        cantidadLabelText.setFont(new Font("Charm", Font.BOLD, 14));
        orderPanel.add(cantidadLabelText);

        JPanel cantidadControlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton menosButton = new JButton("-");
        menosButton.setFocusPainted(false);
        menosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cantidadTacos > 1) {
                    cantidadTacos--;
                    cantidadLabel.setText(String.valueOf(cantidadTacos));
                }
            }
        });
        cantidadLabel = new JLabel(String.valueOf(cantidadTacos));
        cantidadLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JButton masButton = new JButton("+");
        masButton.setFocusPainted(false);
        masButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadTacos++;
                cantidadLabel.setText(String.valueOf(cantidadTacos));
            }
        });

        cantidadControlPanel.add(menosButton);
        cantidadControlPanel.add(cantidadLabel);
        cantidadControlPanel.add(masButton);
        orderPanel.add(cantidadControlPanel);

        JLabel puedeLlevarLabel = new JLabel("Puede llevar:");
        puedeLlevarLabel.setFont(new Font("Arial", Font.BOLD, 14));
        orderPanel.add(puedeLlevarLabel);

        JCheckBox cilantroCheckBox = new JCheckBox("Cilantro", true);
        cilantroCheckBox.setOpaque(false);
        JCheckBox cebollaCheckBox = new JCheckBox("Cebolla", true);
        cebollaCheckBox.setOpaque(false);

        orderPanel.add(cilantroCheckBox);
        orderPanel.add(cebollaCheckBox);

        add(orderPanel, BorderLayout.EAST);

        // Boton continuar
        JPanel continuePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        continuePanel.setBackground(new Color(248, 240, 227));
        JButton continuarButton = new JButton("CONTINUAR");
        continuarButton.setBackground(new Color(240, 173, 78));
        continuarButton.setForeground(Color.WHITE);
        continuarButton.setFont(new Font("Poppins", Font.BOLD, 16));
        continuarButton.setFocusPainted(false);
        continuarButton.setPreferredSize(new Dimension(150, 40));
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Carrito().setVisible(true);
                dispose();
            }
        });
        continuePanel.add(continuarButton);
        add(continuePanel, BorderLayout.PAGE_END);

        setSize(700, 450);
        setLocationRelativeTo(null);
    }
}
