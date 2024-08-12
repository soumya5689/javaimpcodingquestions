package Daily5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeleteAnElement {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,7};
        int element = 9;
        int[] arr3 = delete(arr,element);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] delete(int[] arr , int element) {
        int[] arr2 = new int[arr.length-1];
        int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != element){
                arr2[index] = arr[i];
                index ++;
            }
        }
        return arr2;
    }

}
