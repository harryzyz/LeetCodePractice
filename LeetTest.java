

public class LeetTest {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n = 3;
        int m = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + n; j++) {
                if (nums1[j] > nums2[i]) {
                    for (int k = m + n - 1; k > j; k--) {
                        nums1[k] = nums1[k - 1];
                    }
                    nums1[j] = nums2[i];
                    break;
                } 

            }
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[j] > nums2[i]) {
                    for (int k = m - 1; k > j; k--) {
                        nums1[k] = nums1[k - 1];
                    }
                    nums1[j] = nums2[i];
                    break;
                } else {
                    
                }

            }
        }
    }
}
