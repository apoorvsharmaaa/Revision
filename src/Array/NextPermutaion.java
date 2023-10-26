package Array;

import static java.util.Collections.reverse;

public class NextPermutaion {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        int j = n - 1;
        for (int i = n - 1; i >= idx + 1; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }
        reverse(nums, idx + 1, n - 1);
    }

    public static void reverse(int[] arr, int l, int r) {
        int start = l;
        int end = r;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}