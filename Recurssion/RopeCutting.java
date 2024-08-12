package Recurssion;

public class RopeCutting {
    public static int maxpiece(int n,int a, int b, int c){

        if(n == 0){
            return 0;
        } else if (n<0) {
            return -1;
        }
        int temp1 = maxpiece(n-a,a,b,c);
        int temp2 = maxpiece(n-b,a,b,c);
        int temp3 = maxpiece(n-c,a,b,c);

        int piece = Math.max(temp3,Math.max(temp1,temp2));

        if(piece == -1){
            return -1;
        }
        return piece+1;
    }


    public static void main(String[] args){
        System.out.println(maxpiece(15,5,8,7));
    }
}
