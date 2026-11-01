"""1903. Largest Odd Number in String"""

class Solution:
    def largestOddNumber(self, num: str) -> str:
        for x in range(len(num)-1,-1, -1):
            if num[x] in '13579':
                return num[:x+1]
        return ""
