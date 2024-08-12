package Recurssion;

public class CountsetbitRecu{
    public static int Countbit(int[]arr,int sum,int i){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(i==arr.length){
            return 0;
        }
        return Countbit(arr, sum - arr[i], i + 1) + Countbit(arr, sum, i + 1);
    }
    public static void main(String[] args){
        int[] arr ={20,10,15,5};
        System.out.println(Countbit(arr,25,0));
    }
}
