//package Array;
//
//public class BitonicArray {
//    static int Ascending(int[] a, int key, int range) {
//        int l = 0, h = range, mid = 0;
//        while (l <= h) {
//            mid = (l + h) / 2;
//            if (key == a[mid]) {
//                return mid;
//            } else if (key < a[mid]) {
//                h = mid - 1;
//            } else {
//                l = mid + 1;
//            }
//        }
//        return -1;
//    }
//
//    static int Desending(int[]a,int key,int range) {
//        int l = range, h = a.length-1, mid = 0;
//        while (l <= h) {
//            mid = (l + h) / 2;
//            if (key == a[mid]) {
//                return mid;
//            } else if (key < a[mid]) {
//                l = mid + 1;
//            } else {
//                h = mid - 1;
//            }
//        }
//        return -1;
//    }
//
//    static int FindBitonic(int[]a){
//        int l=0,r=a.length,mid=0;
//        while(l<=r){
//            mid = (l+r)/2;
//            if (a[mid] > a[mid-1] && a[mid] > a[mid+1]) {
//                return mid;
//            } else if (a[mid]>a[mid-1] && a[mid]<a[mid+1] ) {
//                 l=mid;
//            } else {
//                 r=mid;
//            }
//        }
//        return-1;
//    }
//
//
//public static void main(String[]args){
//     int[]a ={5,6,7,8,10,3,2,1};
//     int key = 8;
//     int bIndex = FindBitonic(a);
//
//    static int SearchBitonic(int[]a,int key,int bindex){
//        if(key == a[bindex]) {
//            return bindex;
//        }
//        if(key > a[bindex]){
//            return -1;
//        }
//    }
//   }
//}
