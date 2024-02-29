#
# @lc app=leetcode id=121 lang=python
#
# [121] Best Time to Buy and Sell Stock
#

# @lc code=start
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        profit = 0
        for idx, cv in enumerate(prices[:-1]):
            diff = max(list(map(lambda x: x - cv, prices[idx+1:])))
            if diff > profit:
                profit = diff
        return profit
        
# @lc code=end

