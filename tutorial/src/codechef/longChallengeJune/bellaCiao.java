//package codechef.longChallengeJune;
//
//import java.util.Scanner;
//
///*  D  d  P  Q
//    3  2  1  1
//
//    first 2d days , P = 1 * 2 = 2
//    third day P = P + Q, 1 + 1 = 2
//    total = 2 + 2
//
//    D  d  P  Q
//    5  2  1  2
//
//    first two days, P = 1*2 = 2
//    next two days =  P = P + Q, 1 + 2 = 3, for two days it will be - 3 * 2 = 6
//    last day , P = P + Q, 3 + 2 = 5.
//    total = 2 + 6 + 5 = 13
//*/
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class bellaCiao {
//    static class FastReader {
//        BufferedReader br;
//        StringTokenizer st;
//
//        public FastReader() {
//            br = new BufferedReader(new InputStreamReader(System.in));
//        }
//
//        String next(){
//            while (st == null || !st.hasMoreElements()){
//                try {
//                    st = new StringTokenizer(br.readLine());
//                }
//                catch (IOException  e){
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//
//        int nextInt(){
//            return Integer.parseInt(next());
//        }
//
//        long nextLong(){
//            return Long.parseLong(next());
//        }
//
//        double nextDouble(){
//            return Double.parseDouble(next());
//        }
//
//        String nextLine(){
//            String str = "";
//            try{
//                str = br.readLine();
//            }
//            catch (IOException e){
//                e.printStackTrace();
//            }
//            return str;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        FastReader sc =new FastReader();
//
//        int t = sc.nextInt();
//
//        for(int i = 0; i < t; i++ ) {
//            long D = sc.nextLong();
//            long d = sc.nextLong();
//            long P = sc.nextLong();
//            long Q = sc.nextLong();
////            long x;
////
////
//            int ans = 0;
//            long x = D/d;
//            long rem = D%d;
//            long z= 1, c = 2;
//            System.out.println(D*P+(Q*d*x*(x-z))/c+Q*x*rem);
////
////            x = D/d;
////            if(x % 2 ==0) {
////                count += d * ((x / 2) * (2 * P + (x -1) * Q));
////            }
////            else {
////                count += d * (x * (P + ((x -1)/ 2) * Q));
////            }
////            count += (D % d) * (P + (x) * Q);
//
//
//        }
//    }
//}
