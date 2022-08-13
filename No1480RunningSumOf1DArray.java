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
