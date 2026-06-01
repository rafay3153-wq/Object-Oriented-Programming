import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
class Contact implements Serializable {
    String name;
    String phone;
    String email;
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return name;
    }
}
public class AddressBook extends JFrame {
    DefaultListModel<Contact> model;
    JList<Contact> contactList;
    JTextField nameField;
    JTextField phoneField;
    JTextField emailField;
    JTextField searchField;
    ArrayList<Contact> contacts;
    JButton addBtn;
    JButton editBtn;
    JButton deleteBtn;
    JButton saveBtn;
    JButton loadBtn;
    JButton searchBtn;
    public AddressBook() {
        contacts = new ArrayList<Contact>();
        setTitle("Address Book Application");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        model = new DefaultListModel<Contact>();
        contactList = new JList<Contact>(model);
        JScrollPane scrollPane = new JScrollPane(contactList);
        add(scrollPane, BorderLayout.WEST);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(8, 1));
        inputPanel.add(new JLabel("Name"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Phone"));
        phoneField = new JTextField();
        inputPanel.add(phoneField);
        inputPanel.add(new JLabel("Email"));
        emailField = new JTextField();
        inputPanel.add(emailField);
        inputPanel.add(new JLabel("Search By Name"));
        searchField = new JTextField();
        inputPanel.add(searchField);
        add(inputPanel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addBtn = new JButton("Add");
        editBtn = new JButton("Edit");
        deleteBtn = new JButton("Delete");
        saveBtn = new JButton("Save");
        loadBtn = new JButton("Load");
        searchBtn = new JButton("Search");
        buttonPanel.add(addBtn);
        buttonPanel.add(editBtn);
        buttonPanel.add(deleteBtn);
        buttonPanel.add(saveBtn);
        buttonPanel.add(loadBtn);
        buttonPanel.add(searchBtn);
        add(buttonPanel, BorderLayout.SOUTH);
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addContact();
            }
        });
        editBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editContact();
            }
        });
        deleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteContact();
            }
        });
        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveContacts();
            }
        });
        loadBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadContacts();
            }
        });
        searchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchContact();
            }
        });
        setVisible(true);
    }
    public void addContact() {
        String name = nameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();
        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        model.addElement(c);
        clearFields();
    }
    public void editContact() {
        int index = contactList.getSelectedIndex();
        if (index != -1) {
            Contact c = contacts.get(index);
            c.name = nameField.getText();
            c.phone = phoneField.getText();
            c.email = emailField.getText();
            contactList.repaint();
            JOptionPane.showMessageDialog(this, "Contact Updated");
        } else {
            JOptionPane.showMessageDialog(this, "Select a contact first");
        }
    }
    public void deleteContact() {
        int index = contactList.getSelectedIndex();
        if (index != -1) {
            contacts.remove(index);
            model.remove(index);
            JOptionPane.showMessageDialog(this, "Contact Deleted");
        } else {
            JOptionPane.showMessageDialog(this, "Select a contact first");
        }
    }
    public void searchContact() {
        String search = searchField.getText().toLowerCase();
        boolean found = false;
       for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i);
            if (c.name.toLowerCase().contains(search)) {
                contactList.setSelectedIndex(i);
                JOptionPane.showMessageDialog(this,
                        "Contact Found\n\n" +"Name: " + c.name +"\nPhone: " + c.phone +"\nEmail: " + c.email);
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Contact Not Found");
        }
    }
    public void saveContacts() {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(file));
                out.writeObject(contacts);
                out.close();
                JOptionPane.showMessageDialog(this,"Contacts Saved Successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Error Saving File");
            }
        }
    }
    public void loadContacts() {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
           File file = chooser.getSelectedFile();
            try {
                ObjectInputStream in =new ObjectInputStream(new FileInputStream(file));
                contacts = (ArrayList<Contact>) in.readObject();
                in.close();
                model.clear();
                for (int i = 0; i < contacts.size(); i++) {
                    model.addElement(contacts.get(i));
                }
                JOptionPane.showMessageDialog(this,
                        "Contacts Loaded Successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Error Loading File");
            }
        }
    }
    public void clearFields() {
        nameField.setText("");
        phoneField.setText("");
        emailField.setText("");
    }
    public static void main(String[] args) {
        new AddressBook();
    }
}