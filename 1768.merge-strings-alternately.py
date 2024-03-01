#
# @lc app=leetcode id=1768 lang=python
#
# [1768] Merge Strings Alternately
#

# @lc code=start
class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        m = len(word1)
        n = len(word2)
        if m == 0:
            return word2
        if n == 0:
            return word1
        if m == n:
            return ''.join([''.join(x) for x in zip(word1,word2)])
        elif m < n:
            return ''.join([''.join(x) for x in zip(word1,word2)]) + word2[m:]
        else:
            return ''.join([''.join(x) for x in zip(word1,word2)]) + word1[n:]
        
# @lc code=end

