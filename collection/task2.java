package collection;

import java.util.HashSet;

public class task2 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Akash");
        names.add("Jhon");
        names.add("New");

        System.out.println("HashSet contains 'Akash'" + names.contains("Akash"));
        System.out.println("Hashset elements");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
