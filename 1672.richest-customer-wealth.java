/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        int answer = 0;
        for (int i = 0; i < accounts.length; i++) {
            int totalWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                totalWealth += accounts[i][j];
            }
            if (answer < totalWealth) {
                answer = totalWealth;
            }
        }
        return answer;
    }
}
// @lc code=end

