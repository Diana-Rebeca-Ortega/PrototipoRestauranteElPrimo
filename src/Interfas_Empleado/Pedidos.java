package Interfas_Empleado;

import javax.swing.*;
import java.awt.*;

class PedidosEmpleado extends JFrame{
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

        ImageIcon imPedidos = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\pedidosP.png");
        Image im = imPedidos.getImage().getScaledInstance(100,40, Image.SCALE_SMOOTH);
        JLabel txtPedidos = new JLabel(new ImageIcon(im));
        txtPedidos.setBounds((getWidth()/2)-50,10,100,40);
        add(txtPedidos);

        JLabel txtPlatillo, txtCantidadPlatillo, txtBebida, txtCantidadBebida, txtCliente, txtTipoEntrega, txtTiempoEstimado;
        txtPlatillo=new JLabel("Platillo:");
        txtCantidadPlatillo = new JLabel("Cantidad:");
        txtBebida = new JLabel("Bebida:");
        txtCantidadBebida = new JLabel("Cantidad:");
        txtCliente = new JLabel("Cliente:");
        txtTipoEntrega = new JLabel("Tipo de entrega: ");
        txtTiempoEstimado = new JLabel("Tiempo Estimado:");

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

    }
}
public class Pedidos {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PedidosEmpleado();
            }
        });
    }
}