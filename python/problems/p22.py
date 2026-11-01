"""22. Generate Parentheses"""

class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        result = []
        self.bk(n, [], 0,0, result)
        return result

    def bk(self, n, s, open, closed, result):
        if open == n and closed == n:
            result.append(''.join(s))
            return
        if open < n:
            s.append('(')
            self.bk(n, s, open+1, closed, result)
            s.pop()
        if open > closed:
            s.append(')')
            self.bk(n, s, open, closed+1, result)
            s.pop()
