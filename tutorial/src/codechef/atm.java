package codechef;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int withdraw = sc.nextInt();
        double initialBalance = sc.nextDouble();
        if(withdraw % 5 == 0 && (withdraw + 0.50) <= initialBalance) {
            double currentBalance =  initialBalance - ((double) withdraw + 0.50);
            System.out.println(currentBalance);
        }
        else {
            System.out.println(initialBalance);
        }

    }

}


