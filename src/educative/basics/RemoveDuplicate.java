package educative.basics;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str = "aaaaassssssddddddfffffgggggghhhjhjjjjjj";
        String newStr = str.substring(0, 1);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == newStr.charAt(newStr.length() - 1))
                continue;
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}
