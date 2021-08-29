package pepCoding;

public class BulbsCase {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (i * i <= n)
                System.out.println(i * i);
        }
    }
}
