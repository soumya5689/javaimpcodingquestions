package String;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    static boolean Analog(String s1,String s2){

      //to remove special character from a string
        String temp = " ";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                temp = temp+s1.charAt(i);
            }
        }
        s1 = temp;
        String temp1 = " ";
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!=' '){
                temp1 = temp1 + s2.charAt(i);
            }
        }
        s2 = temp1;


        //for converting to lower case
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //to convert into array
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        //to sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //to convert into string
        s1 = new String(arr1);
        s2 = new String(arr2);

        return s1.equals(s2);
    }

    public static void main(String[]args){
        String s1 = "funreal";
        String s2 = "okokok";

        System.out.println(Analog(s1,s2));
    }
}
