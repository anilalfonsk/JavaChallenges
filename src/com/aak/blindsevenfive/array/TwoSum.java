package com.aak.blindsevenfive.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
    //Create a hash map to hold the complements and the index
    //Check if complement exist in the hasmap, return the index.
    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        sum.twoSum(new int[]{2,7,11,15}, 9);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();
        int[] sums = new int[2];
        for(int i=0; i<nums.length; i++){
            if(!complement.containsKey(nums[i])){
                complement.put(target - nums[i], i);
            }else{
                sums[0] = complement.get(nums[i]);
                sums[1] = i;
            }
        }
        return sums;
    }
}
