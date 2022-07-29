package codechef.longChallengeJune;

import java.util.Scanner;

public class summerHeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        for(int i = 0; i < t; i++) {
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int Xa = sc.nextInt();
            int Xb = sc.nextInt();
            int ans = 0;
            ans += Xa/xa + Xb/xb;
            System.out.println(ans);

        }


    }
}
