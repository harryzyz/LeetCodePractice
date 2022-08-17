/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int target = nums[0];
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != target) {
                nums[counter] = nums[i];
                target = nums[i];
                counter++;
            } else {
                continue;
            }
        }

        return counter;
    }
}
// @lc code=end
