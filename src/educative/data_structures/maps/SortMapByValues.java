package educative.data_structures.maps;
// Java program to sort hashmap by values

import java.util.*;
import java.lang.*;

public class SortMapByValues {

    // function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<>(hm.entrySet());

        Comparator<Map.Entry<String, Integer>> byValue = Comparator.comparingInt(Map.Entry::getValue);

        // Sort the list
        Collections.sort(list,byValue);

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new HashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    // Driver Code
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByValue(hm);

        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
}
