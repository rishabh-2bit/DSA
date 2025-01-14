import java.util.Arrays;

public class DistinctAfterOperation {

    public static int maxDistinctElements(int[] nums, int k) {
    int disCount = 0;
    Arrays.sort(nums);
    for(int i = 0, lastValue = Integer.MIN_VALUE; i < nums.length; ++i){
        int min = nums[i] - k;
        int max = nums[i] + k;
        if(lastValue < min ) { 
            lastValue = min;
            disCount++;
         }
        else if(lastValue < max){ 
            lastValue = lastValue + 1;
            disCount++;
         }
    }
    return disCount;
}

public static void main(String [] args){
    System.out.println(maxDistinctElements(new int[]{ 1, 2, 2, 3, 3, 4}, 2));
}

    
}
