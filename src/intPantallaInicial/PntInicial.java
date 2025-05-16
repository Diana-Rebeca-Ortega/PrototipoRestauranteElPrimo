package intPantallaInicial;

import javax.swing.*;
import java.awt.*;

public class PntInicial {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear la ventana principal
            JFrame frame = new JFrame("Restaurante El Primo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout());
            frame.getContentPane().setBackground(new Color(255, 245, 200));

            JPanel topPanel = new JPanel();
            topPanel.setBackground(new Color(255, 245, 200));
            topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
            topPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JPanel titlePanel = new JPanel();
            titlePanel.setBackground(new Color(255, 245, 200));
            titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

            JLabel titleLabel = new JLabel("RESTAURANTE \"EL PRIMO\"");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
            titleLabel.setForeground(Color.BLACK);

            // Cargar la imagen del logo
            ImageIcon logoIcon = new ImageIcon(PntInicial.class.getResource("/Iconos/Logo.png"));
            Image logoImage = logoIcon.getImage();

            // Escalar la imagen a un tamaño más pequeño
            Image scaledLogoImage = logoImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledLogoIcon = new ImageIcon(scaledLogoImage);

            JLabel logoLabel = new JLabel(scaledLogoIcon);
            logoLabel.setFont(new Font("Arial", Font.BOLD, 20));
            logoLabel.setForeground(Color.BLACK);
            logoLabel.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2));

            titlePanel.add(titleLabel);
            titlePanel.add(logoLabel);
            JLabel descriptionLabel = new JLabel("Somos un negocio que nos dedicamos a hacer platillos" +
                    "mexicanos con el sazón y sabor que nos distingue, elaborado" +
                    "con ingredientes de alta calidad y bajo alta higiene en el" +
                    "proceso, llevando hasta la comodidad de los hogares en la" +
                    "mejor atención de nuestros colaboradores");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setForeground(Color.BLACK);
            descriptionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            topPanel.add(titlePanel);
            topPanel.add(Box.createVerticalStrut(10));
            topPanel.add(descriptionLabel);
            topPanel.add(Box.createVerticalStrut(20));

            JPanel sectionsPanel = new JPanel();
            sectionsPanel.setBackground(new Color(255, 245, 200));
            sectionsPanel.setLayout(new GridLayout(1, 3, 20, 10));
            sectionsPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));

            ImageIcon servicioIcon = new ImageIcon(PntInicial.class.getResource("/Iconos/Servicio.png"));
            ImageIcon seguimientoIcon = new ImageIcon(PntInicial.class.getResource("/Iconos/Seguimiento.png"));
            ImageIcon actualizacionIcon = new ImageIcon(PntInicial.class.getResource("/Iconos/Actualización.png"));

            int buttonIconWidth = 24;
            int buttonIconHeight = 24;
            Image scaledServicioImage = servicioIcon.getImage().getScaledInstance(buttonIconWidth, buttonIconHeight, Image.SCALE_SMOOTH);
            ImageIcon scaledServicioIcon = new ImageIcon(scaledServicioImage);

            Image scaledSeguimientoImage = seguimientoIcon.getImage().getScaledInstance(buttonIconWidth, buttonIconHeight, Image.SCALE_SMOOTH);
            ImageIcon scaledSeguimientoIcon = new ImageIcon(scaledSeguimientoImage);

            Image scaledActualizacionImage = actualizacionIcon.getImage().getScaledInstance(buttonIconWidth, buttonIconHeight, Image.SCALE_SMOOTH);
            ImageIcon scaledActualizacionIcon = new ImageIcon(scaledActualizacionImage);

            JButton serviceButton = new JButton("  Servicio\n  Contamos con un servicio que se lleve dentro del local y uno que es a domicilio.", scaledServicioIcon);
            serviceButton.setBackground(Color.WHITE);
            serviceButton.setForeground(Color.BLACK);
            serviceButton.setFont(new Font("Arial", Font.PLAIN, 12));
            serviceButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 1));
            serviceButton.setHorizontalAlignment(SwingConstants.LEFT);
            serviceButton.setVerticalTextPosition(SwingConstants.BOTTOM);
            serviceButton.setHorizontalTextPosition(SwingConstants.CENTER);
            serviceButton.setIconTextGap(8);

            JButton trackingButton = new JButton("  Seguimiento\n  Puedes llevar el seguimiento de tu pedido,desde que se registra, hasta que se encuentra en entrega.", scaledSeguimientoIcon);
            trackingButton.setBackground(Color.WHITE);
            trackingButton.setForeground(Color.BLACK);
            trackingButton.setFont(new Font("Arial", Font.PLAIN, 12));
            trackingButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 1));
            trackingButton.setHorizontalAlignment(SwingConstants.LEFT);
            trackingButton.setVerticalTextPosition(SwingConstants.BOTTOM);
            trackingButton.setHorizontalTextPosition(SwingConstants.CENTER);
            trackingButton.setIconTextGap(8);

            JButton updateButton = new JButton("  Actualización\n  Cada cierto tiempo, el menú se estará actualizando para que muestre solo lo disponible.", scaledActualizacionIcon);
            updateButton.setBackground(Color.WHITE);
            updateButton.setForeground(Color.BLACK);
            updateButton.setFont(new Font("Arial", Font.PLAIN, 12));
            updateButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 1));
            updateButton.setHorizontalAlignment(SwingConstants.LEFT);
            updateButton.setVerticalTextPosition(SwingConstants.BOTTOM);
            updateButton.setHorizontalTextPosition(SwingConstants.CENTER);
            updateButton.setIconTextGap(8);

            sectionsPanel.add(serviceButton);
            sectionsPanel.add(trackingButton);
            sectionsPanel.add(updateButton);

            JPanel locationPanel = new JPanel();
            locationPanel.setBackground(new Color(255, 245, 200));
            locationPanel.setLayout(new BoxLayout(locationPanel, BoxLayout.Y_AXIS));
            locationPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JLabel locationLabel = new JLabel("UBICACIÓN");
            locationLabel.setFont(new Font("Arial", Font.BOLD, 16));
            locationLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel addressLabel = new JLabel("C Sur #7, Ermita de Guadalupe (Carretera Jerez - Tepetongo)");
            addressLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            addressLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel mapPlaceholder = new JLabel("[Mapa]");
            mapPlaceholder.setFont(new Font("Arial", Font.PLAIN, 14));
            mapPlaceholder.setAlignmentX(Component.CENTER_ALIGNMENT);
            mapPlaceholder.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            mapPlaceholder.setPreferredSize(new Dimension(200, 100));

            locationPanel.add(locationLabel);
            locationPanel.add(Box.createVerticalStrut(10));
            locationPanel.add(addressLabel);
            locationPanel.add(Box.createVerticalStrut(10));
            locationPanel.add(mapPlaceholder);
            locationPanel.add(Box.createVerticalStrut(10));

            JPanel commentsPanel = new JPanel();
            commentsPanel.setBackground(new Color(255, 245, 200));
            commentsPanel.setLayout(new BoxLayout(commentsPanel, BoxLayout.Y_AXIS));
            commentsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JLabel commentsLabel = new JLabel("COMENTARIOS");
            commentsLabel.setFont(new Font("Arial", Font.BOLD, 16));
            commentsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JTextField commentField = new JTextField("Escribe un comentario...");
            commentField.setMaximumSize(new Dimension(300, 30));

            JButton submitCommentButton = new JButton("ENVIAR");
            submitCommentButton.setBackground(Color.ORANGE);
            submitCommentButton.setForeground(Color.BLACK);

            commentsPanel.add(commentsLabel);
            commentsPanel.add(Box.createVerticalStrut(10));
            commentsPanel.add(commentField);
            commentsPanel.add(Box.createVerticalStrut(10));
            commentsPanel.add(submitCommentButton);
            commentsPanel.add(Box.createVerticalStrut(20));

            JPanel contactPanel = new JPanel();
            contactPanel.setBackground(new Color(255, 245, 200));
            contactPanel.setLayout(new BoxLayout(contactPanel, BoxLayout.Y_AXIS));
            contactPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JLabel contactLabel = new JLabel("CONTACTOS");
            contactLabel.setFont(new Font("Arial", Font.BOLD, 16));
            contactLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel contactQuestionLabel = new JLabel("¿Tienes alguna duda o quieres ordenar algo?");
            contactQuestionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            contactQuestionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel contactInstructionLabel = new JLabel("¡No dudes en contactarnos!");
            contactInstructionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            contactInstructionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JTextField nameField = new JTextField("Nombre");
            nameField.setMaximumSize(new Dimension(300, 30));

            JTextArea messageArea = new JTextArea("Mensaje", 3, 20);
            messageArea.setMaximumSize(new Dimension(300, 60));

            JButton callButton = new JButton("Llámanos");
            callButton.setBackground(Color.ORANGE);
            callButton.setForeground(Color.BLACK);

            contactPanel.add(contactLabel);
            contactPanel.add(Box.createVerticalStrut(10));
            contactPanel.add(contactQuestionLabel);
            contactPanel.add(contactInstructionLabel);
            contactPanel.add(Box.createVerticalStrut(10));
            contactPanel.add(nameField);
            contactPanel.add(Box.createVerticalStrut(10));
            contactPanel.add(messageArea);
            contactPanel.add(Box.createVerticalStrut(10));
            contactPanel.add(callButton);

            serviceButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Servicio: Atención local y a domicilio."));
            trackingButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Seguimiento: Estado de tu pedido."));
            updateButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Actualización: El menú se actualiza periódicamente."));
            submitCommentButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Comentario enviado: " + commentField.getText()));
            callButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Llamando... Nombre: " + nameField.getText() + "\nMensaje: " + messageArea.getText()));

            JPanel mainPanel = new JPanel();
            mainPanel.setBackground(new Color(255, 245, 200));
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            mainPanel.add(topPanel);
            mainPanel.add(sectionsPanel);
            mainPanel.add(locationPanel);
            mainPanel.add(commentsPanel);
            mainPanel.add(contactPanel);

            JScrollPane scrollPane = new JScrollPane(mainPanel);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}