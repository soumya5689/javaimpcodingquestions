package Qustion;

import java.util.Scanner;

public class CountDigit {
    static int CountDigits(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count ++;
        }
      return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CountDigits(n));

    }

    public static class CountDigitRecur {
          static int cdigit(int n){
              if(n==0){
                  return 0;
              }
              return cdigit(n/10) + 1;

          }

        public static void main (String[] args){
            int n = 12345;
            System.out.println(cdigit(n));
        }
    }
}
