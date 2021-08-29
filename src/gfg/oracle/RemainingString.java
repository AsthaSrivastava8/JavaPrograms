package gfg.oracle;

public class RemainingString {
    public static void main(String[] args) {
        String str = "ThisIsDemoString";
        str = str.toLowerCase();
        char ch = 'i';
        int count = 3;
        String ans = "";
        int cntr = 0;
        int i;
        for (i = 0; i < str.length(); i++) {
            if (cntr == count)
                break;
            if (str.charAt(i) == ch)
                cntr++;
        }

        if (i == str.length() || str.substring(i).length() == 0)
            ans = "Empty string";
        else
            ans = str.substring(i);
        System.out.println(ans);
    }
}
