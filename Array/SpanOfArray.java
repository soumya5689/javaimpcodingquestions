package Array;

public class SpanOfArray {
    static int spanOfArray(int[]a){
        int max = a[0];
        int min = a[0];

     for(int i=0;i<a.length;i++){
         if(a[i]>max){
             max = a[i];
         }
         if(a[i]<min){
             min = a[i];
         }
     }
        return max - min;
    }
    public static void main(String[]args){
        int[]a = {20, 42, 88, 10, 99, 6};
        System.out.println(spanOfArray(a));
    }
}
