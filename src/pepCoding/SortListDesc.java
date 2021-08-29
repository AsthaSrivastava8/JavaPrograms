package pepCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDesc {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Pineapple");
        list.add("Kiwi");
        list.add("Papaya");

        Comparator<String> desc = Comparator.reverseOrder();

        Collections.sort(list, desc);
        System.out.println(list);

    }
}
