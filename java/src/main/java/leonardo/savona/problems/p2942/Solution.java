package leonardo.savona.problems.p2942;

import java.util.*;

class Solution {
    public static final String TITLE = "2942. Find Words Containing Character";

    public List<Integer> findWordsContaining(String[] words, char x) {
              List<Integer> l = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) l.add(i);
        }
        return l;
    }
}