public class PivotValue {

    public static void main(String[] args){
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));

    } 

    public static int pivotIndex(int[] nums) {
        int tsum=0;
        for(int i =0; i < nums.length; i++){
            tsum = tsum + nums[i];
        }
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = tsum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum = leftSum + nums[i];
        }

        // for (int i = 0; i < nums.length; i++) {
        //     int leftSum = 0;
        //     int rightSum = 0;
        //     int left = 0;
        //     int right = i+1;
        //     while (right < nums.length) {
        //         rightSum = rightSum + nums[right];
        //         right++;
        //     }
        //     while (left < i) {
        //         leftSum = leftSum + nums[left];
        //         left++;
        //     }
        //     if (leftSum == rightSum) {
        //         return i;
        //     }

        // }
        return -1;
    }
    
}
