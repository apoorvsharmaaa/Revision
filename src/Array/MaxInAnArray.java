package Array;

public class MaxInAnArray {
    public static void main(String[] args) {
        int arr[]={3,40,5,1,9};
        System.out.println(max(arr));
    }
    public static int max(int a[]){
        int v=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>v){
                v=a[i];
            }
        }
        return v;
    }
}
