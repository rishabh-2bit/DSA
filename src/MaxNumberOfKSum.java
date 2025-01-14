import java.util.Arrays;

public class MaxNumberOfKSum {

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[] { 4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4},2));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int first = 0;
        int last = nums.length-1;
        int op = 0;

        while(first < last){
            int sum = nums[first] + nums[last];
            if(k == sum){
                op++;
                first++;
                last--;
            } else if (sum < k){
                first++;
            } else last--;
        }

        return op;
    }

 }

