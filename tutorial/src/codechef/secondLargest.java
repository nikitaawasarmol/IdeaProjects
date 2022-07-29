//package codechef;
//
//import java.util.Scanner;
//
//public class secondLargest {
//
//    public static int secondlargest(int[] a, int total) {
//        int temp;
//        for(int i = 0; i < total; i++){
//            for (int j = i + 1; j < total; j++) {
//                if(a[i] > a[j]) {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        return a[total - 2];
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a[] = new int[1000];
//        int b[] = new int[1000];
//        System.out.println(secondlargest);
//        System.out.println(secondlargest(b));
//
//    }
//}
