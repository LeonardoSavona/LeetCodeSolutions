"""1436. Destination City"""

class Solution:
    def destCity(self, paths: list[list[str]]) -> str:
        graph = {}
        for a,b in paths:
            graph[a] = b
            if not graph.get(b):
                graph[b] = None
        for src, dest in graph.items():
            if not dest:
                return src
        return ""
