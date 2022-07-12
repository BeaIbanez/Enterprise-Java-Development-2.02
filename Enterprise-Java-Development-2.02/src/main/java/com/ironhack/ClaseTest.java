package com.ironhack;

import java.util.ArrayList;
import java.util.List;

public class ClaseTest {

    public static int[] oddInteger(int n) {

        int[] odds = new int[0];
        int[] finalA = new int[0];

        if (n <= 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    odds = new int[finalA.length + 1];
                    for (int j = 0; j < finalA.length; j++) {
                        odds[j] = finalA[j];
                    }
                    odds[finalA.length] = i;
                }
                finalA = odds;
            }
        }
        return finalA;
    }

    public static  int [] retorno(int n) {
        List <Integer> numbers = new ArrayList<>();

        int [] finalA;

        if(n <= 0) {
            throw new IllegalArgumentException();
        } else {
            for(int i = 1; i <= n; i++) {
                if(i % 2 != 0){
                    numbers.add(i);
                }
            }
        }
        finalA = new int[numbers.size()];

        for(int i = 0; i < finalA.length; i++) {
            finalA[i] = numbers.get(i);
        }
        return finalA;
    }
}