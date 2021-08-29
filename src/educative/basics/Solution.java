package educative.basics;

public class Solution {
    int mod = 100000000 + 7;
        int facto(int n) {
            if (n == 1 || n==0)
                return 1;
            return (n * facto(n - 1)) % mod;
        }
        public int solve(String s) {
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                int c = 0;
                while (i<s.length() && s.charAt(i) - '0' == 1) {
                    c++;
                    i++;
                }
                sum += facto(c) % mod;
            }
            return sum;
        }

    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.solve("111001"));
    }
    }

