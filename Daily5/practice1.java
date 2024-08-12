package Daily5;

import java.util.Scanner;

public class practice1 {
    public static void Pairsum(int[] arr, int k){
        int i =0;
        int j = arr.length-1;

        while(i<j){
            if(arr[i] + arr[j]>k){
                j--;
            }else if(arr[i] + arr[j]<k){
                i++;
            }else if(arr[i]+arr[j] == k){
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = 9;

        Pairsum(arr,k);
    }
}
