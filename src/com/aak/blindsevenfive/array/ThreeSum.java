package com.aak.blindsevenfive.array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[]{0,0,0}).forEach(integers -> {
            integers.forEach(integer -> System.out.print(":"+integer));
            System.out.println("");
        });
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> retVal = new ArrayList();
        int target = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int newTarget = target - nums[i];
            int left = i+1;
            int right = nums.length -1;
            while(left < right){
                if((i+1!=left && (nums[left] == nums[left-1])) || ((right != nums.length-1) && (nums[right] == nums[right+1]))){
                    continue;
                }
                int tempSum = nums[left] + nums[right];
                if (tempSum == newTarget) {
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[i]);
                    tempList.add(nums[left]);
                    tempList.add(nums[right]);
                    retVal.add(tempList);
                    left = left+1;
                    right = right-1;
                }else if(tempSum<newTarget){
                    left = left+1;
                }else{
                    right = right-1;
                }
            }
        }
        return retVal;
    }
}
