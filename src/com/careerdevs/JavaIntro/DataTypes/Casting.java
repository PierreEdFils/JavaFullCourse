package com.careerdevs.JavaIntro.DataTypes;

public class Casting {
    public static void main(String[] args) {
        //Implicit casting
        //byte > short > int > long
//        double  x =1.1;
//        int y = (int) x +2;
//        double y= x + 2;
        String x="1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);
    }
}
