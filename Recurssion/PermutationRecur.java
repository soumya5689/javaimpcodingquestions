package Recurssion;

import java.util.Scanner;

public class PermutationRecur {

    static void Permutation(char[]arr,int fi){
        if(fi == arr.length-1){
            System.out.println(arr);
            return;
        }

        for( int i = fi; i<arr.length;i++){
            swap(arr,i,fi);
            Permutation(arr,fi+1);
            swap(arr,i,fi);
        }
    }

    static void swap(char[]arr,int i, int fi){
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String sc = scan.next();
        Permutation(sc.toCharArray(),0);
        }
    }

