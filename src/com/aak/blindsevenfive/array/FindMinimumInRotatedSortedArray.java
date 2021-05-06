package com.aak.blindsevenfive.array;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        System.out.println(findMinimumInRotatedSortedArray.findMin(new int[]{3,4,5,1,2}));
    }

    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) return Integer.MIN_VALUE;
        int left = 0;
        int right = nums.length - 1;
        while(left < right-1){
            int mid = (left + (left-right))/2;
            if(nums[mid] > nums[right]) right = mid;
            else left = mid;
        }
        if (nums[left] > nums[right]) return nums[right];
        return nums[left];
    }

    public int iFindMin(int[] nums) {
        int minVal = nums[0];
        for(int n : nums){
            if(minVal > n) minVal = n;
        }
        return minVal;
    }
}
