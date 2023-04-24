import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
    private JButton boton1;
    public static String texto = "";

    public Bienvenida() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);// OPERACION PARA QUE EL PROGRAMA NO SE SIGA EJECUTANDO EN SEGUNDO PLANO
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        // agregarla como imagenicono - objeto imagen - agregar imagen a la clase -
        // cargarImagen - obtener imagen

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        etiqueta1 = new JLabel(imagen);
        etiqueta1.setBounds(25, 15, 300, 150);
        add(etiqueta1);

        etiqueta2 = new JLabel("Sistema de Control Vacacional");
        etiqueta2.setBounds(35, 135, 300, 30);
        etiqueta2.setFont(new Font("Andale Mono", 3, 18));
        etiqueta2.setForeground(new Color(255, 255, 255));
        add(etiqueta2);

        etiqueta3 = new JLabel("Ingrese su nombre");
        etiqueta3.setBounds(45, 212, 200, 30);
        etiqueta3.setFont(new Font("Andale Mono", 1, 12));
        etiqueta3.setForeground(new Color(255, 255, 255));
        add(etiqueta3);

        etiqueta4 = new JLabel("@2017 The Coca-Cola Company");
        etiqueta4.setBounds(85, 375, 300, 30);
        etiqueta4.setFont(new Font("Andale Mono", 1, 12));
        etiqueta4.setForeground(new Color(255, 255, 255));
        add(etiqueta4);

        textfield1 = new JTextField();
        textfield1.setBounds(45, 240, 255, 25);
        textfield1.setBackground(new Color(224, 224, 224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255, 0, 0));
        add(textfield1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125, 280, 100, 30);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255, 0, 0));
        boton1.addActionListener(this);
        add(boton1);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton1) {
            texto = textfield1.getText().trim();// metodo trim() borrar los espacios del texto
            if (texto.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
            } else {
                Licencia ventanalicencia = new Licencia();
                ventanalicencia.setBounds(0, 0, 610, 370);
                ventanalicencia.setVisible(true);
                ventanalicencia.setResizable(false);
                ventanalicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String args[]) {

        Bienvenida ventanabienvenida = new Bienvenida();
        ventanabienvenida.setBounds(0, 0, 350, 450);
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);
    }
}
