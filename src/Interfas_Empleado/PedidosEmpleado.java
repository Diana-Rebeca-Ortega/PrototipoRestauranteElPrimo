package Interfas_Empleado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PedidosEmpleado  extends JFrame{
    public PedidosEmpleado(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para que no queden registros en la ram
        setTitle("Pedidos Para Tomar la Orden");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(255,251,216,255));
        setVisible(true);

        ImageIcon imRegresar = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\regresarP.png");
        Image imRegresarScala = imRegresar.getImage().getScaledInstance(100,40, Image.SCALE_SMOOTH);
        JButton btnRegresar = new JButton( new ImageIcon(imRegresarScala) );
        btnRegresar.setBounds(15,10,100,40);
        add(btnRegresar);
        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        ImageIcon imPedidos = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\pedidosP.png");
        Image im = imPedidos.getImage().getScaledInstance(100,40, Image.SCALE_SMOOTH);
        JLabel txtPedidos = new JLabel(new ImageIcon(im));
        txtPedidos.setBounds((getWidth()/2)-50,10,100,40);
        add(txtPedidos);

        JLabel txtPlatillo, txtCantidadPlatillo, txtBebida, txtCantidadBebida, txtCliente, txtTipoEntrega, txtTiempoEstimado;
        txtPlatillo=new JLabel("Platillo: Tacos de chorizo");
        txtCantidadPlatillo = new JLabel("Cantidad: 1 orden");
        txtBebida = new JLabel("Bebida: Pepsi ");
        txtCantidadBebida = new JLabel("Cantidad:600ml");
        txtCliente = new JLabel("Cliente: Joaquin Guzman");
        txtTipoEntrega = new JLabel("Tipo de entrega: restaurante ");
        txtTiempoEstimado = new JLabel("Tiempo Estimado:");

        JTextField cajaTiempo = new JTextField(5);
        cajaTiempo.setBounds(140,280,50,20);
        add(cajaTiempo);

        txtPlatillo.setBounds(30,100,300,20);
        txtCantidadPlatillo.setBounds(30,130,300,20);
        txtBebida.setBounds(30,160,300,20);
        txtCantidadBebida.setBounds(30,190,300,20);
        txtCliente.setBounds(30,220,300,20);
        txtTipoEntrega.setBounds(30,250,300,20);
        txtTiempoEstimado.setBounds(30,280,300,20);


        add(txtPlatillo);
        add(txtCantidadPlatillo);
        add(txtBebida);
        add(txtCantidadBebida);
        add(txtCliente);
        add(txtTipoEntrega);
        add(txtTiempoEstimado);

        JButton btnACTUALIZAR = new JButton("Actualizar");
        btnACTUALIZAR.setBackground(new Color(254,195,125));
        btnACTUALIZAR.setBounds(getWidth()-120,getHeight()-100, 100,25);
        add(btnACTUALIZAR);
        btnACTUALIZAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

    }
}
