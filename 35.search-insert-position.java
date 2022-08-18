import java.util.Arrays;

/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = (int) Math.floor(nums.length / 2);
        while (true) {
            if (nums[n] == target) {
                break;
            } else if (nums.length == 1) {
                n++;
                break;
            } else if (nums[n] > target) {
                return searchInsert(Arrays.copyOfRange(nums, 0, n - 1), target);
            } else if (nums[n] < target) {
                return searchInsert(Arrays.copyOfRange(nums, n, nums.length - 1), target);
            }
        }
        return (int) n;
    }
}
// @lc code=end
