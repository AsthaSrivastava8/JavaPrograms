package gfg.oracle;

import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        List<String> answers = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int size = Integer.parseInt(scanner.nextLine());
            String[] input = scanner.nextLine().split(" ");
            int[] arr = new int[size];
            for (int j = 0; j < size; j++)
                arr[j] = Integer.parseInt(input[j]);

            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < size; j++) {
                if (map.get(arr[j]) == null)
                    map.put(arr[j], 1);
                else {
                    int cntr = map.get(arr[j]);
                    map.put(arr[j], cntr + 1);
                }
            }

            LinkedHashMap<Integer, Integer> reverseMap = new LinkedHashMap<>();

            map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                    .forEachOrdered(x -> reverseMap.put(x.getKey(), x.getValue()));

            arr = new int[size];
            int k = 0;
            Iterator iterator = reverseMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) iterator.next();
                int frequency = (int) mapElement.getValue();
                for (int j = 0; j < frequency; j++) {
                    arr[k++] = (int) mapElement.getKey();
                }
            }


            StringBuilder stringBuilder = new StringBuilder("");
            for (int j = 0; j < arr.length; j++)
                stringBuilder.append((arr[j]) + " ");
            answers.add(stringBuilder.toString().trim());
        }
        for (String answer : answers)
            System.out.println(answer);
    }
}
