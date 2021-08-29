package gfg.oracle;

public class FinallyInfiniteLoop {
    public static void main(String[] args) {
        boolean flag = true;
        try {
            if(flag)
            while (true) {

            } else {
                System.exit(1);
            }
        } catch (Exception e) {

        } finally {
            System.out.println("Finally block");
        }
    }
}
