package Array;

import java.util.Scanner;

public class MergeTwoArray {

    public static int[] Merge(int[] arr1 ,int[] arr2){
        int[] res = new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                res[k] = arr1[i];
                k++;
                j++;
            }else{
                res[k] = arr2[j];
                k++;
                i++;
            }
        }
        while(j<arr1.length){
            res[k] = arr1[i];
            k++;
            i++;
        }

        while(j<arr1.length){
            res[k] = arr2[j];
            k++;
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        int[] res = Merge(arr1,arr2);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
