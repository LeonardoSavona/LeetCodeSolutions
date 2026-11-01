"""78. Subsets"""

class Solution:
    def subsets(self, nums: list[int]) -> list[list[int]]:
        result = []
        sol = []
        n = len(nums)
        def bk(idx):
            result.append(sol[:])
            for x in range(idx, n):
                sol.append(nums[x])
                bk(x+1)
                sol.pop()

        bk(0)
        return result
