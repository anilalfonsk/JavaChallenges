package com.aak.blindsevenfive.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!values.add(nums[i])) return true;
        }
        return false;
    }
}
