#
# @lc app=leetcode id=1 lang=python
#
# [1] Two Sum
#

# @lc code=start
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for idx1, num1 in enumerate(nums):
            # print(idx1, num1)
            for idx2, num2 in enumerate(nums[idx1+1:]):
                # print(idx2, num2)
                if num1 + num2 == target:
                    return [idx1, idx1 + idx2 + 1]
        
# @lc code=end

