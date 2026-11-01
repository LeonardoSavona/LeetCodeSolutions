"""1971. Find if Path Exists in Graph"""

class Solution:
    def validPath(self, n: int, edges: list[list[int]], source: int, destination: int) -> bool:
        graph = [[] for _ in range(n)]
        for a,b in edges:
            graph[a].append(b)
            graph[b].append(a)

        def dfs(G, src, dst, visitati):
            visitati[src] = True
            if src == dst:
                return True
            for v in G[src]:
                if not visitati[v]:
                    if dfs(G, v, dst, visitati):
                        return True
            return False

        visitati = [False] * len(graph)
        return dfs(graph, source, destination, visitati)
