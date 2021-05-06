package com.aak.blindsevenfive.array;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
        System.out.println(maximumProductSubArray.maxProduct(new int[]{-2,0,-1}));
    }

    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0){
                int tmp = currentMax;
                currentMax = currentMin;
                currentMin = tmp;
            }

            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);
            maxProduct = Math.max(maxProduct, currentMax);
        }
        return maxProduct;
    }
}
