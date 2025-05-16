package Interfas_Empleado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EditarProductoEmpleado extends JFrame implements ActionListener{

    JButton btnEditarDescripcion;
    JLabel btnPrecio;

    JLabel actPrecio;
    //PanelEditarDescripcion pe = new PanelEditarDescripcion();

    public  EditarProductoEmpleado(){
        //setDefaultCloseOperation(EXIT_ON_CLOSE);//para que no queden registros en la ram
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
        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JPanel panelEditar = new JPanel();
        panelEditar.setBounds((getWidth()/2)-160, 30,320,300);
        panelEditar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelEditar.setBackground(new Color(255,255,255));
        panelEditar.setLayout(null);

        JLabel txtDescripcion = new JLabel("Descripcion:");
        txtDescripcion.setBounds(15, 100,160,40);
        panelEditar.add(txtDescripcion);

        btnPrecio = new JLabel(new ImageIcon(  "C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\precioP.png"));
        btnPrecio.setBounds(25, 25,50,30);
        panelEditar.add(btnPrecio);

        actPrecio = new JLabel("30.00");
        actPrecio.setBounds(25,50, 85,20);
        panelEditar.add(actPrecio);

        JLabel txtImagen = new JLabel(new ImageIcon(  "C:\\Users\\Marcelo\\Documents\\000SEXTO\\practicas2025IntelliJ\\PrototipoRestauranteElPrimo\\src\\ICONOS\\imagen.png"));
        txtImagen.setBounds(200, 15,80,80);
        panelEditar.add(txtImagen);

        add( panelEditar);

        JButton btnExistencia = new JButton("En existencia");
        JButton btnTerminado = new JButton("Terminado");
         btnEditarDescripcion = new JButton("Editar Descripcion");
        JButton btnConfirmar = new JButton("Confirmar cambios");

        btnExistencia.setBackground(new Color(254,195,125));
        btnTerminado.setBackground(new Color(254,195,125));
        btnEditarDescripcion.setBackground(new Color(254,195,125));
        btnConfirmar.setBackground(new Color(255,100,10));

        btnEditarDescripcion.addActionListener(this);


        btnExistencia.setBounds(100,340, 200,20);
        btnTerminado.setBounds(340,340, 200,20);
        btnEditarDescripcion.setBounds(100,370, 200,20);
        btnConfirmar.setBounds(340,370, 200,20);

        btnEditarDescripcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        add(btnExistencia);
        add(btnTerminado);
        add(btnEditarDescripcion);
        add(btnConfirmar);

    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnEditarDescripcion){
            System.out.println("editar descipcoon");

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new PanelEditarDescripcion();
                }
            });


        } if(e.getSource()== btnPrecio){
            System.out.println("precio");
        }
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