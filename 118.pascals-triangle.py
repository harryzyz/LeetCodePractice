#
# @lc app=leetcode id=118 lang=python
#
# [118] Pascal's Triangle
#

# @lc code=start
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        output = []
        for i in range(numRows):
            line = [1] * (i+1)
            output.append(line)
        for i in range(2,numRows):
            # print(output[i])
            output[i] = [1] + [sum(x) for x in zip(output[i-1][:-1], output[i-1][1:])] + [1]
        return output
        
# @lc code=end

