package com.aak.blindsevenfive.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueLetterCountByRemovingMinimumZalando {
    public static void main(String[] args) {
        UniqueLetterCountByRemovingMinimumZalando uq =  new UniqueLetterCountByRemovingMinimumZalando();
        uq.solution("ccaaffddecee");
    }

    public int solution(String S) {

        Integer [] countOfChars = new Integer[26];
        Arrays.fill(countOfChars, 0);

        for (int i = 0; i <S.length() ; i++) {
            int index = S.charAt(i)-'a';
            int count = countOfChars[index];
            countOfChars[index] = count + 1;
        }

        ArrayList<Integer> countsList = new ArrayList<>();
        for (int i = 0; i<countOfChars.length ; i++) {
            if(countOfChars[i]>0)
                countsList.add(countOfChars[i]);
        }
        Collections.sort(countsList, Collections.reverseOrder());
        Integer[] countsArr = countsList.toArray(new Integer[countsList.size()]);
        int delCount=0;
        for (int i = 0; i <countsArr.length-1 ; i++) {
            for (int j = i+1; j <countsArr.length ; j++) {
                if (countsArr[i]>0 && countsArr[i]==countsArr[j]){
                    int count = countsArr[j];
                    countsArr[j] = count - 1;
                    delCount++;
                }else
                    break;
            }
        }
        return delCount;
    }
}
