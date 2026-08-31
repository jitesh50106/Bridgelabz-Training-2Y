import java.util.Arrays;
public class LC16 {
     public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 1;       
        Arrays.sort(nums);
        int n = nums.length;  
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    closest = sum;
                    break; 
                }
            }
        }
        
        System.out.println(closest);
    }
}
