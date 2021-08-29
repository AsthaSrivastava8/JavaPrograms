package educative.lambda;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 6, 3, 222, 5, 6, 9, 8,
                6, 435346, 5, 657, 74, 6, 64, 7, 657, 5, 475, 745, 57);

        list.stream().distinct().filter(e -> e % 2 == 0).forEach(System.out::println);
    }
}
