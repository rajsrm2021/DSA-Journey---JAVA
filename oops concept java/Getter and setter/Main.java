// Define the Person class
class Person {
    // Instance variables (attributes)
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person's details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to demonstrate the usage of Person class
public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("John Doe", 25);

        // Display initial details
        person1.displayInfo();

        // Modify attributes using setter methods
        person1.setName("Jane Doe");
        person1.setAge(30);

        // Display updated details
        person1.displayInfo();
    }
}
