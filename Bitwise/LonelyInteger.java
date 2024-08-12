package Bitwise;

import java.util.Scanner;

public class LonelyInteger {
    static int Lonely(int[] arr){
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result = result ^ i;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }

        System.out.println(Lonely(arr));
    }
}
