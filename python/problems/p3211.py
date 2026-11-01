"""3211. Generate Binary Strings Without Adjacent Zeros"""

class Solution:
    def validStrings(self, n: int) -> list[str]:
        result = []

        def bk(s):
            if len(s) == n:
                result.append(s)
                return
            if s[-1] == '1':
                bk(s + '0')
            bk(s + '1')

        bk('0')
        bk('1')
        return result
