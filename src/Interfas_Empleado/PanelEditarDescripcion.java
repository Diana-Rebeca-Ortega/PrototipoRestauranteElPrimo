package Interfas_Empleado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEditarDescripcion extends JFrame {
    JTextField cajaPrecio, cajaRuta ;
    JTextArea cajaDecripcion;
    boolean seActualizo = false;

    String precio;
    public  PanelEditarDescripcion() {
        //setDefaultCloseOperation(EXIT_ON_CLOSE);//para que no queden registros en la ram
        setTitle("Editar Descripcion");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 251, 216, 255));
        setVisible(true);

        JLabel txtPrecio = new JLabel("Precio:");
        JLabel txtFoto = new JLabel("Ingresa la ruta de la foo del platillo:");
        JLabel txtDescripcion = new JLabel("Descripcion del platillo:");

        txtPrecio.setBounds(20,30,100,20);
        txtFoto.setBounds(20,50,200,20);
        txtDescripcion.setBounds(20,100,200,20);

        add( txtPrecio );
        add(txtDescripcion);
        add(txtFoto);

         cajaPrecio = new JTextField();
         cajaRuta = new JTextField();
         cajaDecripcion = new JTextArea();

        cajaDecripcion.setLineWrap(true);

        cajaPrecio.setBounds(100,30,100,20);
        cajaRuta.setBounds(20,70,400,20);
        cajaDecripcion.setBounds(20,120,400,200);

        add(cajaPrecio);
        add(cajaRuta);
        add(cajaDecripcion);

       // EditarProductoEmpleado ep = new EditarProductoEmpleado();

        JButton aceptar = new JButton("Aceptar");
        aceptar.setBounds( getWidth()-120,430,100,20);
        add(aceptar);
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                precio= cajaPrecio.getText();
                seActualizo= true;
                setVisible(false);
                System.out.println( seActualizo+"siii");
            }
        });

    }

}
