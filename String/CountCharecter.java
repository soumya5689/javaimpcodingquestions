package String;

public class CountCharecter {
    static long RepChar(String s,int n) {
        long countA = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countA++;
            }
        }
        long count1 = n / s.length() * countA;
        long count2 = 0;

        for (int i = 0; i < n % s.length(); i++) {
            if(s.charAt(i)=='a'){
                count2++;
            }
        }
        return count1 + count2;
    }


    public static void main(String[]args){
        String s = "abcaabcaabcaabca";
        int n = 12;
        System.out.println(RepChar(s,n));
    }
}
