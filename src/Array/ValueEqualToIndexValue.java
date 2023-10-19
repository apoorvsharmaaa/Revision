package Array;

import java.util.ArrayList;

public class ValueEqualToIndexValue {
    public static void main(String[] args) {
        int arr[] = {15, 2, 5, 9, 7};
        int n = 5;
        System.out.println(valueEqualToIndex(arr, n));
    }

    public static ArrayList valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> l = new ArrayList<>();
        int c=1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == c) {
                l.add(arr[i]);
            }
            c++;
        }
        return l;
    }
}