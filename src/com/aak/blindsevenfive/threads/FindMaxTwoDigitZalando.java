package com.aak.blindsevenfive.threads;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindMaxTwoDigitZalando {
    public static void main(String[] args) {
        FindMaxTwoDigitZalando findMaxTwoDigitZalando = new FindMaxTwoDigitZalando();
        System.out.println(findMaxTwoDigitZalando.solution(new String()));
    }

    public int solution(String S) {
        // write your code in Java SE 8
        if(S == null || S.length() == 0) return 0;
        else if(S.length() <= 2) return Integer.parseInt(S);
        final int[] intArr = Stream.of(S.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxVal = Integer.MIN_VALUE;
        for(int j = 1, i = j-1; j< intArr.length; i++, j++){
            System.out.println(intArr[i] +"::"+intArr[j]);
            int currentDouble = intArr[i]*10 + intArr[j];
            System.out.println("Current d"+currentDouble);
            maxVal = Math.max(maxVal, currentDouble);
            System.out.println(maxVal);
        }
        return maxVal;
    }


}
