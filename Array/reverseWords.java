package Array;

public class reverseWords {
     public static void reverse(String s){
         String str[] =  s.split(" ");
         String ans = "";
         for (int i = str.length - 1; i >= 0; i--) {
             ans += str[i] + " ";
         }
         System.out.println(ans);
     }

    public static void main(String[] args) {
        String s = "Learning Java is easy";
        reverse(s);
    }
}
