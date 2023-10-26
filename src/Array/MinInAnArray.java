package Array;

public class MinInAnArray {
    public static void main(String[] args) {
        int arr[] = {2,4,3,41,6,1,5,9,0,78,90};
        System.out.println(Min(arr));
    }

    private static int Min(int[] arr) {
        int min = arr[0];

        for (int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }
        return min;
    }
}
