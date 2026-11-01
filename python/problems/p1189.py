"""1189. Maximum Number of Balloons"""

class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        char_map = {
            'b':0,
            'a': 0,
            'l': 0,
            'o': 0,
            'n': 0
        }
        for l in text:
            if char_map.get(l) is not None:
                char_map[l] += 1

        char_map['l'] = char_map['l'] // 2
        char_map['o'] = char_map['o'] // 2
        return min(char_map.values())
