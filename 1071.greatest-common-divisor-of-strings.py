#
# @lc app=leetcode id=1071 lang=python
#
# [1071] Greatest Common Divisor of Strings
#

# @lc code=start
class Solution(object):
    def gcdOfStrings(self, str1, str2):
        """
        :type str1: str
        :type str2: str
        :rtype: str
        """
        n = min(len(str1), len(str2))
        output = ''
        for i in range(n):
            div = str1[:i+1]
            if (str1.replace(div,'')=='') & (str2.replace(div,'')==''):
                output = div
        return output
        
# @lc code=end


