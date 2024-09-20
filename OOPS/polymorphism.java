/* Polymorphism ka matlab hai ki ek hi method ko alag-alag forms mein use karna
 * Polymorphism do tarah ka hota hai:- 
 * 1) Compile-time(Method Overloading)
 * 2) Run Time (Method Overriding)
 */

// Method Overloading
package OOPS;

class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        System.out.println("Sum of integer are: " + math.add(5, 10));
        System.out.println("Sum of double is : " + math.add(5.5, 5.9));
    }

}
