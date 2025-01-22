public class App2 {
    public static void main(String[] args) {
        System.out.println(sub(new int[] { -1, -2, 0 }));
    }

    public static int sub(int[] nums) {
        int counter = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] % 2 != 0)
                continue;
            if ((nums[i - 1] + nums[i + 1]) == Math.abs((nums[i] / 2))) {
                counter++;
            }
        }
        return counter;
    }

}
