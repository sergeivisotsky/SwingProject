import java.awt.*;

public class MainUnload {
    public static void main(String[] args) {
        PrepareGUI window = new PrepareGUI();
        window.setTitle("String convertion");
        Dimension screenSize =
                Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        window.setSize(width / 2, height / 2);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
