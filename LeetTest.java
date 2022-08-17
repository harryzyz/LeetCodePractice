import java.util.Arrays;

public class LeetTest {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
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
            if (nums[i] == nums[0] - 1) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
            }
        }
        if (nums[counter - 2] < endpoint) {
            nums[counter - 1] = endpoint;
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(nums));
    }
}
