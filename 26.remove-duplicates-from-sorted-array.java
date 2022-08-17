/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int target = nums[0];
        int endpoint = nums[nums.length - 1];
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == target) {
                nums[i] = nums[0] - 1;
                continue;
            } else if (nums[i] > target) {
                target = nums[i];
                counter++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length - 1 && nums[i] == nums[0] - 1) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
            }
        }
        if (counter - 2 > 0 && nums[counter - 2] < endpoint) {
            nums[counter - 1] = endpoint;
        }

        return counter;
    }
}
// @lc code=end
