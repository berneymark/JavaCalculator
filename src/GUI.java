import javax.swing.*;

public class GUI {
    private void initGUI() {
        JFrame frame = new JFrame();
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI g = new GUI();
        g.initGUI();
    }
}