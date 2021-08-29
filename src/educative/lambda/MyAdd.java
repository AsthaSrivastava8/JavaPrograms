package educative.lambda;

public class MyAdd {
    public static void main(String[] args) {
        MyAddInterface myAddInterface = (a, b) -> a + b;
        PrintLambdaInterface printLambdaInterface = a -> System.out.println(a);
        printLambdaInterface.printLambda(myAddInterface.myAdd(2, 3));
        Demo demo = () -> System.out.println("Hello");
        demo.show();
    }
}

@FunctionalInterface
interface MyAddInterface {
    int myAdd(int a, int b);
}

@FunctionalInterface
interface PrintLambdaInterface {
    void printLambda(int a);
}

@FunctionalInterface
interface Demo {
    void show();
}