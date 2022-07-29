package codechef.longChallengeJune;

import java.util.Scanner;

class bitwiseTuples {
        static int pow( long a, long b) {
            long mod = 1000000007;
            if(b == 0) return 1;
            if(b == 1) return (int) a;

            if(b % 2 == 0) {

                long ans = pow(a,b/2);
                return (int) ((ans * ans) % mod);
            }
            else {
                long ans = pow(a, ((b-1)/2));
                return (int) (((a*ans) % mod*ans)%mod);
            }
        }
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t --> 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long temp = pow(2, a) - 1;
                System.out.println(pow(temp, b));


            }
        }


}
    /* Works only if a >= 0 and b >= 0 */
//    static int pow(int x, int y)
//    {
//
//        return answer;
//    }

    // driver program to test above function
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int answer = 1;
//        while (t --> 0) {
//            int x = (2^n-1) % (10^9+7);
//            answer = x^m % (10^9+7);
//            System.out.println(answer);
////            y >>= 1;
//        }
//
//    }
//}

// This code is contributed by vt_m.