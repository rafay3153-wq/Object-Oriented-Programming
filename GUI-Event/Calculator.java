import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private JButton[] numberButtons = new JButton[10];
    private JButton addBtn, subBtn, mulBtn, divBtn;
    private JButton decBtn, equBtn, delBtn, clrBtn, negBtn;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    public Calculator() {
        setTitle("Calculator");
        setLayout(new BorderLayout(10, 10));
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 20));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(display, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 8, 8));
        for (int i = 0; i < 10; i++) {
            numberButtons[i] =
                    new JButton(String.valueOf(i));
            numberButtons[i].setFont(
                    new Font("Arial", Font.BOLD, 20));
            numberButtons[i].addActionListener(this);
        }
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        decBtn = new JButton(".");
        equBtn = new JButton("=");
        delBtn = new JButton("Del");
        clrBtn = new JButton("Clr");
        negBtn = new JButton("±");
        JButton[] opButtons = {addBtn, subBtn, mulBtn, divBtn, decBtn, equBtn, delBtn, clrBtn, negBtn
        };
        for (JButton btn : opButtons) {
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
        }
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(divBtn);
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(mulBtn);
        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(subBtn);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(decBtn);
        buttonPanel.add(negBtn);
        buttonPanel.add(addBtn);
        JPanel extraPanel = new JPanel(new GridLayout(1, 3, 8, 8));
        extraPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 10));
        extraPanel.add(delBtn);
        extraPanel.add(clrBtn);
        extraPanel.add(equBtn);
        add(buttonPanel, BorderLayout.CENTER);
        add(extraPanel, BorderLayout.SOUTH);
        setSize(350, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                display.setText(display.getText() + i);
                return;
            }
        }
        if (e.getSource() == decBtn) {
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
            return;
        }
        if (e.getSource() == addBtn) {
            num1 = Double.parseDouble(display.getText());
            operator = '+';
            display.setText("");
            return;
        }
        if (e.getSource() == subBtn) {
            num1 = Double.parseDouble(display.getText());
            operator = '-';
            display.setText("");
            return;
        }
        if (e.getSource() == mulBtn) {
            num1 = Double.parseDouble(display.getText());
            operator = '*';
            display.setText("");
            return;
        }
        if (e.getSource() == divBtn) {
            num1 = Double.parseDouble(display.getText());
            operator = '/';
            display.setText("");
            return;
        }
        if (e.getSource() == equBtn) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
            }
            if (result == (long) result) {
                display.setText(String.valueOf((long) result));
            } else {
                display.setText(String.valueOf(result));
            }
            num1 = result;
            return;
        }
        if (e.getSource() == clrBtn) {
            display.setText("");
            num1 = num2 = result = 0;
            operator = '\0';
            return;
        }
        if (e.getSource() == delBtn) {
            String str = display.getText();
            if (!str.isEmpty()) {
                display.setText(
                        str.substring(0, str.length() - 1));
            }
            return;
        }
        if (e.getSource() == negBtn) {
            String str = display.getText();
            if (!str.isEmpty()) {
                if (str.startsWith("-")) {
                    display.setText(str.substring(1));
                } else {
                    display.setText("-" + str);
                }
            }
        }
    }
    public static void main(String[] args) {
        new Calculator();
    }
}