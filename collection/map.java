package collection;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Akash", 23);
        ageMap.put("Om", 22);

        ageMap.put("Akash", 25);

        System.out.println("Map Elements.");
        for (String name : ageMap.keySet()) {
            System.out.println(name + ": " + ageMap.get(name));
        }
    }
}