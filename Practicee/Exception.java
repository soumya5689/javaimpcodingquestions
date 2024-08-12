package Practicee;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        System.out.println("connection is established");
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("enter the numerator");
            int a = sc.nextInt();
            System.out.println("enter the denominator");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (java.lang.Exception e) {
            System.out.println("provide a non zero denominator");
        }
        System.out.println("connection is terminated");
    }
}