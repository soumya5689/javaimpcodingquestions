package Recurssion;

public class LuckyNumberRecu {

    public static boolean isLuckeyNumber(int n, int counter){

        if(n<counter){
            return true;
        }
        if(n % counter == 0){
            return false;
        }
        return isLuckeyNumber(n-n/counter,counter + 1);
    }

    public static void main(String[] args){
        System.out.println(isLuckeyNumber(13,2));
    }


}
