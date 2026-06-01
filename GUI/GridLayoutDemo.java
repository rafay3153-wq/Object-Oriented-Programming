import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo extends JFrame {
    public GridLayoutDemo() {
        setLayout(new GridLayout(2, 3, 10, 10));
        add(new JButton("one"));
        add(new JButton("two"));
        add(new JButton("three"));
        add(new JButton("four"));
        add(new JButton("five"));
        add(new JButton("six"));
    }
    public static void main(String[] args) {
        GridLayoutDemo frame = new GridLayoutDemo();
        frame.setTitle("GridLayout Demo");
        frame.setSize(350, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
