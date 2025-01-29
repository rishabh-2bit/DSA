package Array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
       List<Integer> ans = removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});
        ans.forEach(a -> System.err.println(a));
        
    }

    public static List<Integer> removeDuplicates(int[] nums) {
        List<Integer> map = new ArrayList<>();
        int i=0;
        map.add(nums[i]);
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]) {
                i++;
                nums[i] = nums[j];
                map.add(nums[i]);
            }
        }
        return map; 
        
    }
    
}
