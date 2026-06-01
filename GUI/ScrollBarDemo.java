import java.awt.*;
import javax.swing.*;
public class ScrollBarDemo extends JFrame {
    public ScrollBarDemo() {
        setTitle("Scroll Bar Demo");
        JPanel mainPanel = new JPanel(new BorderLayout(10,10));
        JTextArea textArea = new JTextArea(5,30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText("Some people can write and write and write some more!");
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JPanel buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        JButton saveMemo1 = new JButton("Save Memo 1");
        JButton saveMemo2 = new JButton("Save Memo 2");
        JButton clear = new JButton("Clear");
        JButton getMemo1 = new JButton("Get Memo 1");
        JButton getMemo2 = new JButton("Get Memo 2");
        buttonPanel1.add(saveMemo1);
        buttonPanel1.add(saveMemo2);
        buttonPanel1.add(clear);
        buttonPanel1.add(getMemo1);
        buttonPanel1.add(getMemo2);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel1, BorderLayout.SOUTH);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(mainPanel);
        setSize(750,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ScrollBarDemo();
    }   }
