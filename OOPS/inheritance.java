/* Inheritance ek mechanism hai jisse ek class ki properties aur method inherit kar sakte hai
 */

// Parent class 
// Base class
class Animal {
    void eat() {
        System.out.println("This animal can eat.");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("This animal can bark too.");
    }
}

// Main class
public class inheritance { // Ensure the class name starts with uppercase
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Creating an object of Dog
        myDog.bark(); // Calling bark method from Dog class
        myDog.eat(); // Calling eat method inherited from Animal class
    }
}
