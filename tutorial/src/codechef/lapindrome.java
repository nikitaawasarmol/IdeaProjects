package codechef;

import java.util.Scanner;

import static java.lang.Math.abs;

// class lapindrome {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();
//        for(int i = 0; i < t; i++) {
//           String s= input.next();
//           if (lapindromeOrNot(s))
//               System.out.println("YES");
//           else
//               System.out.println("NO");
//        }
//
//    }
//    static final int MAX = 26;
//
//    static boolean lapindromeOrNot(String string) {
//        int left[] = new int[MAX];
//        int right[] = new int[MAX];
//        int i, j;
//        int length = string.length();
//        if (length == 1)
//            return true;
//        for ( i = 0, j = length+1/2; i < j;i++, j++) {
//            left[string.charAt(i) - 'a']++;
//            right[string.charAt(j) - 'a']++;
//        }
//        for (i = 0; i <MAX; i++) {
//            if (left[i]!=right[i])
//                return false;
//        }
//        return true;
//    }



//   *** tom and jerry (lunch time 2021 div 3 question) ***

//class Codechef {
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int t;
//        t = sc.nextInt();
//        while (t > 0) {
//            int a, b, c, d, k, x;
//            b = sc.nextInt();
//            c = sc.nextInt();
//            a = sc.nextInt();
//            d = sc.nextInt();
//            k = sc.nextInt();
//            x = abs(a - c) + abs(b - d);
//
//            if(x > k) {
//                System.out.println("NO \n");
//            }
//            else if(x == k) {
//                System.out.println("YES \n");
//            }
//            else if((k - x)%2 == 0) {
//                System.out.println("YES \n");
//            }
//        }
//    }

// }