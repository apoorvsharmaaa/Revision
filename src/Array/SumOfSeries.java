package Array;

public class SumOfSeries {
    public static void main(String[] args) {
        int n=5;
        System.out.println(seriesSum(n));
    }
    public static long seriesSum(int n) {
        int a = 0;

        for (int i = 0; i <= n; i++) {
             a = i + a;
        }
        return a;
    }
}
