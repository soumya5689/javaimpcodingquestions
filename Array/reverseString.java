package Array;

public class reverseString {
    public static void reverse(String s){
        int n = s.length()-1;
        String reversed = "";
      for(int i = n;i>=0;i--){
          reversed = reversed + s.charAt(i);
      }
        System.out.println(reversed);
    }
    public static void main(String[] args) {
        String s = "RINKU";
        reverse(s);
    }
}
