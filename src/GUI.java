import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame;
    private JPanel numPad;

    private void initGUI() {
        frame = new JFrame("Calculator");
        frame.setSize(400, 500);
        frame.getContentPane();

        numPad = new JPanel();
        numPad.setLayout(new GridLayout(4, 3));
        frame.add(numPad);
        numPad();

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

    private void numPad() {
        JButton nineBtn = new JButton("9");
        numPad.add(nineBtn);

        JButton eightBtn = new JButton("8");
        numPad.add(eightBtn);

        JButton sevenBtn = new JButton("7");
        numPad.add(sevenBtn);

        JButton sixBtn = new JButton("6");
        numPad.add(sixBtn);

        JButton fiveBtn = new JButton("5");
        numPad.add(fiveBtn);

        JButton fourBtn = new JButton("4");
        numPad.add(fourBtn);

        JButton threeBtn = new JButton("3");
        numPad.add(threeBtn);

        JButton twoBtn = new JButton("2");
        numPad.add(twoBtn);

        JButton oneBtn = new JButton("1");
        numPad.add(oneBtn);

        JButton zeroBtn = new JButton("0");
        numPad.add(zeroBtn);
    }

    public static void main(String[] args) {
        GUI g = new GUI();
        g.initGUI();
    }
}