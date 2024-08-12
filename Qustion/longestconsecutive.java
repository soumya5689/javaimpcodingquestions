package Qustion;

public class longestconsecutive {

    static boolean isConsecutive(int n){
        if ((n & n<<1)!=0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int n = 12;
        System.out.println(isConsecutive(n));
    }
}
