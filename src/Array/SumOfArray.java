package Array;

public class SumOfArray {
    public static void main(String[] args) {
        long n = 4;
        long a[] = {1,2,3,4};
        System.out.println(getSum(a,n));

    }
    public static long getSum(long a[], long n)
    {
        // Your code goes here
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        return sum;
    }
}
