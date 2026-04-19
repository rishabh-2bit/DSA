package Array;

public class ConcatenationOfArray_L1929 {

    public static void main(String[] args) {
        int[] ans = getConcatenation(new int[] { 1, 2, 1 });
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];
        // Brute force
        for (int i = 0; i < ans.length - n; i++) {
            ans[i] = nums[i];

        }

        for (int i = n; i < ans.length; i++) {
            ans[i] = nums[i - n];
        }
        /*
         * Optimized code
         * for (int i = 0; i < n; i++) {
         * ans[i] = nums[i];
         * ans[i + n] = nums[i];
         * }
         */
        return ans;

    }

}
