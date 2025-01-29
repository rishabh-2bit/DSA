package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FindXSumOfAllKLongSubArrays_3318 {

    public static void main(String[] args) {
        int k =6;
        int x = 2;
        System.out.println(findXSum(new int[]{1,1,2,2,3,4,2,3}, k,x));
    }


    // public static int[] findXSum(int[] nums, int k, int x) {
    //     int[] ans = new int[nums.length - k + 1];
    //     int in = 0;
    //     for (int i = 0; i < nums.length - k+1; i++) {
    //         Map<Integer, Integer> map = new HashMap<>();
    //         for (int j = i; j < i + k; j++) {
    //             map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
    //         }
    //         int sum = calculateTopNFrequentSum(map, x);
    //         ans[in++] = sum;
    //     }

    //     return ans;

    // }

    // public static int calculateTopNFrequentSum(Map<Integer, Integer> frequencyMap, int n) {
    //     PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
    //         (a, b) -> {
    //             if (b.getValue().equals(a.getValue())) {
    //                 return b.getKey() - a.getKey();
    //             }
    //             return b.getValue() - a.getValue();
    //         }
    //     );
    //     maxHeap.addAll(frequencyMap.entrySet());
    //     int sum = 0;
    //     int count = 0;
    //     while (!maxHeap.isEmpty() && count < n) {
    //         Map.Entry<Integer, Integer> entry = maxHeap.poll();
    //         sum += entry.getKey()*entry.getValue();
    //         count++;
    //     }

    //     return sum;
    // }

    public int[] findXSum(int[] nums, int k, int x) {
        int[] ar=new int[nums.length-k+1];
        int i=0;
        int max=maxy(nums);
        while(i<ar.length){
            int[] c=new int[max+1];
            int fr=0,j=i;
            while(j<k+i && k+i<=nums.length){
                c[nums[j]]++;
                fr=Math.max(fr,c[nums[j]]);
                j++;
            }
            int xx=x,sum=0;
            while(xx>0){
                boolean ch=true;
                for(int jj=c.length-1;jj>0;jj--){
                    if(fr==c[jj]){
                        sum+=fr*jj;
                        c[jj]=0;
                         xx--;
                        if(xx==0){
                            ch=false;
                            break;
                        }
                    }
                }
                    fr--;
                if(!ch || fr==0){
                    break;
                }}
             ar[i]=sum;
            i++;}
        return ar;
    }
    int maxy(int[] nums){
        int max=0;
        for(int i:nums){
            max=Math.max(i,max);
        }
        return max;
    }
    
}
