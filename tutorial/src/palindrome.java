import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter: ");
        String s = sc.next();
        System.out.println("entered string is: "+ s);

        if (isPalindrome(s))
            System.out.println("String is palindrome");
        else
            System.out.println("not a palindrome");
    }
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
