package leonardo.savona.problems.p2423;

import java.util.*;

class Solution {
    public static final String TITLE = "2423. Remove Letter To Equalize Frequency";

       public boolean equalFrequency(String word) {
        Map<Integer, List<Character>> buckets = new HashMap<>();
        Map<Character, Integer> occurrences = new HashMap<>(26);
        int maxOccurrence = 0;
        for (int i=0, len=word.length(); i<len; i++) {
            Character c = word.charAt(i);
            Integer occurrence = occurrences.get(c);
            if (occurrence == null) {
                occurrence = 1;
            } else {
                occurrence++;
                List<Character> chars = buckets.get(occurrence-1);
                chars.remove(c);
                if (chars.isEmpty())
                    buckets.remove(occurrence-1);
            }
            occurrences.put(c, occurrence);
            maxOccurrence = Math.max(occurrence, maxOccurrence);

            List<Character> chars = buckets.get(occurrence);
            if (chars == null)
                chars = new ArrayList<>();
            chars.add(c);
            buckets.put(occurrence, chars);
        }
        
        if (buckets.size() == 1) {
            return maxOccurrence == 1 || buckets.get(maxOccurrence).size() == 1;
            
        } else if (buckets.size() == 2) {
            List<Character> bucket = buckets.get(1);
            return bucket != null && bucket.size() == 1 || (buckets.get(maxOccurrence).size() == 1 && buckets.containsKey(maxOccurrence - 1));
                    
        } else {
            return false;
        }
    }
}