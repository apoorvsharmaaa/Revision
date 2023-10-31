package Array;

import java.util.Arrays;
import java.util.HashSet;

public class RepeatAndMissingNumberInArray {
    public static void main(String[] args) {
        int A[] = {3,1,2,5,3};
        System.out.println( repeatedNumber(A));
    }

    private static int[] repeatedNumber(int[] A) {
        int []ans = new int[2];
        HashSet<Integer>st = new HashSet<>();
        int c=0;
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if(c+1!=A[i]){
                ans[1]=c;
            }
            else{
                c=A[i];
            }
        }
        for(int i=0;i<A.length;i++){
            if(st.contains(A[i])){
                ans[0]=A[i];
            }
            else{
                st.add(A[i]);
            }
        }
        return ans;
    }
}

