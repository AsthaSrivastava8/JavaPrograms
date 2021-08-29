package gfg.oracle;

public class Max0s {
    public static void main(String[] args) {
        String[] arr = {"10", "20", "9999", "200", "30020", "90028"};
        int max = 0;
        String ans = "-1";
        for (String i : arr) {
            int cnt = 0;
            for (char x : i.toCharArray()) {
                if (x == '0')
                    cnt++;
            }
            if (cnt > max) {
                max = cnt;
                ans = i;

            } else if (cnt == max && cnt != 0) {
                if (ans.length() == i.length())
                    ans = (ans.compareTo(i) < 0) ? i : ans;
                else
                    ans = ans.length() < i.length() ? i : ans;
            }

        }
        System.out.println(ans);
    }
}
