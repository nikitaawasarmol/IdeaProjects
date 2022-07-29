package codechef;

import java.util.Scanner;

public class enormousInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        for (int i = 1; i < N; i++) {
            int num = sc.nextInt();
            if ( num % K == 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
