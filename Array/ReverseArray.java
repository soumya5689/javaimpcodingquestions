package Array;

public class ReverseArray {
    static void Reverse(int[]a){
        int i=0,j=a.length-1;
        while(i<j) {
          int t=a[i];
           a[i]=a[j];
           a[j]=t;
           i++;
           j--;
        }
    }

    public static void main(String[]args){
        int[]a = {2,4,6,8,10,12,14};
        Reverse(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
