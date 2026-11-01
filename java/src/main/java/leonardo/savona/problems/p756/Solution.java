package leonardo.savona.problems.p756;

import java.util.*;
import java.util.stream.*;

class Solution {
    public static final String TITLE = "756. Pyramid Transition Matrix";

        public boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<String, List<String>> allowedMap = allowed.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0,2)));
        return pyramidTransition("", bottom, allowedMap);
    }

    private boolean pyramidTransition(String top, String bottom, Map<String, List<String>> allowedMap) {
        int pos = top.length();
        int botLen = bottom.length();
        boolean res;
        String sub = bottom.substring(pos, pos+2);
        List<String> allows = allowedMap.getOrDefault(sub, Collections.emptyList());
        for (String allowed : allows) {
            String tempTop = top.concat(allowed.substring(2));
            int tempLen = tempTop.length();
            if (tempLen == botLen-1) {
                if (tempLen == 1) return true;
                res = pyramidTransition("", tempTop, allowedMap);
            } else {
                res = pyramidTransition(tempTop, bottom, allowedMap);
            }

            if (res) return true;
        }

        return false;
    }
}