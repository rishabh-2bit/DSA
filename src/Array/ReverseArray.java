package Array;

public class ReverseArray {

    // Recursive approach

    public static void reverseArray(int[] arr, int start, int end){

        if(start>end){
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start+1, end-1);
    }

    // swap approach
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) { 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        
    }

    public static void main(String[] args) {

        int[] arr = {10,20,32,22,17,23,27};
        reverseArray(arr, 0, arr.length-1);
        int[] arr2 = {10,20,32,22,17,23,27};
        reverseArray(arr2);
        for(int i : arr){
            System.out.print(i+", ");
        }
        System.out.println();
        for(int i : arr2){
            System.out.print(i+", ");
        }

        
    }
    
}
