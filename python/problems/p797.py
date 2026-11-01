"""797. All Paths From Source to Target"""

class Solution:
    def allPathsSourceTarget(self, graph: list[list[int]]) -> list[list[int]]:
        path = [0]
        result = []
        n = len(graph)

        def dfs(s):
            if n - 1 == s:
                result.append(path[:])
                return
            for v in graph[s]:
                path.append(v)
                dfs(v)
                path.pop()

        dfs(0)
        return result
