public class LC1493 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1};
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int zeroCount = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[l] == 0) {
                    zeroCount--;
                }
                l++;
            }

            maxLength = Math.max(maxLength, r - l);
            r++;
        }

        System.out.println(maxLength);
    }
}