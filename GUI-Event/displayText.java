import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class displayText extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton button;
    public displayText() {
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        textField = new JTextField(10);
        add(textField);
        label=new JLabel("Enter text");
        add(label);
        button = new JButton("Display");
        add(button);
        button.addActionListener(new MyHandler());
    }
    class MyHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = textField.getText();
            label.setText(text);
            textField.setText("");
        }
    }
    public static void main(String[] args) {
        displayText frame = new displayText();
        frame.setTitle("Display Text");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
