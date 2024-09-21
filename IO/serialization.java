package IO; // Changed to lowercase

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

// Encapsulated fields and added getters
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Corrected naming and declaration

    private String name;
    private int age;

    public Person(String name, int age) { // Constructor remains public
        this.name = name;
        this.age = age;
    }

    // Getter methods for encapsulation
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Overridden toString() method for better readability
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class serialization { // Renamed to start with uppercase

    public static void main(String[] args) {
        Person person = new Person("Akash", 22);
        // Using try-with-resources for automatic resource management
        try (FileOutputStream fileOutputStream = new FileOutputStream("Person.ser");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(person);
            System.out.println("The object has been serialized successfully.");

        } catch (IOException e) { // Catching specific exception
            e.printStackTrace();
        }
    }
}
