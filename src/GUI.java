import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JPanel numDisplay;
    private JPanel numPad;

    private GUI() {
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 500);
        getContentPane();
        setLayout(new BorderLayout());

        numDisplay = new JPanel();
        numDisplay.setLayout(new FlowLayout());
        add(numDisplay, BorderLayout.PAGE_START);
        setNumDisplay();

        numPad = new JPanel();
        numPad.setLayout(new GridLayout(4, 3));
        add(numPad, BorderLayout.CENTER);
        setNumPad();

        setVisible(true);
    }

    private void setNumDisplay() {
        JLabel display = new JLabel("0");
        numDisplay.add(display);
    }

    private void setNumPad() {
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
        GUI calc = new GUI();
    }
}