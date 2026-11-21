OOP Java Examples
A comprehensive collection of Java programs demonstrating Object-Oriented Programming (OOP) concepts, data structures, GUI applications, file handling, and generics.

📁 Repository Structure
This repository contains various Java examples organized by topic:

1. ArrayList & Collections
ArrayListDemo.java - Basic ArrayList operations (add, remove, size)

RandomBox.java - Generic class with random item drawing

ContactDatabase.java - Contact management system using ArrayList

DivingScore.java - Diving score calculator with ArrayList

2. Generics
GenDemo.java - Basic generic class demonstration

SimpGen.java - Two-type generic class (TwoGen<T,V>)

MyMathClass.java - Generic class with bounded type parameters (<T extends Number>)

RandomBox.java - Generic collection with random removal

3. Inheritance & Polymorphism
Character/PlayerCharacter/NonPlayerCharacter - Game character hierarchy

Shape/Circle/Rectangle/Square - Geometric shape hierarchy

Person/Student/Employee/Faculty/Staff - University system hierarchy

Publication/Book/Tape - Publication hierarchy

Computer/Laptop - Computer hardware hierarchy

Employee/Regular/Adhoc - Employee type hierarchy

Movie/Action/Comedy/Drama - Movie rental system

Simple/VerifiedSimple - Arithmetic with validation

4. Abstract Classes & Interfaces
AbstractDemo.java - Abstract class with concrete methods

MediaItem/Song/Podcast/Movie - Media library with Downloadable and Ratable interfaces

PlayList<T extends MediaItem> - Generic playlist

5. GUI Applications (Swing)
Calculator.java - Fully functional calculator (two versions)

AddressBook.java - Contact manager with save/load functionality

QuizApplication.java - Multiple-choice quiz with scoring

StudentRegistrationForm.java - Student registration with validation

CheckBoxTest.java - Font style changer using checkboxes

RadioButtonTest.java - Font style changer using radio buttons

displayText.java - Text display with event handling

GridLayoutDemo.java - GridLayout demonstration

Panel.java / PanelDemo.java - JPanel demonstrations

ScrollBarDemo.java - Scroll pane and text area demo

6. File I/O & Serialization
ATMSystem.java - ATM with account persistence

Account.java - Serializable account class

DisplayBooks.java / SearchBook.java - Book file operations

ObjectInputStreamExample.java / ObjectOutputStreamExample.java - Object streams

StudentRegistrationForm.java - Student data persistence

7. Basic OOP Classes
CircleTest.java - Circle circumference calculator

Distance.java - Feet/inches distance class

Marks.java - Student marks with multiple constructors

Time.java - Time validation with constructors

Account.java - Bank account operations

HotDogStand.java - Hot dog stand sales tracker

Rectangle.java - Rectangle area calculator

Point.java - 2D point with move operation

Student.java - Student average calculator

Pizza.java / PizzaOrder.java - Pizza ordering system

Line.java / Point.java - Line length calculator

Date.java - Date validation with leap year support

Currency.java - Immutable currency class

Fraction.java - Immutable fraction with arithmetic operations

8. Composition & Aggregation
Book/Person/Address - Book with author and address

Manager/employeeRecord/studentRecord - Manager with records

Line/Point - Line composed of points

PizzaOrder/Pizza - Order containing multiple pizzas

9. Final Classes (Immutability)
Currency.java - Immutable currency with exchange rate

Employee.java - Immutable employee with tax calculation

Fraction.java - Immutable fraction arithmetic

Rectangle.java - Immutable rectangle
For File I/O Programs:
Some programs create/read files (e.g., Accounts.dat, BookStore, student.bin, courses.bin). Make sure you have write permissions in the working directory.

📋 Requirements
Java JDK 8 or higher

IDE (optional): IntelliJ IDEA, Eclipse, or VS Code with Java extension

Display environment for Swing GUI applications

📚 Concepts Covered
Concept	Examples
Classes & Objects	SimpleCar, Time, Circle
Constructors	Default, parameterized, overloaded
Encapsulation	Getters/setters, private fields
Inheritance	extends, super
Polymorphism	Method overriding, dynamic dispatch
Abstraction	Abstract classes, interfaces
Generics	<T>, bounded types, generic collections
Collections	ArrayList, DefaultListModel
Exception Handling	try-catch-finally, custom validation
File I/O	FileInputStream, ObjectInputStream
Serialization	Serializable, ObjectOutputStream
GUI Programming	Swing components, event listeners
Event Handling	ActionListener, ItemListener
Layout Managers	BorderLayout, GridLayout, FlowLayout
Immutability	final classes, final fields
🎯 Learning Path
If you're new to OOP, follow this order:

Basics: SimpleCar, Time, Distance, Marks

Encapsulation: Account, Circle, Rectangle, Point

Inheritance: Shape hierarchy, Person hierarchy

Polymorphism: Movie hierarchy, Character hierarchy

Abstraction: AbstractDemo, MediaItem hierarchy

Generics: GenDemo, SimpGen, MyMathClass

Collections: ArrayListDemo, ContactDatabase

File I/O: ObjectOutputStreamExample, ATMSystem

GUI: Calculator, CheckBoxTest, RadioButtonTest

Advanced: AddressBook, QuizApplication, StudentRegistrationForm

⚠️ Notes
Some files contain multiple classes (e.g., Main class appears in several files). Ensure you compile the correct file.

GUI applications require a graphical environment.

File-based programs will create data files in the working directory.

Some examples may have intentional bugs for learning purposes (e.g., VerifiedSimple calls super.sub() in mul() and div()).
