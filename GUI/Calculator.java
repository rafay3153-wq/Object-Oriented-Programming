import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame{
    public Calculator() {
        JTextField textField = new JTextField();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4,5,5));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("/"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("*"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("-"));
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));
        setLayout(new BorderLayout(5, 5));
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setTitle("Calculator");
        calculator.setSize(300, 300);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setVisible(true);
    }
}