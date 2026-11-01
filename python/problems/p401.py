"""401. Binary Watch"""

class Solution:
    def readBinaryWatch(self, turnedOn: int) -> list[str]:
        result = []
        if turnedOn < 9:
            self.bk(turnedOn, result, [8,4,2,1], [32,16,8,4,2,1],0,0, 0, 0)
        return result

    def bk(self, turnedOn, result, hours, minutes, h_idx, m_idx, h, m):
        if turnedOn == 0:
            result.append(f"{h}:{m:02d}")
            return
        for i in range(h_idx, len(hours)):
            sum = h + hours[i]
            if sum < 12:
                self.bk(turnedOn-1, result, hours, minutes, i+1, m_idx, sum, m)
        for i in range(m_idx, len(minutes)):
            sum = m + minutes[i]
            if sum < 60:
                self.bk(turnedOn-1, result, hours, minutes, len(hours), i+1, h, sum)
