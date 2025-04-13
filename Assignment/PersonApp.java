import javax.swing.JOptionPane;

class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    public void displayInfo() {
        JOptionPane.showMessageDialog(null, "Name: " + name + "\nAge: " + age);
    }
}

public class PersonApp {
    public static void main(String[] args) {
        // Get user input using JOptionPane
        String name = JOptionPane.showInputDialog("Enter your name:");
        String ageInput = JOptionPane.showInputDialog("Enter your age:");

        // Convert age from String to int
        int age = Integer.parseInt(ageInput);

        // Create Person object
        Person person = new Person(name, age);

        // Display the person's details
        person.displayInfo();
    }
}