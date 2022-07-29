import java.util.Scanner;

public class count {
    public static void main(String args[]) {
       int num = 0;
       int count = 0;
       int p = 0, n = 0, z = 0;
       Scanner input = new Scanner(System.in);

       while(count < 10 ) {
           System.out.println("enter number");
           num = input.nextInt();

           if (num > 0)
               p++;
           else if (num < 0)
               n++;
           else
               z++;
           count = count + 1;
       }
        System.out.println("positive entered: " + p);
        System.out.println("negative entered: "+ n);
        System.out.println("zero entered: "+ z);


    }
}
