package educative.basics;

import java.text.BreakIterator;
import java.util.Iterator;
import java.util.Locale;

public class StringLengthAnomaly {
    public static void main(String[] args) {
        String str = "Thîs lóo̰ks we̐ird!";
        System.out.println(str);
        System.out.println("Wrong: " + str.length());
        System.out.println("Right: " + length(str, Locale.ENGLISH));
        str = "\uDBFF\uDFFCsurpi\u0301se!\uDBFF\uDFFD";
        System.out.println(str);
        System.out.println("Wrong: " + str.length());
        System.out.println("Right: " + length(str, Locale.ENGLISH));
    }

    public static int length(String text, Locale locale) {
        BreakIterator charIterator = BreakIterator.getCharacterInstance(locale);
        charIterator.setText(text);
        int result = 0;
        while (charIterator.next() != BreakIterator.DONE)
            result += 1;
        return result;
    }
}
