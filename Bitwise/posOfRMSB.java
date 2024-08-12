package Bitwise;

public class posOfRMSB {
    static int posRMSB(int n){
        int mask = 1;
        int pos = 0;
        if(n==0){
            return -1;
        }
         while((n&mask) == 0){
             mask = mask<<1;
             pos++;

         }
     return pos + 1;
    }

    public static void main(String[] args) {
        int n= 40;
        System.out.println(posRMSB(n));
    }

}
