package com.aak.blindsevenfive.threads;

public class BreakIntArrWithMinimumCost {
    public static void main(String[] args) {

    }

    public int solution(int[] array) {
        if(array.length < 3) return 0;
        int minCost = Integer.MAX_VALUE;
        int min = array[1];
        for (int i = 3; i < array.length - 1; i++) {
            min = Math.min(min, array[i - 2]);
            if (array[i] + min < minCost) {
                minCost = array[i] + min;
            }
        }
        return minCost;
    }
}
