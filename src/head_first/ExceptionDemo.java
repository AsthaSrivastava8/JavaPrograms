package head_first;

public class ExceptionDemo {
    public static void main(String[] args) throws ExceptionDemo2{
        ExceptionDemo2 demo2 = new ExceptionDemo2();
      demo2.isLegal(2);
    }
}

class ExceptionDemo2 extends Exception {

    public void isLegal(int x) throws ExceptionDemo2 {
        if (x < 18)
            throw new ExceptionDemo2("Not Legal");
    }

    ExceptionDemo2(String msg) {
        super(msg);
    }

    ExceptionDemo2() {

    }
}
