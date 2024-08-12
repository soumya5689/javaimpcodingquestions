package Recurssion;

import java.util.Scanner;

public class RevStringRecur {
    static String reverse(String s,String r, int i){
        if(i<0){
            return r;
        }

        return reverse(s,r+s.charAt(i),i-1);
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(reverse(s,"",s.length()-1));
    }
}
