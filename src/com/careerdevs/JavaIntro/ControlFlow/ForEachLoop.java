package com.careerdevs.JavaIntro.ControlFlow;

public class ForEachLoop {
    public static void main(String[] args) {
        String []  fruits ={"Apple","Mango", "Orange"};

//        for (int i = 0; i < fruits.length; i++)
            for (int i = fruits.length; i <0 ; i--)
                System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
