package skillenza;

import java.util.Scanner;

public class ChocolateRoomShortcut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        int[] answers = new int[testCases];
        int cntr = 0;
        for (int i = 0; i < testCases; i++) {
            int range = Integer.parseInt(scanner.nextLine());
            if (range == 1) {
                answers[cntr++] = 1;
                continue;
            }
            if (range == 2) {
                answers[cntr++] = 1;
                continue;
            }
            int ans = 0;
            int multiplier = 1;
            int j;
            for (j = 0; j < (range / 2) - 1; j++) {
                ans += 2 * multiplier++;
            }
            multiplier = 1;
            j++;
            for (int k = 0; k < range - j - 1; k++) {
                ans += 2 * multiplier++;
            }
            int diff = finalDiff(range);
            answers[cntr++] = ans + diff;
        }
        for (int ans : answers)
            System.out.println(ans);
    }

    public static int finalDiff(int range) {
        int[] odd = new int[range];
        int[] even = new int[range];
        int[] finalArr = new int[range];
        int j = range;
        int e = 0;
        int o = 0;
        while (j > 0) {
            if (j % 2 == 0)
                even[e++] = j;
            else
                odd[o++] = j;
            j--;
        }

        int mid = o / 2;
        int deviation = 1;
        finalArr[0] = odd[o / 2];
        j = 1;
        int negation = 1;
        while ((mid - deviation) >= 0 && odd[mid - deviation] != 0) {
            finalArr[j++] = odd[mid - deviation];
            negation = -negation;
            deviation = deviation * negation;
            if (negation == 1)
                deviation = Math.abs(deviation) + 1;
        }

        int[] finalArrAlt = new int[range];
        mid = e / 2;
        deviation = 1;
        j = 0;
        finalArrAlt[j++] = even[e / 2];
        negation = 1;
        while ((mid - deviation) >= 0 && even[mid - deviation] != 0) {
            finalArrAlt[j++] = even[mid - deviation];
            negation = -negation;
            deviation = deviation * negation;
            if (negation == 1)
                deviation = Math.abs(deviation) + 1;
        }

        int ans = 0;
        int k = 0;
        while (finalArr[k] != 0 && k < finalArr.length - 1 && finalArr[k + 1] != 0) {
            ans += Math.abs(finalArr[k] - finalArr[k + 1]);
            k++;
        }

        k = 0;
        while (finalArrAlt[k] != 0 && k < finalArrAlt.length - 1 && finalArrAlt[k + 1] != 0) {
            ans += Math.abs(finalArrAlt[k] - finalArrAlt[k + 1]);
            k++;
        }

        int diff1 = Math.abs(finalArr[0] - finalArrAlt[0]);
        int diff2 = Math.abs(finalArr[0] - finalArrAlt[k]);
        int diff3 = Math.abs(finalArr[k] - finalArrAlt[0]);
        int diff4 = Math.abs(finalArr[k] - finalArrAlt[k]);

        return Math.max(Math.max(diff1, diff2), Math.max(diff3, diff4));
    }
}

