1. Object-Oriented Programming (OOP) Kya Hai?
OOP ek programming approach hai jisme hum real-world entities ko objects ke roop mein represent karte hain. Har object ke paas state (attributes/properties) aur behavior (methods/functions) hote hain.

Example: Socho ek Car object hai:

State (Attributes): Color, Model, Speed
Behavior (Methods): Accelerate, Brake, Turn
2. Java mein OOP ke 4 Pillars
a. Encapsulation
Encapsulation ka matlab hai data (attributes) aur methods (behaviors) ko ek single unit, yani class, mein bundle karna. Isse data ko protect kiya jaata hai aur direct access rokta hai.

Benefits:

Data hiding: Sensitive data ko secure rakhna.
Code maintainability: Changes ko asaani se manage karna.
Example:

java
Copy code
public class Car {
    private String color; // Private attribute

    // Getter method
    public String getColor() {
        return color;
    }

    // Setter method
    public void setColor(String color) {
        this.color = color;
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}
Yahan color attribute ko private banaya gaya hai aur access ke liye getter aur setter methods use kiye gaye hain.

b. Inheritance
Inheritance se ek class dusri class ke properties aur methods ko inherit kar sakti hai. Isse code reusability badhti hai.

Types:

Single Inheritance: Ek class ek hi class se inherit karti hai.
Multilevel Inheritance: Ek class multiple levels pe inherit karti hai.
Hierarchical Inheritance: Ek base class se multiple derived classes banti hain.
Example:

java
Copy code
// Base class
public class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Derived class
public class Car extends Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}
Yahan Car class ne Vehicle class se start method inherit kiya hai.

c. Polymorphism
Polymorphism ka matlab hai "many forms". Iska use ek hi method ya operator ko different ways mein use karne ke liye hota hai.

Types:

Compile-time Polymorphism (Method Overloading): Ek hi method name multiple times different parameters ke saath.
Runtime Polymorphism (Method Overriding): Subclass mein superclass ke method ko override karna.
Example:

Method Overloading:

java
Copy code
public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
Method Overriding:

java
Copy code
public class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}
d. Abstraction
Abstraction ka matlab hai complex implementation ko hide karke sirf essential features ko dikhana. Java mein abstraction ko achieve karne ke liye abstract classes aur interfaces ka use hota hai.

Example:

java
Copy code
// Abstract class
public abstract class Shape {
    public abstract void draw(); // Abstract method
}

// Concrete class
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
Yahan Shape ek abstract class hai jisme draw method abstract hai. Circle class ne draw method ko implement kiya hai.

3. Classes and Objects
Class: Class ek blueprint hai jisme attributes aur methods define hote hain.

Example:

java
Copy code
public class Person {
    // Attributes
    private String name;
    private int age;

    // Methods
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
Object: Object class ka instance hota hai. Hum class ke objects create karke uske attributes aur methods ko use kar sakte hain.

Example:

java
Copy code
public class Main {
    public static void main(String[] args) {
        Person person = new Person(); // Object creation
        person.setName("Rahul");
        person.setAge(25);
        person.introduce(); // Output: Hi, I'm Rahul and I'm 25 years old.
    }
}
4. Interfaces and Abstract Classes
Interface: Interface ek contract hai jisme methods ke signatures hote hain bina implementation ke. Classes interfaces ko implement karke un methods ko define karti hain.

Example:

java
Copy code
public interface Drivable {
    void drive();
}

public class Bike implements Drivable {
    @Override
    public void drive() {
        System.out.println("Bike is being driven.");
    }
}
Abstract Class: Abstract class partially implemented classes hain jisme kuch methods implemented hote hain aur kuch abstract hote hain.

Difference between Interface and Abstract Class:

Interface: Sab methods abstract hote hain (Java 8 ke baad default methods allowed hain).
Abstract Class: Kuch methods implemented ho sakte hain aur state (attributes) hold kar sakta hai.
5. Additional OOP Concepts in Java
a. Association, Aggregation, Composition
Ye relationships hain jo classes ke beech define ki jaati hain.

Association: General relationship (e.g., Teacher and Student).
Aggregation: "Has-a" relationship with loose coupling (e.g., Library has Books).
Composition: "Part-of" relationship with strong coupling (e.g., House has Rooms).
b. Constructor and Destructor
Constructor: Object create hone par call hota hai to initialize the object.

Example:

java
Copy code
public class Car {
    private String model;

    // Constructor
    public Car(String model) {
        this.model = model;
    }

    public void displayModel() {
        System.out.println("Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S");
        car.displayModel(); // Output: Model: Tesla Model S
    }
}
Destructor: Java mein garbage collection handle karta hai object destruction ko, to explicit destructor nahi hota.

6. Access Modifiers
Access modifiers define karte hain ki ek class ka member (attribute/method) kaun access kar sakta hai.

private: Sirf same class mein access.
default (no modifier): Same package mein access.
protected: Same package ya subclasses mein access.
public: Sab jagah access.
Example:

java
Copy code
public class Example {
    private int privateVar;
    int defaultVar; // default access
    protected int protectedVar;
    public int publicVar;
}
7. Final Keyword
Final Class: Inherit nahi kiya ja sakta.
Final Method: Override nahi kiya ja sakta.
Final Variable: Value change nahi ho sakti (constant).
Example:

java
Copy code
public final class Constants {
    public static final double PI = 3.14159;
}
8. Static Keyword
Static Variables: Class level variables jo sab objects share karte hain.
Static Methods: Methods jo class ke saath belong karte hain, bina object ke call kiye ja sakte hain.
Static Blocks: Initialization blocks jo class loading ke time execute hote hain.
Example:

java
Copy code
public class MathUtils {
    public static final double PI = 3.14159;

    public static int square(int number) {
        return number * number;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.PI); // Output: 3.14159
        System.out.println(MathUtils.square(5)); // Output: 25
    }
}
Conclusion
OOPs principles ko Java mein samajhna aapko robust aur scalable applications develop karne mein madad karta hai. Encapsulation, Inheritance, Polymorphism, aur Abstraction jaise pillars se aap apne code ko organized, reusable, aur maintainable bana sakte hain. Interfaces aur abstract classes jaise additional concepts se aap aur bhi flexible designs create kar sakte hain. Agar aap in concepts ko acche se grasp kar lete hain, toh aap Java mein advanced programming karne ke liye taiyaar hain!