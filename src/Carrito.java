import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Carrito extends JFrame {

    public Carrito() {
        setTitle("Carrito");
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
        JLabel tituloLabel = new JLabel("Carrito");
        tituloLabel.setFont(new Font("Bagel Fat One", Font.BOLD, 24));
        headerPanel.add(tituloLabel);
        JLabel carritoIcon = new JLabel(new ImageIcon(new ImageIcon("images/carro.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH))); // Replace with your cart icon
        headerPanel.add(carritoIcon);
        add(headerPanel, BorderLayout.NORTH);

        JPanel itemPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        itemPanel.setBackground(new Color(255, 255, 224));
        itemPanel.setBorder(BorderFactory.createLineBorder(new Color(228, 213, 189), 2));
        JPanel imagePlaceholder = new JPanel();
        imagePlaceholder.setPreferredSize(new Dimension(80, 80));
        imagePlaceholder.setBackground(Color.LIGHT_GRAY);
        itemPanel.add(imagePlaceholder);
        JPanel textDetails = new JPanel(new GridLayout(3, 1));
        textDetails.setOpaque(false);
        textDetails.add(new JLabel("Platillo: __________"));
        textDetails.add(new JLabel("Precio c/u: $__"));
        textDetails.add(new JLabel("Cantidad: __"));
        itemPanel.add(textDetails);
        add(itemPanel, BorderLayout.CENTER);

        // Total
        JPanel totalPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        totalPanel.setBackground(new Color(248, 240, 227));
        JLabel totalLabel = new JLabel("Total a pagar: $__________");
        totalLabel.setFont(new Font("Poppins", Font.BOLD, 16));
        totalPanel.add(totalLabel);
        add(totalPanel, BorderLayout.SOUTH);

        // Boton comprar
        JPanel buyPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buyPanel.setBackground(new Color(248, 240, 227));
        JButton comprarButton = new JButton("Comprar");
        comprarButton.setBackground(new Color(240, 173, 78));
        comprarButton.setForeground(Color.WHITE);
        comprarButton.setFont(new Font("Poppins", Font.BOLD, 16));
        comprarButton.setFocusPainted(false);
        comprarButton.setPreferredSize(new Dimension(150, 40));
        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConfirmacionCompra().setVisible(true);
                dispose();
            }
        });
        buyPanel.add(comprarButton);
        add(buyPanel, BorderLayout.PAGE_END);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Carrito::new);
    }
}