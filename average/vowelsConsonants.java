package average;
import java.util.*;
// Problem Statement

// Given a string consisting of lowercase English alphabets, replace each character based on the following rules:

// If the current character is a vowel (a, e, i, o, u), replace it with the next immediate consonant in the English alphabet.
// If the current character is a consonant, replace it with the next immediate vowel in the English alphabet.
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