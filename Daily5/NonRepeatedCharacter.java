package Daily5;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacter {

    public static void main(String[] args) {
        String str = "aabbcd";
        char c = getFirstNonRepeated(str);

        System.out.println(c);
    }

    public static char getFirstNonRepeated(String str){
        Map<Character, Integer> countmap = new LinkedHashMap<Character,Integer>();

        for (char ch: str.toCharArray()) {
            countmap.put(ch,countmap.containsKey(ch) ? countmap.get(ch) + 1 : 1);
        }
        for(Map.Entry<Character,Integer> entry: countmap.entrySet()){
            if(entry.getValue() ==1){
                return entry.getKey();
            }
        }
        throw new RuntimeException("didnt find any non repeated character");
    }


}
