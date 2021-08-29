package pepCoding;

public class IfRectangleIntersecting {
    static class Point {
        int x, y;
    }

    public static void main(String[] args) {
        Point l1 = new Point(), r1 = new Point(),
                l2 = new Point(), r2 = new Point();
        l1.x = 0;
        l1.y = 10;
        r1.x = 10;
        r1.y = 0;
        l2.x = 5;
        l2.y = 5;
        r2.x = 15;
        r2.y = 0;

        // if rectangles are lines
        if (l1.x == r1.x
                || l1.y == r1.y
                || l2.x == r2.x
                || l2.y == r2.y)
            System.out.println("Not overlapping");


        if (
                l1.x >= r2.x || l2.x >= r1.x  // If one rectangle is on left side of other
                        || r1.y >= l2.y || r2.y >= l1.y  // If one rectangle is above other
        )
            System.out.println("Not overlapping");

        else
            System.out.println("Overlapping");

    }
}
