import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        int percentage;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter your name: ");
        String n = s.nextLine();
        System.out.println("enter marks of subj1: ");
        int n1 = s.nextInt();
        System.out.println("enter marks of subj2: ");
        int n2 = s.nextInt();
        System.out.println("enter marks of subj3: ");
        int n3 = s.nextInt();
        int total = n1+n2+n3;
        System.out.println("name: "+n+"\n total = " + total);




    }


}
