package Qustion;

import java.util.Scanner;


//
//    static int findLcm(int a, int b){
//        return a*b/EuclideLcd(a,b);
//    }
//    static int EuclideLcd(int a , int b) {
//        while (a != 0 || b != 0) {
//            if (a > b) {
//                a = a % b;
//            } else b = b % a;
//
//
//            if (a != 0) {
//                return a;
//            } else {
//                return b;
//            }
//
//        }//

//        public static void main (String[] args){
//            Scanner scan = new Scanner(System.in);
//            int a = scan.nextInt();
//            int b = scan.nextInt();
 //         System.out.println(findLcm(a, b));

  //      }
 //   }


public class lcd {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1, num2);

        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
        }

private static int calculateHCF(int a, int b) {
        // Ensure a is greater than or equal to b
//        if (b > a) {
//        int temp = a;
//        a = b;
//        b = temp;
//        }

        while (b != 0) {
        b = a % b;
        }

        return a;
        }
        }