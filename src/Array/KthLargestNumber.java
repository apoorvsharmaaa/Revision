package Array;

import java.util.Arrays;

public class KthLargestNumber {
    public static void main(String[] args) {
        int [ ]nums = {3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            c = nums[nums.length- k];
        }
        return c;
    }
}
