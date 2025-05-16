import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ConfirmacionCompra extends JFrame {

    public ConfirmacionCompra() {
        setTitle("¡Gracias por tu compra!");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(248, 240, 227));
        setLayout(new BorderLayout(10, 10));
        getRootPane().setBorder(new EmptyBorder(20, 20, 20, 20));


        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titlePanel.setBackground(new Color(248, 240, 227));
        JLabel titleLabel = new JLabel("¡Gracias por tu compra!");
        titleLabel.setFont(new Font("Bagel Fat One", Font.BOLD, 28));
        titleLabel.setForeground(new Color(240, 173, 78));
        titlePanel.add(titleLabel);
        add(titlePanel, BorderLayout.NORTH);

        // detalles de la orden
        JPanel detailsPanel = new JPanel(new GridBagLayout());
        detailsPanel.setBackground(new Color(255, 255, 224));
        detailsPanel.setBorder(BorderFactory.createLineBorder(new Color(228, 213, 189), 2));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10);

        // Logo
        JLabel logoLabel = new JLabel(new ImageIcon(new ImageIcon("images/elPimo.png").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH))); // Replace with your logo
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        detailsPanel.add(logoLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        detailsPanel.add(new JLabel("Total: $__________"), gbc);

        gbc.gridy = 1;
        detailsPanel.add(new JLabel("Número de pedido: " + generateOrderNumber()), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        detailsPanel.add(new JLabel("Código de pedido: **********"), gbc);

        gbc.gridy = 3;
        detailsPanel.add(new JLabel("Fecha de compra: " + getCurrentDate()), gbc);

        add(detailsPanel, BorderLayout.CENTER);



        JPanel waitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        waitPanel.setBackground(new Color(248, 240, 227));
        JLabel waitLabel1 = new JLabel("Hay __ pedidos delante de usted");
        waitLabel1.setFont(new Font("Poppins", Font.PLAIN, 16));
        JLabel waitLabel2 = new JLabel("Su tiempo de espera aproximado es de: __________");
        waitLabel2.setFont(new Font("Poppins", Font.PLAIN, 16));
        waitPanel.add(waitLabel1);
        waitPanel.add(waitLabel2);
        add(waitPanel, BorderLayout.SOUTH);

        // boton ok
        JPanel okPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        okPanel.setBackground(new Color(248, 240, 227));
        JButton okButton = new JButton("Ok");
        okButton.setBackground(new Color(240, 173, 78));
        okButton.setForeground(Color.WHITE);
        okButton.setFont(new Font("Poppins", Font.BOLD, 16));
        okButton.setFocusPainted(false);
        okButton.setPreferredSize(new Dimension(100, 40));
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuPrincipal().setVisible(true);
                dispose();
            }
        });
        okPanel.add(okButton);
        add(okPanel, BorderLayout.PAGE_END);

        setSize(400, 350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private String generateOrderNumber() {
        Random random = new Random();
        return String.format("%06d", random.nextInt(1000000));
    }

    private String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(new Date());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ConfirmacionCompra::new);
    }
}