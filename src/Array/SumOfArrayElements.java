package Array;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int n=3;
        int arr[] = {1,2,3};
        System.out.println(sumElement( arr,n));
    }

    public static int sumElement(int[] arr, int n) {
        int c=0;
        for (int i=0;i<n;i++){
            c = arr[i]+c;
        }
        return c;
    }
}
