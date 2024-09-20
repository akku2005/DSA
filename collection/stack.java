package collection;

import java.util.Stack;

public class stack { // Class name ko uppercase se start kiya aur unique banaya
    public static void main(String[] args) {
        Stack<String> stackElement = new Stack<>();
        stackElement.push("First");
        stackElement.push("Second");
        stackElement.push("Third");

        System.out.println("Stack Elements:");
        while (!stackElement.isEmpty()) { // Correct variable reference
            System.out.println(stackElement.pop());
        }
    }
}
