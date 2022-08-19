/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + n; j++) {
                if (nums1[j] > nums2[i]) {
                    for (int k = m + n - 1; k > j; k--) {
                        nums1[k] = nums1[k - 1];
                    }
                    nums1[j] = nums2[i];
                    break;
                } else {

                    nums1[i+m] = nums2[i];
                }
            }
        }
    }
}
// @lc code=end
