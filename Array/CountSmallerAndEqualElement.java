package Array;

public class CountSmallerAndEqualElement {
    static int CountEqual(int[]a,int key){
        int l=0,h=a.length-1,mid=0;
        while(l<=h) {
            mid = (l + h) / 2;
            if (key == a[mid]) {
                while(mid+1==key && a[mid+1]<a.length){
                    mid++;
                }
                break;
            } else if (key < a[mid]) {
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        if(a[mid]>key){
            return mid;
        }else{
            return mid+1;
        }
    }

    public static void main(String[]args){
        int[]a = {2,6,12,24,26,26,28,30};
        int key = 25;
        System.out.println(CountEqual(a,key));
    }
}
