import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RadioButtonTest extends JFrame {
    private JLabel messageLabel;
    private JRadioButton plainBtn, boldBtn, italicBtn, boldItalicBtn;
    private ButtonGroup fontGroup;
    public RadioButtonTest() {
        setTitle("RadioButton Test");
        setLayout(new BorderLayout(10,10));
        messageLabel = new JLabel("Watch the font style change", SwingConstants.CENTER);
        add(messageLabel, BorderLayout.CENTER);
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,15,10));
        radioPanel.setBorder(BorderFactory.createTitledBorder("Font Style"));
        plainBtn = new JRadioButton("Plain");
        boldBtn = new JRadioButton("Bold");
        italicBtn = new JRadioButton("Italic");
        boldItalicBtn = new JRadioButton("Bold/Italic");
        fontGroup = new ButtonGroup();
        fontGroup.add(plainBtn);
        fontGroup.add(boldBtn);
        fontGroup.add(italicBtn);
        fontGroup.add(boldItalicBtn);
        radioPanel.add(plainBtn);
        radioPanel.add(boldBtn);
        radioPanel.add(italicBtn);
        radioPanel.add(boldItalicBtn);
        plainBtn.setSelected(true);
        plainBtn.addActionListener(new FontStyleListener());
        boldBtn.addActionListener(new FontStyleListener());
        italicBtn.addActionListener(new FontStyleListener());
        boldItalicBtn.addActionListener(new FontStyleListener());
        radioPanel.add(plainBtn);
        radioPanel.add(boldBtn);
        radioPanel.add(italicBtn);
        radioPanel.add(boldItalicBtn);
        add(radioPanel, BorderLayout.SOUTH);
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    class FontStyleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int style = Font.PLAIN;
            if (boldItalicBtn.isSelected()) {
                style = Font.BOLD | Font.ITALIC;
            } else if (boldBtn.isSelected()) {
                style = Font.BOLD;
            } else if (italicBtn.isSelected()) {
                style = Font.ITALIC;
            }
            messageLabel.setFont(new Font("Serif", style, 20));
        }
    }
    public static void main(String[] args) {
        new RadioButtonTest();
    }
}
    