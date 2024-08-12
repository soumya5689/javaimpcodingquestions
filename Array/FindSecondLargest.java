package Array;

public class FindSecondLargest {
      static int SecondLargest(int[]a){
          int max1=0,max2=0;
          if(a[0]>a[1]){
              max1 = a[0];
              max2 = a[1];
          }
          else{
              max1 = a[1];
              max2 = a[0];
          }

      for(int i=2;i<a.length;i++){

          if(a[i]>max1){
              max2 = max1;
              max1 = a[i];
          } else if (a[i]>max2) {
              max2 = a[i];
          }
      }
          return max2;
      }

    public static void main(String[]args){
        int[]a = {20, 42, 6, 25, 3};
        System.out.println(SecondLargest(a));
    }
}
