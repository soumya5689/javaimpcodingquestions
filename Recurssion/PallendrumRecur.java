package Recurssion;

import java.util.Scanner;

public class PallendrumRecur {
    static boolean isPallendrom(String s,int i, int j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        if(j<=i){
            return true;
        }
        return isPallendrom(s,i+1, j-1);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPallendrom(s,0,s.length()-1));


    }
}
