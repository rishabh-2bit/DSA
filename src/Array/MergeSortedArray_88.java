package Array;

public class MergeSortedArray_88 {

    public static void main(String[] args) {
        int m=3;
        int n=3;
        merge(new int[]{1,2,3,0,0,0}, m, new int[]{2,5,6}, n);
        
    }

    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int i = m-1;
        int j= n-1;

        while(j >= 0){
            if( i >=0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;

            }
        }
        for (int l : nums1) {
            System.out.print(" "+l);
        }
        
    }
    
}
