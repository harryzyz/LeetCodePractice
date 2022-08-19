

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        digits[n]++;
        while (digits[n] == 10 && n != 0) {
            digits[n] = 0;
            digits[n - 1] = digits[n - 1] + 1;
            n--;
        }
        if (digits[0] == 10) {
            digits[0] = 0;
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i - 1];
            }
            return newDigits;
        }
        return digits;
    }
}
// @lc code=end
