package Recurssion;

public class sumofdgitRecursion {
    static int sumof(int n){
        if(n==0){
            return 0;
        }
        return sumof(n/10) + (n%10);
    }


    public static void main(String[] args){
        int n = 5251;
        System.out.println(sumof(n));
    }
}
