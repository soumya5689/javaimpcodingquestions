package Array;

public class CountString {
    static int CountWord(String s, String word) {
        int count = 0;
        int index = 0;
        int wordLength = word.length();
         for(int i=0;i<s.length()-wordLength;i++) {
             if (s.substring(i, i + wordLength).equals(word)) {
                 count++;
             }
         }
        return count;
    }

    public static void main(String[] args) {
      String s = "codexxcodxxcodxxcodexx";
        String word = "code";
        System.out.println(CountWord(s, word));
    }
}
