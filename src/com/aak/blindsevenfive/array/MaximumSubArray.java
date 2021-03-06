package com.aak.blindsevenfive.array;

public class MaximumSubArray {
    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        System.out.println(maximumSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] A) {
        int maxSoFar = A[0];
        int maxEndingHere = A[0];
        for(int i  = 1; i < A.length; i++){
            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
