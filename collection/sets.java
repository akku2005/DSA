package collection;

import java.util.HashSet;

public class sets {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("India");

        System.out.println("Set Elements are");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
