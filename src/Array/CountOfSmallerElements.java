package Array;

public class CountOfSmallerElements {
    public static void main(String[] args) {
        long n =6;
        long[] a = {1,2,4,5,8,10};
        long x = 9;
        System.out.println(countOfElements(a,n,x));
    }
    public static long countOfElements(long arr[], long n, long x){
        long count = 0;
        for (int i=0;i<n;i++){
            if (arr[i]<=x){
                count++;
            }
        }
        return count;
    }
}
