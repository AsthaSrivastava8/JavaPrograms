package skillenza;

enum Enum {
    RED(1), PINK(2), BLUE(3);
    int value;
    Enum(int value) {
        this.value = value;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        int val = Enum.RED.value;
        System.out.println(val);
        System.out.println(Enum.BLUE);
    }
}
