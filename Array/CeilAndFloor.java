package Array;

public class CeilAndFloor {

    static int Ceil(int[] a, int key) {
        int l = 0, h = a.length - 1, mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return a[l];
    }

    static int floor(int[] a, int key) {
        int l = 0, h = a.length - 1, mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if(h>0){
             return a[h];
        }else{
            return -1;
        }
    }
    public static void main(String[]args){
        int[] a = {19,23,56,61,72,88,92};
        int key = 57;

        System.out.println(Ceil(a,key));
        System.out.println(floor(a,key));
    }
}
