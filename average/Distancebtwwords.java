package average;
import java.util.*;
public class Distancebtwwords {

    public static void main(String[] args) {

        String str = "practice makes perfect practice coding practice";
        String word1 = "practice";
        String word2 = "practice";

        String[] words = str.split("\\s+");

        int minDistance = Integer.MAX_VALUE;

        if (word1.equals(word2)) {

            int previous = -1;

            for (int i = 0; i < words.length; i++) {

                if (words[i].equals(word1)) {

                    if (previous != -1) {
                        minDistance = Math.min(minDistance,
                                i - previous);
                    }

                    previous = i;
                }
            }

        } else {

            int pos1 = -1;
            int pos2 = -1;

            for (int i = 0; i < words.length; i++) {

                if (words[i].equals(word1))
                    pos1 = i;

                if (words[i].equals(word2))
                    pos2 = i;

                if (pos1 != -1 && pos2 != -1)
                    minDistance = Math.min(minDistance,
                            Math.abs(pos1 - pos2));
            }
        }

         System.out.println(minDistance);
    }
}