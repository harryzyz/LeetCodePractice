import java.util.Arrays;

public class No1480RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(runningSum(nums)));
        int[] nums2 = new int[] { 1, 1, 1, 1, 1 };
        System.out.println(Arrays.toString(runningSum(nums2)));
        int[] nums3 = new int[] { 3, 1, 2, 10, 1 };
        System.out.println(Arrays.toString(runningSum(nums3)));
    }

    public static int[] runningSum(int[] nums) {
        int[] answer = Arrays.copyOf(nums, nums.length);
        for (int i = 1; i < answer.length; i++) {
            answer[i] = answer[i - 1] + nums[i];
        }
        return answer;
    }
}

// Given an array nums. We define a running sum of an array as runningSum[i] =
// sum(nums[0]…nums[i]).

// Return the running sum of nums.

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
// Example 2:

// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1,
// 1+1+1+1+1].
// Example 3:

// Input: nums = [3,1,2,10,1]
// Output: [3,4,6,16,17]

// Constraints:

// 1 <= nums.length <= 1000
// -10^6 <= nums[i] <= 10^6
