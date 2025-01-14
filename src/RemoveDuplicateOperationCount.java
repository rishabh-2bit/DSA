import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateOperationCount {

    public static void main(String[] args) throws Exception {
        System.out.println(minimumOperations(new int[] { 0, 1, 1, 1, 0, 1, 1, 0, 1 }));
    }

    public static int minimumOperations(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int tdups = 0;
        for (int dups : hm.values()) {
            if (dups > 1) {
                tdups = tdups + dups - 1;
            }
        }
        int opCount = 0;
        while (tdups > 0) {
            if (nums.length >= 3) {
                int[] newArray = new int[nums.length - 3];
                System.arraycopy(nums, 3, newArray, 0, newArray.length);
                nums = newArray;
            } else {
                nums = new int[0];
            }
            hm.clear();
            for (int num : nums) {
                hm.put(num, hm.getOrDefault(num, 0) + 1);
            }

            tdups = 0;
            for (int dups : hm.values()) {
                if (dups > 1) {
                    tdups = tdups + dups - 1;
                }
            }
            opCount++;
        }
        return opCount;
    }
    
}
