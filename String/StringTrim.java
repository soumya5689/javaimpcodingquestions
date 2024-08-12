package String;

import java.util.Scanner;

public class StringTrim {

    static String trim(String s){
    int si = 0;
    int ei = 0;
    String t = "";
        for ( int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' '){
                 si = i;
                break;
            }
        }
        for ( int i=s.length()-1;i>=0; i++){
            if (s.charAt(i) != ' '){
                 ei = i;
                break;
            }
        }

        for(int i=si; i<= ei; i++);{
            int i = 0;
            t = t + s.charAt(i);
            }
        return t;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(trim(s));

    }

}
