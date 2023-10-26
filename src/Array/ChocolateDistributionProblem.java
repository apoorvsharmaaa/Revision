package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int n=8;
        int m=5;
//        ArrayList<Integer>a = {1,2,3};
//        System.out.println(findDiff(a,n,m));
    }

    private static long findDiff(ArrayList<Integer> a, int n, int m) {

        Collections.sort(a);
        long minDiff = Long.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            minDiff = Math.min(a.get(i+(int)m-1)-a.get(i),minDiff);
        }
        return minDiff;
    }
}
