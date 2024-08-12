package Bitwise;

public class powerOf2 {
    static boolean power(int n){
        if(n==0){
            return false;
        }
        return (n&(n-1)) == 0;
    }

    public static void main(String[] args) {
      int n= 16;
        System.out.println(power(n));
    }
}
