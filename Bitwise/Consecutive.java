package Bitwise;

public class Consecutive{
    static int consecutive(int n){
        int count =0;
        while(n>0){
            n = n & (n<<1);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n =30;
        System.out.println(consecutive(n));
    }
}
