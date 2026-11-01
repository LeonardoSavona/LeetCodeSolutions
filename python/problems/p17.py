"""17. Letter Combinations of a Phone Number"""

class Solution:
    def letterCombinations(self, digits: str) -> list[str]:
        phone_map = {
            "2" : ["a", "b", "c"],
            "3": ["d", "e", "f"],
            "4": ["g", "h", "i"],
            "5": ["j", "k", "l"],
            "6": ["m", "n", "o"],
            "7": ["p", "q", "r", "s"],
            "8": ["t", "u", "v"],
            "9": ["w", "x", "y", "z"]
        }
        result = []
        self.bk(phone_map, result, digits, 0, "")
        return result

    def bk(self, phone_map, result, digits, digits_idx, partial):
        if digits_idx == len(digits):
            result.append(partial)
            return
        digit = digits[digits_idx]
        for letter in phone_map[digit]:
            self.bk(phone_map, result, digits, digits_idx+1, partial + letter)
