package skillenza;

public class InfinityPositiveNegative {
    public static void main(String[] args) {
        double d = -10.0 / 0;
        if(d == Double.POSITIVE_INFINITY) {
            System.out.println("P");
        } else
            System.out.println("N");
    }
}
