package gfg.amazon;

public class TransformString {
    public static void main(String[] args) {
        int m = 5, n = 2, k = 5;
        StringBuilder binary = new StringBuilder("");
        while (m > 0) {
            binary.append(m % 2);
            m /= 2;
        }
        binary.reverse();
        for (int i = 0; i < n; i++) {
            StringBuilder newString = new StringBuilder("");
            for(int j =0; j < binary.length(); j++) {
                if(binary.charAt(j) == '1')
                    newString.append("10");
                else
                    newString.append("01");
            }
            binary = newString;
        }
        System.out.print(binary.charAt(k));

    }
}
