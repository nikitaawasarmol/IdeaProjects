class Expression
{
    public static void op()
    {
        int a=10, b=5;

        System.out.println((a << 2) + (b >> 2));
        System.out.println(b>0);
        System.out.println((a+b*100)/10);
        System.out.println(a & b);

    }
    public static void main(String args[])
    {

        Expression.op();
    }
}
