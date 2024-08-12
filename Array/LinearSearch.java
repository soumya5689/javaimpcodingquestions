package Array;

public class LinearSearch {
    public static int LinearSearchh(int[] arr,int key){
        for(int i=0; i<=arr.length-1;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {50,10,33,40,26};
        int key = 40;
        System.out.println(LinearSearchh(arr,key));
    }

}
