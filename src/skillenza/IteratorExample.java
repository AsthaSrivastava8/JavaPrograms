package skillenza;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList< Character > characters = new ArrayList < Character > ();
        characters.add('R');
        characters.add('E');
        characters.add('A');
        characters.add('L');
        ListIterator< Character > listIterator = characters.listIterator();
        System.out.println("The list of alphabets is given as : "+characters);
        System.out.println("In the forward direction : ");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            listIterator.previous();
        }

    }
}
