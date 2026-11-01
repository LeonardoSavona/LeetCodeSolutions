"""77. Combinations"""

def bk(n, k, sol, result):
    if len(sol) == k:
        result.append(sol[:])
        return
    for i in range(sol[-1]+1, n+1):
        sol.append(i)
        bk(n, k, sol, result)
        sol.pop()

class Solution:
    def combine(self, n: int, k: int) -> list[list[int]]:
        result = []
        for i in range(1, n+1):
            bk(n, k, [i], result)
        return result
