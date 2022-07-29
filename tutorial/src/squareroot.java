// square root of number (tutorial number 5)

import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num = sc.nextInt();
        System.out.println("entered number is: " + num);
        double temp;
        double sq = num/2;

        do {
            temp = sq;
            sq = (temp+(num/temp))/2;
        }
        while((temp-sq)!=0);

        System.out.println("square root of a number is " +sq);
    }

}
