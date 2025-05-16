package Interfas_Empleado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class  ActulizarPedidosEmpleado  extends JFrame implements ActionListener {
    JButton btnPerfil;
    public ActulizarPedidosEmpleado(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para que no queden registros en la ram
        setTitle("Menu Empleado");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(255,251,216,255));
        setVisible(true);

        ImageIcon imMenu = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\ActualizarPedidoP.png");
        Image im = imMenu.getImage().getScaledInstance(400,70, Image.SCALE_SMOOTH);
        JLabel txtMenu = new JLabel(new ImageIcon(im));
        txtMenu.setBounds((getWidth()/2)-200,10,400,70);
        add(txtMenu);

        ImageIcon imRegresar = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\regresarP.png");
        Image imRegresarScala = imRegresar.getImage().getScaledInstance(100,40, Image.SCALE_SMOOTH);
        JButton btnRegresar = new JButton( new ImageIcon(imRegresarScala) );
        btnRegresar.setBounds(15,10,100,40);
        add(btnRegresar);

        JPanel  panelGeneral = new JPanel();
        panelGeneral.setBounds(30, 100,620,330);
        panelGeneral.setBorder(BorderFactory.createLineBorder(new Color(246,157,106)));
        panelGeneral.setBackground(new Color(255,236,159));
        panelGeneral.setLayout(null);
        add(panelGeneral);

        JPanel  panelPedidos = new JPanel();
        panelPedidos.setBounds(10, 10,600,200);
        panelPedidos.setBorder(BorderFactory.createLineBorder(new Color(247,196,127)));
        panelPedidos.setBackground(new Color(255,251,216,255));
        panelPedidos.setLayout(null);

        JPanel  panelPedidoCliente = new JPanel();
        panelPedidoCliente.setBounds(90, 10,500,140);
        panelPedidoCliente.setBorder(BorderFactory.createLineBorder(Color.gray));
        panelPedidoCliente.setBackground(new Color(255,255,255));
        panelPedidoCliente.setLayout(null);

        JLabel txtNoCliente = new JLabel("NO.Cliente:");
        txtNoCliente.setBounds(5,7,100,20);
        panelPedidoCliente.add(txtNoCliente);

        JLabel txtIDCliente = new JLabel("ID.Cliente:");
        txtIDCliente.setBounds(5,23,100,20);
        panelPedidoCliente.add(txtIDCliente);

        JLabel txtNombre = new JLabel("Nombre:");
        txtNombre.setBounds(5,39,100,20);
        panelPedidoCliente.add(txtNombre);

        JLabel txtPlatillo = new JLabel("Platillo:");
        txtPlatillo.setBounds(5,55,100,20);
        panelPedidoCliente.add(txtPlatillo);

        JLabel txtActualizacion = new JLabel("Actualización:");
        txtActualizacion.setBounds(5,110,100,20);
        panelPedidoCliente.add(txtActualizacion);

        JComboBox comboActualizacion = new JComboBox();
        comboActualizacion.setBounds(100,110,340,20);
        comboActualizacion.addItem("Elige un estado");
        comboActualizacion.addItem("En proceso de elaboracion");
        comboActualizacion.addItem("En proceso de empaquetar");
        comboActualizacion.addItem("En proceso de entrega");
        panelPedidoCliente.add(comboActualizacion);

        panelPedidos.add(panelPedidoCliente);

        ImageIcon imPerfil = new ImageIcon("C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\fotoPerfilNaranjaP.png");
        Image imPerfilScala = imPerfil.getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH);
         btnPerfil = new JButton( new ImageIcon(imPerfilScala) );
        btnPerfil.setBorder(BorderFactory.createLineBorder(new Color(255,251,216,255)));
        btnPerfil.setBounds(15,10,60,60);
        panelPedidos.add(btnPerfil);
        btnPerfil.addActionListener(this);

        JLabel txtYaFueEntregado = new JLabel("¿Ya fue entregado el pedido?");
        txtYaFueEntregado.setBounds(250,150,200,20);
        panelPedidos.add(txtYaFueEntregado);

        JButton btnPanelTres = new JButton("Confirmado");
        btnPanelTres.setBounds(250,170, 170,20);
        btnPanelTres.setBackground(new Color(254,195,125));
        panelPedidos.add(btnPanelTres);

        panelGeneral.add(panelPedidos);

        JLabel txtHistorial = new JLabel("Ver historial de ventas");
        txtHistorial.setBounds(5,getHeight()-60,200,20);
        add(txtHistorial);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnPerfil){
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new PedidosEmpleado();
                }
            });
        }
    }
}


public class ActualizarPedidos {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ActulizarPedidosEmpleado();
            }
        });
    }
}