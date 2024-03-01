#
# @lc app=leetcode id=1431 lang=python
#
# [1431] Kids With the Greatest Number of Candies
#

# @lc code=start
class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        mostCandies = max(candies)
        output = list(map(lambda x: x + extraCandies >= mostCandies, candies))
        return output
        
# @lc code=end

