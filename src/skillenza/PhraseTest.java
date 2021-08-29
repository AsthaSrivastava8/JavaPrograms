package skillenza;

public class PhraseTest {
    public static void main(String[] args) {

        String phrase = "God is a god is a god is a god";

        String word = "god";

        int answer = 0;

        for (int i = 0; i < phrase.length() - word.length() + 1; i++) {
            if (phrase.substring(i, word.length() + i).equalsIgnoreCase(word)) {
                answer++;
            }
        }

        System.out.println(answer);


    }
}
