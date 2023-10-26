package Array;

import java.util.Arrays;

public class ReverseAnArray {
    //    public static void main(String[] args) {
//        int arr[] = {1,2,3};
//        System.out.println(rev(arr));
//    }
//
//    private static int[] rev(int[] arr) {
//        for (int i=0;i<arr.length/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//        return arr;
//    }
//}
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        rev(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void rev(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        rev(arr,start+1,end-1);
    }
}
