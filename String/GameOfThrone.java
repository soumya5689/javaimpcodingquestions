package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GameOfThrone {
    public static void GameOf(char[] arr){
        int i=0;
        int ErrorCount = 0;

        while(i<arr.length){
          if(i<arr.length-1 && arr[i]==arr[i+1]){
              i=i+2;
          }
          else{
              i++;
              ErrorCount++;
          }

          if(ErrorCount<=1){
              System.out.println("Yes");
          }
          else{
              System.out.println("No");
          }
        }
    }

    public static void main(String[]args){
        String s = "mmdaa";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
       GameOf(arr);
    }
}
