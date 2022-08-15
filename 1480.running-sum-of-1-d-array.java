import java.util.Arrays;

/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {
        int[] answer = Arrays.copyOf(nums, nums.length);
        for (int i = 1; i < answer.length; i++) {
            answer[i] = answer[i - 1] + nums[i];
        }
        return answer;
    }
}
// @lc code=end

