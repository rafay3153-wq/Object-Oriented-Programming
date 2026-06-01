import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
class Student implements Serializable {
    String name;
    int age;
    String gender;
    String course;
    public Student(String name, int age, String gender, String course) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.course = course;
    }
}
public class StudentRegistrationForm extends JFrame {
    JTextField nameField;
    JTextField ageField;
    JRadioButton maleButton;
    JRadioButton femaleButton;
    JComboBox<String> courseBox;
    JButton submitButton;
    ArrayList<String> courses;
    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2, 10, 10));
        formPanel.add(new JLabel("Student Name"));
        nameField = new JTextField();
        formPanel.add(nameField);
        formPanel.add(new JLabel("Age"));
        ageField = new JTextField();
        formPanel.add(ageField);
        formPanel.add(new JLabel("Gender"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        formPanel.add(genderPanel);
        formPanel.add(new JLabel("Course"));
        courseBox = new JComboBox<String>();
        loadCourses();
        formPanel.add(courseBox);
        JPanel buttonPanel = new JPanel();
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                submitForm();
            }
        });
        buttonPanel.add(submitButton);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
    public void loadCourses() {
        courseBox.removeAllItems();
        courses = new ArrayList<>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("courses.bin"));
            courses = (ArrayList<String>) in.readObject();
            in.close();
        } catch (Exception e) {
            courses.add("BSCS");
            courses.add("BDS");
            courses.add("BSIT");
            courses.add("SE");
        }
        for (String c : courses) {
            courseBox.addItem(c);
        }
    }
    public void submitForm() {
        try {
            String name = nameField.getText();
            if (name.equals("")) {
                JOptionPane.showMessageDialog(this, "Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int age = Integer.parseInt(ageField.getText());
            String gender = "";
            if (maleButton.isSelected()) {
                gender = "Male";
            } else if (femaleButton.isSelected()) {
                gender = "Female";
            } else {
                JOptionPane.showMessageDialog(this, "Please select gender", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String course = (String) courseBox.getSelectedItem();
            Student s = new Student(name, age, gender, course);
            saveStudent(s);
            JOptionPane.showMessageDialog(this,
                    "Student Registered Successfully\n\n"
                            + "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nCourse: " + course);
            clearFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Age must be a number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void saveStudent(Student s) {
        try {
            ArrayList<Student> studentList = new ArrayList<>();
            File file = new File("student.bin");
            if (file.exists()) {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                studentList = (ArrayList<Student>) in.readObject();
                in.close();
            }
            studentList.add(s);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(studentList);
            out.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error saving student", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void clearFields() {
        nameField.setText("");
        ageField.setText("");
        maleButton.setSelected(false);
        femaleButton.setSelected(false);
        courseBox.setSelectedIndex(0);
    }
    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
