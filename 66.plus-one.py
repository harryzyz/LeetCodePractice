#
# @lc app=leetcode id=66 lang=python
#
# [66] Plus One
#

# @lc code=start
class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        digits[-1] += 1
        i = -1
        try:
            while digits[i] == 10:
                print(i)
                digits[i] = 0
                digits[i-1] += 1
                i -= 1
        except:
            digits.insert(0,1)
            while digits[i] == 10:
                print(i)
                digits[i] = 0
                digits[i-1] += 1
                i -= 1
        return digits
# @lc code=end

