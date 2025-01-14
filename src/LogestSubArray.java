public class LogestSubArray {
    public static void main(String[] args) throws Exception {
        System.out.println(longestSubarray(new int[] { 0, 1, 1, 1, 0, 1, 1, 0, 1}));
    }

    public static int longestSubarray(int[] nums) {

        int maxw = 0;
        int left = 0;
        int right = 0;
        int zero = 0;
        while (right < nums.length) {
            if (nums[right] == 0)
                zero++;
                right++;
            while (zero < 2 && left < right) {
                if (nums[left] == 0) {
                    zero--;
                }
                left++;
            }
            maxw = Math.max(maxw, right - left);
            right++;
        }
        return maxw;
    }
}
