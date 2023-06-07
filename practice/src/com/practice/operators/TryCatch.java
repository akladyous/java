package com.practice.operators;

import java.util.Scanner;

public class TryCatch {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please enter a numerator: ");
        double numerator = Double.parseDouble(sc.nextLine());

        System.out.println("plase enter a denominator: ");
        double denominator = Double.parseDouble(sc.nextLine());

        try {
            double div = numerator / denominator;
            System.out.println("division : " + div);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
