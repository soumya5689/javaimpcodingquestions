package Qustion;

import java.util.Scanner;

public class rightsetbit {
    static int poseOfMsb(int n)
    {
      int m = 1;
      int pos = 0;

      if (n==0){
          return -1;
      }

      while((n & m) == 0){
          m = m<<1;
          pos++;
      }
        return pos+1;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(poseOfMsb(n));


    }
}
