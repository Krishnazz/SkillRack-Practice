package average;
import java.util.*;

// Problem Statement

// Given a sentence and two target words, determine the minimum distance between any occurrence of the two words.

// The distance between two words is defined as the absolute difference between their indices in the sentence.

// If a word appears multiple times, consider all occurrences and return the smallest possible distance.

// Input
// A sentence containing words separated by spaces.
// Two target words word1 and word2.
// Output
// Return the minimum distance between word1 and word2.
// Example 1
// Input
// Sentence : the quick the brown quick brown the frog
// Word1    : quick
// Word2    : frog
// Output
// 3
// Explanation

// Word positions:

// the  quick  the  brown  quick  brown  the  frog
//  0      1     2      3      4      5     6     7

// Occurrences of quick are at indices 1 and 4.

// Occurrence of frog is at index 7.

// Distances:

// |7 − 1| = 6
// |7 − 4| = 3

// Minimum distance = 3.

// Example 2
// Input
// Sentence : apple mango banana apple orange mango
// Word1    : apple
// Word2    : mango
// Output
// 1
// Explanation

// Word positions:

// apple  mango  banana  apple  orange  mango
//   0      1       2       3       4       5

// Distances:

// |0 − 1| = 1
// |3 − 5| = 2
// |3 − 1| = 2

// Minimum distance = 1.

// Constraints
// The sentence contains words separated by a single or multiple spaces.
// Words consist of lowercase English letters.
// Both target words are guaranteed to be present in the sentence.
// Approach
// Split the sentence into an array of words.
// Traverse the array once.
// Track the most recent occurrence of each target word.
// Whenever both words have been found, compute the current distance.
// Update the minimum distance if a smaller value is found.
// Complexity Analysis
// Time Complexity: O(n)
// Space Complexity: O(1) (excluding the array created after splitting the sentence)
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