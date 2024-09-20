package collection;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Akash");
        name.add("Om");
        name.add("Akash");

        System.out.println("List of names");
        for (String names : name) {
            System.out.print(names);
        }
    }
}
