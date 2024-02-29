#
# @lc app=leetcode id=119 lang=python
#
# [119] Pascal's Triangle II
#

# @lc code=start
class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        if rowIndex == 0:
            return [1]
        elif rowIndex == 1:
            return [1,1]
        else:
            output = [1,1]
            i = 2
            while i <= rowIndex:
                output = [1] + [sum(x) for x in zip(output[:-1], output[1:])] + [1]
                i += 1
            return output
        
# @lc code=end

