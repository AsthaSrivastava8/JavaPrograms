package gfg.oracle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int k = 9;
        int limit = (int) Math.pow(2, arr.length);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            int temp = i;
            List<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                int r = temp % 2;
                if (r == 1)
                    tempList.add(arr[j]);
                temp /= 2;
            }
            if (tempList.size() == 3)
                list.add(tempList);
        }
        List<List<Integer>> ans = list.stream()
                .filter(e -> e.stream()
                        .reduce(0, Integer::sum) == k)
                .collect(Collectors.toList());
        System.out.print(ans);
    }
}
