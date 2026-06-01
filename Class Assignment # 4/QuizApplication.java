import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class QuizApplication extends JFrame implements ActionListener {
    String[] questions = {
            "Which language is used for Java GUI?",
            "Which component is used for multiple choices?",
            "Which layout organizes components in rows?"
    };
    String[][] options = {
            {"Swing", "Python", "HTML", "CSS"},
            {"JButton", "JTextField", "JRadioButton", "JLabel"},
            {"FlowLayout", "BorderLayout", "GridLayout", "CardLayout"}
    };
    int[] answers = {0, 2, 0};
    int currentQuestion = 0;
    int score = 0;
    JLabel questionLabel;
    JRadioButton[] optionButtons;
    ButtonGroup group;
    JButton nextButton, prevButton;
    int[] userAnswers;
    public QuizApplication() {
        userAnswers = new int[questions.length];
        for (int i = 0; i < userAnswers.length; i++) {
            userAnswers[i] = -1;
        }
        setTitle("Quiz Application");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(new GridLayout(5, 1));
        questionLabel = new JLabel();
        questionPanel.add(questionLabel);
        optionButtons = new JRadioButton[4];
        group = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JRadioButton();
            group.add(optionButtons[i]);
            questionPanel.add(optionButtons[i]);
        }
        add(questionPanel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        prevButton = new JButton("Previous");
        nextButton = new JButton("Next");
        prevButton.addActionListener(this);
        nextButton.addActionListener(this);
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.SOUTH);
        loadQuestion(currentQuestion);
        setVisible(true);
    }
    public void loadQuestion(int index) {
        questionLabel.setText(questions[index]);
        group.clearSelection();
        for(int i=0;i<4;i++) {
            optionButtons[i].setText(options[index][i]);
        }
        if(userAnswers[index]!=-1) {
            optionButtons[userAnswers[index]].setSelected(true);
        }
    }
    public void saveAnswer() {
        for(int i=0;i<4;i++) {
            if(optionButtons[i].isSelected()) {
                userAnswers[currentQuestion]=i;
            }
        }
    }
    public void calculateScore() {
        score=0;
        for(int i=0;i<questions.length;i++) {
            if(userAnswers[i]==answers[i]) {
                score++;
            }
        }
    }
    public void saveResultToFile(String studentName) {
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(studentName+".dat"));
            out.writeObject("Score: "+score+"/"+questions.length);
            out.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error saving file");
        }   
    }
    public void actionPerformed(ActionEvent e) {
        saveAnswer();
        if (e.getSource()==nextButton) {
            if(currentQuestion<questions.length-1) {
                currentQuestion++;
                loadQuestion(currentQuestion);
            }else {
                calculateScore();
                String name=JOptionPane.showInputDialog("Enter Student Name");
                saveResultToFile(name);
                JOptionPane.showMessageDialog(this,"Quiz Completed!\nScore: "+score+"/"+questions.length);
            }
        }
        if(e.getSource()==prevButton) {
            if(currentQuestion>0) {
                currentQuestion--;
                loadQuestion(currentQuestion);
            }
        }
    }
    public static void main(String[] args) {
        new QuizApplication();
    }
}