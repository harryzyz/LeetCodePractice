#
# @lc app=leetcode id=605 lang=python
#
# [605] Can Place Flowers
#

# @lc code=start
class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        if flowerbed == [0]:
            return True
        if (flowerbed[:2] == [0,0]):
            flowerbed[0] = -1
        if (flowerbed[-2:] == [0,0]):
            flowerbed[-1] = -1
        for idx, _ in enumerate(flowerbed,1):
            if (flowerbed[idx-1:idx+2] == [0,0,0]):
                flowerbed[idx] = -1
        capacity = sum(list(map(lambda x: x==-1, flowerbed)))
        return capacity >= n
# @lc code=end

