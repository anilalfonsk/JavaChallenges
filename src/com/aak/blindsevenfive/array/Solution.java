package com.aak.blindsevenfive.array;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(isCorrect(A)){
            return 0;
        }
        int count = 0;
        for(int i = 0; i<A.length; i++){
            int[] arrTemp = removeEle(A, i);
            if(isCorrect(arrTemp)){
                count++;
            }
        }
        return count == 0 ? -1 : count;
    }

    boolean isCorrect(int[] arr){
        boolean firtItr = true;
        boolean isIncr = false;
        for(int i=0;i<arr.length;i++){
            if(firtItr){
                if(arr[i] < arr[i+1]) {
                    isIncr = true;
                }
                firtItr = false;
            }else{
                if(isIncr) {
                    if(i%2 ==1 && arr[i] > arr[i-1]){
                        //true condition
                    }else if(i%2 == 0 && arr[i] < arr[i-1]){
                        //true condition
                    }else{
                        return false;
                    }
                }else{
                    if(i%2 ==1 && arr[i]>arr[i-1]){
                        //true condition
                    }else if(i%2 ==0 && arr[i]>arr[i-1]){
                        //true condition
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }

    int[] removeEle(int[] arr, int index){
        int[] newArray = new int[arr.length-1];
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(i==index) continue;
            newArray[j] = arr[i];
            j++;
        }
        return newArray;
    }

    public int solution(int[] A, int count, int interval) {
        // write your code in Java SE 8
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i< A.length-(interval*(count-1)); i++){
            int temp = 0;
            int sum = 0;
            for(int j = i; temp < count; j=j+interval){
                temp++;
                sum = sum + A[j];
            }
            minVal = Math.min(sum, minVal);
        }
        return minVal == Integer.MAX_VALUE ? 0 : minVal;
    }
}
