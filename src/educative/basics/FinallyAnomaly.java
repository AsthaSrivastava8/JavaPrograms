package educative.basics;

public class FinallyAnomaly {
    public static void something() {
        System.out.println("In something");
    }

    public static void main(String[] args) {
        System.out.println(finallyReturn());

    }

    public static String finallyReturn() {
        try {
            something();
            throw new Exception();
        } catch (Exception e) {
            return "Exception return";
        } finally {
            System.out.println("I don't know if this will get printed out");
        }
    }
}
