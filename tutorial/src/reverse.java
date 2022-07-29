
import java.util.*;

class GFG {

    static void totalSum(int[] arr)
    {
        int sum = 0;
        for (int i = 0;
             i < arr.length; i++) {
            int count = 0;

            int rev = 0, num = arr[i];
            boolean f = false;
            while (num > 0) {
                while (num > 0 && !f
                        && num % 10 == 0) {
                    count++;
                    num = num / 10;
                }
                f = true;
                if (num > 0) {
                    rev = rev * 10
                            + num % 10;

                    num = num / 10;
                }
            }
            if (count > 0)
                rev = rev
                        * (int)Math.pow(10,
                        count);

            sum = sum + rev;
        }
        System.out.print(sum);
    }
    public static void
    main(String[] args)
    {
        int[] arr = { 7, 23, 32  };
        totalSum(arr);
    }
}
