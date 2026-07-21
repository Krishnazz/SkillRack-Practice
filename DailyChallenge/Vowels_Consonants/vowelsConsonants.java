package average;
import java.util.*;

public class vowelsConsonants {

    static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {

        String str = "orange";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            while (true) {

                // Move to next character
                current++;

                // Wrap around after 'z'
                if (current > 'z') {
                    current = 'a';
                }

                // If original character was vowel,
                // find next consonant
                if (isVowel(str.charAt(i))) {
                    if (!isVowel(current)) {
                        result.append(current);
                        break;
                    }
                }
                // Original character was consonant,
                // find next vowel
                else {
                    if (isVowel(current)) {
                        result.append(current);
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}