import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CheckBoxTest extends JFrame {
    private JLabel messageLabel;
    private JCheckBox boldCheckBox, italicCheckBox;
    public CheckBoxTest() {
        setTitle("CheckBox Test");
        setLayout(new BorderLayout(10,10));
        messageLabel = new JLabel("Watch the font style change", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        add(messageLabel, BorderLayout.CENTER);
        JPanel checkPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,20,15));
        checkPanel.setBorder(BorderFactory.createTitledBorder("Font Options"));
        boldCheckBox = new JCheckBox("Bold");
        italicCheckBox = new JCheckBox("Italic");
        boldCheckBox.addItemListener(new FontStyleListener());
        italicCheckBox.addItemListener(new FontStyleListener());
        checkPanel.add(boldCheckBox);
        checkPanel.add(italicCheckBox);
        add(checkPanel, BorderLayout.SOUTH);
        setSize(400,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    class FontStyleListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            int style = Font.PLAIN;
            if (boldCheckBox.isSelected()) {
                style = Font.BOLD;
            }
            if (italicCheckBox.isSelected()) {
                style = style | Font.ITALIC;
            }
            messageLabel.setFont(new Font("Serif", style, 24));
        }
    }
    public static void main(String[] args) {
        new CheckBoxTest();
    }
}
