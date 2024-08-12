package Qustion;

import java.util.Scanner;

public class BalancedParanthesis {
    static void BalPara(char[]arr,int n,int i,int o,int c){
        if(i== arr.length){
            System.out.println(arr);
        }

        if(o<n){
            arr[i] = '(';
            BalPara(arr,n,i+1,o+1,c);
        }

        if(c<o){
            arr[i] = ')';
            BalPara(arr,n,i+1,o,c+1);
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n*2];
        BalPara(arr,n,0,0,0);
    }
}
