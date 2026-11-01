"""997. Find the Town Judge"""

class Solution:
    def findJudge(self, n: int, trust: list[list[int]]) -> int:
        graph = {k: [] for k in range(1, n+1)}
        for a,b in trust:
            graph[a].append(b)
        townJudge = -1
        for i in range(1, n+1):
            if len(graph[i]) == 0:
                townJudge = i
        if townJudge != -1:
            for i in range(1, n+1):
                if i != townJudge and townJudge not in graph[i]:
                    return -1
        return townJudge
