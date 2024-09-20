package collection;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println("Arraylist before element remove:" + numbers);

        numbers.remove(Integer.valueOf(6));
        System.out.println("Arraylist Elements after element remove");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
