"""1550. Three Consecutive Odds"""

class Solution:
    def threeConsecutiveOdds(self, arr: list[int]) -> bool:
        cons = 0
        for i in arr:
            if i % 2 == 1:
                cons += 1
                if cons == 3: return True
            else:
                cons = 0
        return False
