package Qustion;

import java.util.Scanner;

public class gcd {
    static int greatest(int a,int b){
       while(a!=b){
           if(a>b){
               a = a-b;
           }else
               b = b - a;
       }
       return a;
    }


    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(greatest(a,b));
    }
}
