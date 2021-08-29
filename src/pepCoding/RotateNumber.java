package pepCoding;

public class RotateNumber {
    public static void main(String[] args) {
        long n = 12345556;
        long k = 5;
        int m = 0;
        int nLength = 1;
        long temp = n;
        while (temp > 0) {
            if (temp / 10 > 0)
                nLength++;
            temp = temp / 10;
        }
        if (k > 0 && k <= nLength) {
            m = (int) (n % Math.pow(10, k));

            m *= Math.pow(10, nLength - k);

            m += n / Math.pow(10, k);
        }
        System.out.println(m == 0 ? n : m);

    }
}
