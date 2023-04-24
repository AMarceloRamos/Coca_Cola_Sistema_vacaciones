import javax.swing.*;

public class GUI extends JFrame {

    public GUI() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        setTitle("Interfaz");
    }

    public static void main(String args[]) {

        GUI gui = new GUI();
        gui.setBounds(0, 0, 400, 300);
        gui.setVisible(true);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);

    }
}
