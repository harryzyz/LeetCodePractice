#
# @lc app=leetcode id=35 lang=python
#
# [35] Search Insert Position
#

# @lc code=start
class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        for idx, num in enumerate(nums):
            if num < target:
                pass
            else:
                return idx
        return len(nums)
        
        
# @lc code=end

