import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;

public class MainUnload {

    private static JFrame window = new JFrame();
    private static JPanel panel = new JPanel();
    private static JTextField field = new JTextField();
    private static JButton btnPro = new JButton();
    private static JList list = new JList();

    private static void prepareWindowGUI() {
        window.setTitle("Symbol strings");
        window.setVisible(true);
        window.setSize(300, 400);
        window.setLayout(new GridLayout(3, 3));
        window.setLocationRelativeTo(null);
//        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
//        window.add(panel);
        window.add(field);

//        field.setSize(100);
        field.setBorder(BorderFactory.createCompoundBorder(
                field.getBorder(),
                BorderFactory.createEmptyBorder(50, 50, 50, 50)));
//        field.setMargin(new Insets(10, 1000000, 10, 1000000));
//        panel.add(field);
//        field.setPreferredSize(new Dimension(500, 20));
    }

    public static void main(String[] args) {
        prepareWindowGUI();
    }


}
