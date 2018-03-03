import javax.swing.*;

public class MainUnload {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Symbol strings");
        JPanel panel = new JPanel();
        window.add(panel);
        window.setVisible(true);
        window.setSize(300, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
