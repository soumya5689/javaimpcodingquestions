package Array;
import java.util.HashMap;
import java.util.Map;

public class CountEachLetter {
        public static Map<Character, Integer> countLetters(String str) {
            Map<Character, Integer> countMap = new HashMap<>();
            for (char c : str.toCharArray()) {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
            return countMap;
        }
      public static void main(String[] args) {
        String str = "DDCAABBCCD";
        Map<Character, Integer> letterCount = countLetters(str);
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + "="  + entry.getValue());
        }
      }
    }

