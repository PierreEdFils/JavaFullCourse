package com.careerdevs.JavaIntro.DataTypes;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Name: ");
//        byte age = scanner.nextByte();
        String name = scanner.nextLine().trim();
//        System.out.println("You are" + age);
        System.out.println("You are " + name);
    }
}
