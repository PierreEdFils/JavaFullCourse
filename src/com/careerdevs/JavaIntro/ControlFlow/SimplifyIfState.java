package com.careerdevs.JavaIntro.ControlFlow;

public class SimplifyIfState {
    public static void main(String[] args) {
        int income = 120_000;
        boolean hasHighIncome = income >100_000 ;

        String className = income >100_000 ? "First" : "Economy ";
        System.out.println(className);
    }
}
