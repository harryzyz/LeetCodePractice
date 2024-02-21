#
# @lc app=leetcode id=88 lang=python
#
# [88] Merge Sorted Array
#

# @lc code=start
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        for idx2 in range(n):
            for idx1 in range(m+n):
                if (nums2[idx2] < nums1[idx1] )| (nums1[idx1] == 0):
                    # nums1.insert(idx1,nums2[idx2]).pop()
                    nums1[idx1+1:] = nums1[idx1:-1]
                    nums1[idx1] = nums2[idx2] 
                    break                                 
        return None
        
# @lc code=end

