package Interfas_Empleado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class VentanaEmpleado extends JFrame{
    public VentanaEmpleado() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);//para que no queden registros en la ram
        setTitle("Menu Empleado");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(255,251,216,255));
        setVisible(true);

        ImageIcon imMenu = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\menuP.png");
        Image im = imMenu.getImage().getScaledInstance(100,40, Image.SCALE_SMOOTH);
        JLabel txtMenu = new JLabel(new ImageIcon(im));
        txtMenu.setBounds((getWidth()/2)-50,10,100,40);
        add(txtMenu);


        ImageIcon imRegresar = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\regresarP.png");
        Image imRegresarScala = imRegresar.getImage().getScaledInstance(100,40, Image.SCALE_SMOOTH);
        JButton btnRegresar = new JButton( new ImageIcon(imRegresarScala) );
        btnRegresar.setBounds(15,10,100,40);
        add(btnRegresar);


        //******************************Panel 1************
        JPanel  panelUno = new JPanel();
        panelUno.setBounds(30, 100,170,150);
        panelUno.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelUno.setBackground(new Color(255,255,255));
        panelUno.setLayout(null);
        JLabel txtFotoPanel1 = null;
        JLabel txtPrecioPanel1 = null;
        JLabel txtDescripcionPanel1 = null;
        añadirPanel(txtDescripcionPanel1, txtPrecioPanel1, txtFotoPanel1, panelUno  );
        add(panelUno);


        //***************************Panel 2*****************************
        JPanel  panelDos = new JPanel();
        panelDos.setBounds(240, 100,170,150);
        panelDos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelDos.setBackground(new Color(255,255,255));
        panelDos.setLayout(null);

        JLabel txtFotoPanel2 = null;
        JLabel txtPrecioPanel2 = null;
        JLabel txtDescripcionPanel2 = null;
        añadirPanel(txtDescripcionPanel2, txtPrecioPanel2, txtFotoPanel2, panelDos  );

        add(panelDos);

        //***************************Panel 3**********************

        JPanel  panelTres = new JPanel();
        panelTres.setBounds(450, 100,170,150);
        panelTres.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelTres.setBackground(new Color(255,255,255));
        panelTres.setLayout(null);

        JLabel txtFotoPanel3 = null;
        JLabel txtPrecioPanel3 = null;
        JLabel txtDescripcionPanel3 = null;
        añadirPanel(txtDescripcionPanel3, txtPrecioPanel3, txtFotoPanel3, panelTres  );

        add(panelTres);


        //********************Botones*******************
        JButton btnPanelUno = new JButton("EDITAR");
        btnPanelUno.setBounds(30,260, 170,20);
        btnPanelUno.setBackground(new Color(254,195,125));
        add(btnPanelUno);
        btnPanelUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new EditarProductoEmpleado();
                    }
                });
            }
        });

        JButton btnPanelDos = new JButton("EDITAR");
        btnPanelDos.setBounds(240,260, 170,20);
        btnPanelDos.setBackground(new Color(254,195,125));
        add(btnPanelDos);

        JButton btnPanelTres = new JButton("EDITAR");
        btnPanelTres.setBounds(450,260, 170,20);
        btnPanelTres.setBackground(new Color(254,195,125));
        add(btnPanelTres);

    }
    public void añadirPanel(JLabel txtDescripcion, JLabel txtPrecio, JLabel txtImagen, JPanel panelX){
        txtDescripcion = new JLabel("Descripcion:");
        txtDescripcion.setBounds(5, 60,160,40);
        panelX.add(txtDescripcion);

        txtPrecio = new JLabel(new ImageIcon(  "C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\precioP.png"));
        txtPrecio.setBounds(5, 10,50,30);
        panelX.add(txtPrecio);

        txtImagen = new JLabel(new ImageIcon(  "C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\imagen.png"));
        txtImagen.setBounds(95, 3,60,60);
        panelX.add(txtImagen);
    }
}
public class Menu_Empleado {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaEmpleado();
            }
        });
    }
}