package leonardo.savona.problems.p3541;

import java.util.*;

class Solution {
    public static final String TITLE = "3541. Find Most Frequent Vowel and Consonant";

    public int maxFreqSum(String s) {
               Map<Character, Integer> vowels = new HashMap<>();
        Map<Character, Integer> consonants = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels.compute(c, (k, v) -> v == null ? 1 : v+1);
            else
                consonants.compute(c, (k, v) -> v == null ? 1 : v+1);
        }
        return vowels.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).flatMap(e -> Optional.of(e.getValue())).orElse(0) +
                consonants.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).flatMap(e -> Optional.of(e.getValue())).orElse(0);
    }
}