package gfg.amazon;

public class CountCharTypes {
    public static void main(String[] args) {
        String s = "#GeeKs01fOr@gEEks07";
        int[] ans = new int[4];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90)
                ans[0] += 1;
            else if (ch >= 97 && ch <= 122)
                ans[1] += 1;
            else if (ch - '0' >= 0 && ch - '0' <= 9)
                ans[2] += 1;
            else
                ans[3] += 1;
        }
        for (int val : ans)
            System.out.print(val + " ");
    }
}
