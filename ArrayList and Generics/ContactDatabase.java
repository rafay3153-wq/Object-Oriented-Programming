import java.util.ArrayList;
import java.util.Scanner;
class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    public Contact(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;         }
    public String getLastName() {
        return lastName;         }
    public String getPhoneNumber() {
        return phoneNumber;         }
    public String getEmail() {
        return email;         }
    public void setFirstName(String firstName) {
        this.firstName = firstName;             }
    public void setLastName(String lastName) {
        this.lastName = lastName;             }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;             }
    public void setEmail(String email) {
        this.email = email;             }
    public String toString() {
        return firstName + " " + lastName + " - " + phoneNumber + " - " + email; }
}
public class ContactDatabase {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nContact Database Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Search and Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");    
            choice = input.nextInt();
            input.nextLine(); 
            switch(choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = input.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = input.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = input.nextLine();
                    System.out.print("Enter email: ");
                    String email = input.nextLine();
                    Contact c= new Contact(firstName, lastName, phoneNumber, email);
                    contacts.add(c);
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                        System.out.println("Contacts:");
                        for (Contact contact : contacts) {
                            System.out.println(contact);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter search string: ");
                    String search = input.nextLine().toLowerCase();
                    boolean found = false;
                    for (int i = 0; i < contacts.size(); i++) {
                        Contact contact = contacts.get(i);
                        if (contact.getFirstName().toLowerCase().contains(search) || contact.getLastName().toLowerCase().contains(search) || 
                            contact.getPhoneNumber().contains(search) || contact.getEmail().toLowerCase().contains(search)) {
                            System.out.println("Contact found.");
                            found = true;
                        }   
                    }
                if (!found) {
                    System.out.println("Contact not found.");
                }
                break;
                case 4:
                    System.out.print("Enter search string to delete: ");
                    String deleteSearch = input.nextLine().toLowerCase();
                    boolean deleted = false;
                    for (int i = 0; i < contacts.size(); i++) {
                        Contact contact = contacts.get(i);
                        if (contact.getFirstName().toLowerCase().contains(deleteSearch) || contact.getLastName().toLowerCase().contains(deleteSearch) ||
                            contact.getPhoneNumber().contains(deleteSearch) || contact.getEmail().toLowerCase().contains(deleteSearch)) {
                            contacts.remove(i);
                            System.out.println("Contact deleted.");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Contact not found.");
                    }
                    break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        input.close();
    }  
}