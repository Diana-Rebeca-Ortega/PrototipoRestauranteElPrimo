package Interfas_Empleado;

import javax.swing.*;
import java.awt.*;

class EditarProductoEmpleado extends JFrame{
    public  EditarProductoEmpleado(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para que no queden registros en la ram
        setTitle("Editar Platillo");
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

        JPanel panelEditar = new JPanel();
        panelEditar.setBounds((getWidth()/2)-160, 30,320,300);
        panelEditar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelEditar.setBackground(new Color(255,255,255));
        panelEditar.setLayout(null);

        JLabel txtDescripcion = new JLabel("Descripcion:");
        txtDescripcion.setBounds(15, 100,160,40);
        panelEditar.add(txtDescripcion);

        JLabel txtPrecio = new JLabel(new ImageIcon(  "C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\precioP.png"));
        txtPrecio.setBounds(25, 25,50,30);
        panelEditar.add(txtPrecio);

        JLabel txtImagen = new JLabel(new ImageIcon(  "C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\imagen.png"));
        txtImagen.setBounds(200, 15,80,80);
        panelEditar.add(txtImagen);

        add( panelEditar);

        JButton btnExistencia = new JButton("En existencia");
        JButton btnTerminado = new JButton("Terminado");
        JButton btnEditarDescripcion = new JButton("Editar Descripcion");
        JButton btnConfirmar = new JButton("Confirmar cambios");

        btnExistencia.setBackground(new Color(254,195,125));
        btnTerminado.setBackground(new Color(254,195,125));
        btnEditarDescripcion.setBackground(new Color(254,195,125));
        btnConfirmar.setBackground(new Color(254,195,125));

        btnExistencia.setBounds(100,340, 200,20);
        btnTerminado.setBounds(340,340, 200,20);
        btnEditarDescripcion.setBounds(100,370, 200,20);
        btnConfirmar.setBounds(340,370, 200,20);

        add(btnExistencia);
        add(btnTerminado);
        add(btnEditarDescripcion);
        add(btnConfirmar);

    }
}
public class EditarProducto {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditarProductoEmpleado();
            }
        });
    }
}