public class hierarchicalInheritance {
    public static void main(String args[]) {
        R objC = new R();
        P objp = new P();
        Q objq = new Q();
        objp.dispA();
        objq.dispB();
        objC.dispR();

    }
}
//existing
class P
{
    int a, b;
    P()
    {
        a = 10;
        b = 20;
        System.out.println("in Constructor P \n" + a + "\n" + b);
    }
    void dispA()
    {
        System.out.println("in Class P \n" + a + "\n" + b);
    }
}
class Q extends P
{
    int x, y;
    Q()
    {
        x = 100;
        y = 200;
        System.out.println("in Constructor Q\n" + x + "\n" + y);
    }
    void dispB()
    {
        System.out.println("in Class Q\n" + x + "\n" + y);
    }
}
class R extends P{
    int p, q;
    R(){
        p = 55;
        q = 66;
        System.out.println("in Constructor R \n" + p + "\n" + q);
    }
    void dispR()
    {
        System.out.println("in Class R \n" + p + "\n" + q);
    }
}

