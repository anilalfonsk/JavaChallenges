package com.aak.blindsevenfive.array;

import java.util.Arrays;

public class ProductExceptSelf {
    //Using two loops, one from the beginning one from the end,
    //Calculate only product in one direction left, then right.
    public static void main(String[] args) {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        Arrays.stream(productExceptSelf.productExceptSelf(new int[]{1,2,3,4})).forEach(System.out::println);
    }

    public int[] productExceptSelf(int[] nums) {
        int[] response = new int[nums.length];
        response[0] = 1;
        int left = 1;
        for(int i=1;i<nums.length;i++){
            left = left * nums[i-1];
            response[i] = left;
        }
        int right = 1;
        for(int j=nums.length-2; j>=0; j--){
            right = right * nums[j+1];
            response[j] = response[j] * right;
        }
        return response;
    }

    public int[] productExceptSelfOld(int[] nums) {

        //Create a new respone array.
        int[] response = new int[nums.length];

        //Iterate and find product of values in the left, ie value that passed through in loop one over the other
        int left = 1;
        for(int i=0; i<nums.length; i++){
            if(i>0){
                left = left * nums[i-1];
            }
            response[i] = left;
        }

        //Iterate from end and find product of values in the left,
        // ie value that passed through in loop one over the other
        int right = 1;
        for(int j = nums.length-1; j>=0; j--){
            if(j < nums.length - 1){
                right = right * nums[j + 1];
            }
            response[j] = response[j] * right;
        }
        return response;
    }
}
