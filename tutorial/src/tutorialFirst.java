public class tutorialFirst {

    public static void main(String args[])
    {
        int X, Y, Z, num = 22;

        // precedence
        X = 7 + 3*6/2 - 1;
        Y = 2 % 2 + 2*2 - 2/2;
        Z = (3*9*(3+(9*3/(3))));
        System.out.println("X="+X);
        System.out.println("Y="+Y);
        System.out.println("Z="+Z);
        System.out.println( );

       // operators
        System.out.println(++num);
        System.out.println(num++);
        System.out.println(--num);
        System.out.println(num--);

    }
}
