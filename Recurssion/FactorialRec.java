package Recurssion;

public class FactorialRec {
    static int Fact(int n){
      if(n==0 || n==1) {
          return 1;
      }
      return n * Fact(n-1);

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(5));
    }
}
