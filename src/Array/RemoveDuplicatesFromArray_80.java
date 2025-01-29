package Array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromArray_80 {

    public static void main(String[] args) {
        List<Integer> ans = removeDuplicates(new int[]{1,1,1,2,2,3});
        ans.forEach(a -> System.err.println(a));
    }

    public static  List<Integer> removeDuplicates(int[] nums) {
        List<Integer> map = new ArrayList<>();
        int i=0;
        map.add(nums[i]);
        int temp=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] == nums[j] && temp ==0) {
                i++;
                nums[i] = nums[j];
                map.add(nums[i]);
                temp++;
            } else if(nums[i] != nums[j] && temp == 1) {
                i++;
                nums[i] = nums[j];
                map.add(nums[i]);
                temp--;
            } else {
                i++;
                nums[i] = nums[j];
            }

        }
        if(temp>0){
                nums[i] = nums[nums.length-1];
                map.add(nums[i]);
            }
        return map;
    }
    
}
