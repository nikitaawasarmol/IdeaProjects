package codechef.longChallengeJune;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class shortestRoute {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static void main(String[] args) {
        // inputs
        FastReader sc = new FastReader();
        // test case input
        long t = sc.nextLong();
        while(t --> 0) {
            // n = no of people, m = no of people travelling
//            long n = sc.nextLong();
//            long m = sc.nextLong();
//            // array input which shows status of station
//            long[] a = new long[(int) n];
//            for(int i = 0; i < n; i++) {
//                a[i]  = sc.nextLong();
//            }
//            long[] b = new long[(int)m];
//            for(int i = 0; i < m; i++) {
//                b[i]  = sc.nextLong();
//            }
//           int MAX = (int) 1e9;
//            List<Integer> map = new ArrayList<>();
//            for (int i =0; i< n;i++) {
//                if(i==0) {
//                    map.set(i, 0);
//                }
//                else if(a[i] != 0) {
//                    map.set(i, 0);
//
//                }
//                else map.set(i, MAX);
//            }
//
//            int right = -1;
//            for (int i = 0; i<n;i++);{
//                if(a[i] == 1) right = i;
//                if(right!=-1) {
//                    if(a[i] == 0) map[i] =
//                }
//            }
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for(int i =0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for(int i = 0;i < m; i++) {
                b[i] = sc.nextInt();
            }
            int maxi = (int) (3e5+5);
            int[] temp = new int[n];
            int low= -1;
            int high = -1;
            for(int i = 0;i < n; i++) {
                if(i == 0) {
                    temp[i] = 0;
                }
                else if (a[i]!=0) {
                    temp[i] = 0;
                }
                else {
                    temp[i] = maxi;
                }
            }
            for(int i = 0; i < n; i++) {
                if(a[i] == 1) {
                    high = i;
                }
                if(high != -1) {
                    if(a[i] == 0) {
                        temp[i] = temp[Math.min(i-high, temp[i])];
                    }
                }
            }
            for(int i = n -1; i >= 0; i--) {
                if(a[i] == 2) {
                    low =i;
                }
                if(low != -1) {
                    if(a[i] == 0) {
                        temp[i] = temp[Math.min(low - i, temp[i])];

                    }
                }
            }
            for(int i = 0; i < m; i++) {
             int j = b[i] -1;
             if(temp[j] != maxi) {
                 System.out.println(temp[j] + "");
             }
             else {
                 System.out.println(-1 + "");
             }
            }



        }

    }
}
