package Qustion;

import java.util.Scanner;

public class TrailingZeros {

   static int trailingZeros(int n) {
       int res = 0;
       int powerOf5 = 5;
       while (n >= powerOf5) {
           res = res + (n/powerOf5);
           powerOf5 = powerOf5 * 5;
       }
       return res;
   }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailingZeros(n));

    }



}
