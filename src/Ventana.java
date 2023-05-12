import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    private final JLabel lblNombre;
    private final JTextField txtNombre;
    private final JButton boton;
    private final JComboBox combo;
    private NombreModeloCombo modelo;

    public Ventana(String string) throws HeadlessException {
        super(string);
        this.setSize(400, 400);
        setLayout(new FlowLayout());
        lblNombre = new JLabel("Ingresa un nombre: ");
        this.getContentPane().add(lblNombre);
        txtNombre = new JTextField(30);
        this.getContentPane().add(txtNombre);
        boton = new JButton("Agregar");
        this.getContentPane().add(boton);
        //configurar el modelo
        combo = new JComboBox();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
