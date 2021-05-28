package com.aak.blindsevenfive.array;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        System.out.println(findMinimumInRotatedSortedArray.findMin(new int[]{3,4,5,1,2}));
    }

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(nums[left] > nums[right]){
            int mid = (left + right)/2;
            if(nums[mid]>= nums[left]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }

}
