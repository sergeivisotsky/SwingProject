import javax.swing.*;
import java.awt.*;

public class MainUnload extends Frame {

    private static JFrame window;
    private static JPanel panel;
    private static JTextField field;
    private static JButton btnPro;
    private static JList list;

    private static void prepareWindowGUI() {
        window = new JFrame();
        window.setTitle("Symbol strings");
        window.setVisible(true);
        window.setSize(300, 400);
        window.setLayout(new GridLayout(3, 3));
        window.setLocationRelativeTo(null);
//        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        window.add(panel);

        field = new JTextField(20);

//        field.setSize(100);
        panel.add(field);
//        field.setPreferredSize(new Dimension(500, 20));
    }

    public static void main(String[] args) {
        prepareWindowGUI();
    }


}
