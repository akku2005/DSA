// Stack practice question

package collection;

import java.util.Stack;

public class task5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");
        stack.push(" three");
        System.out.println("Stack Elements are");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
