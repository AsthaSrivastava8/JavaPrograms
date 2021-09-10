package skillenza;

// https://akashsingh3031.medium.com/the-problem-of-the-day-7c59184a6173
public class ShiftChars {
    public static void main(String[] args) {
        String s = "xyz";
        char[] S = s.toCharArray();
        int[] shifts = {3, 5, 9};

        for (int i = shifts.length - 2; i >= 0; i--)
            shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
        for (int i = 0; i < S.length; i++)
            S[i] = (char) (((S[i] - 'a') + shifts[i]) % 26 + 'a');
        System.out.println(S);

    }
}