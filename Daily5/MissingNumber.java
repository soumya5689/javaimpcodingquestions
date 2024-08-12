package Daily5;

import java.util.Collections;
import java.util.HashSet;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,21};
        missingnumber(arr);
    }

    public static void missingnumber(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i: arr) {
            set.add(i);
        }
        int max = Collections.max(set);
        int min =Collections.min(set);

        for (int i=min;i<max;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }

    }

}
