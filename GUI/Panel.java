import java.awt.*;
import javax.swing.*;
public class Panel extends JFrame {
    public Panel() {
        setLayout(new BorderLayout());
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.CYAN);
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.GRAY);
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new JButton("Blue"));
        buttonPanel.add(new JButton("White"));
        buttonPanel.add(new JButton("Gray"));
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.EAST);
        add(centerPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        leftPanel.setPreferredSize(new Dimension(80, 200));
        rightPanel.setPreferredSize(new Dimension(80, 200));
        centerPanel.setPreferredSize(new Dimension(80, 200));
    }
    public static void main(String[] args) {
        Panel frame = new Panel();
        frame.setTitle("Panel Demonstration");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
