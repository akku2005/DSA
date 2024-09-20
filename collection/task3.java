// Map Practice Question

package collection;

import java.util.HashMap;

public class task3 {
    public static void main(String[] args) {
        HashMap<String, Integer> names = new HashMap<>();
        names.put("Akash", 1);
        names.put("Om", 2);
        names.put("Jhone", 3);

        System.out.println("Value for key Two " + names.get("Akash"));
        System.out.println("Hashmap elements");
        for (String key : names.keySet()) {
            System.out.println(key + ": " + names.get(key));
        }
    }
}
