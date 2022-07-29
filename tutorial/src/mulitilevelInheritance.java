public class mulitilevelInheritance {
    public static void main(String args[])
    {
        C objC= new C();
        objC.dispB();
        objC.dispA();
        objC.dispC();

    }
}
//existing
class A
{
    int a, b;
    A()
    {
        a=10;
        b=20;
        System.out.println("in Constructor A\n"+a+"\n"+b);
    }
    void dispA()
    {
        System.out.println("in Class A\n"+a+"\n"+b);
    }
}
class B extends A
{
    int x, y;
    B()
    {
        x=100;
        y=200;
        System.out.println("in Constructor B\n"+x+"\n"+y);
    }
    void dispB()
    {
        System.out.println("in Class B\n"+x+"\n"+y);
    }
}
class C extends B{
    int p,q;
    C(){
        p=55;
        q=66;
        // System.out.println("in Constructor c\n"+p+"\n"+q);
    }
    void dispC()
    {
        System.out.println("in Class c \n"+p+"\n"+q);
    }
}
