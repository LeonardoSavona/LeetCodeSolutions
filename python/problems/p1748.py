"""1748. Sum of Unique Elements"""

class Solution:
    def sumOfUnique(self, nums: list[int]) -> int:
        l = [0]*101
        som = 0
        for n in nums:
            if l[n] == 0:
                som += n
            elif l[n] == 1:
                som -= n
            l[n] += 1

        return som
