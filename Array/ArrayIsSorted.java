package Array;

public class ArrayIsSorted {
    static boolean isSorted(int[]a){
        for(int i=1;i<=a.length;i++){
            if(a[i]>a[i-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[]args){
        int[]a = {2,4,6,8,10,20,30};
        System.out.println(isSorted(a));
    }
}
