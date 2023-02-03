package com.careerdevs.JavaIntro.DataTypes;

import java.util.Arrays;

public class ArraysJava {
    public static void main(String[] args) {
//        int [] numbers =  new int[5];
//        numbers [0] = 1;
//        numbers [1] = 2;
//        numbers [10] = 3;
        int [] numbers ={ 2, 3, 5, 1, 4 };

//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);
        Arrays.sort (numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
