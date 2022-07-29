/*
function overloading
overriding
interface
block initializer
final modifier*/
/* class polymorphism {


    polymorphism obj=new polymorphism();
    int m1=obj.multi(10,20);

    double m2=obj.multi(20.0, 30.0);
		System.out.println( m1+ "\n"+ m2);
    public static void main(String args[])
    {
        (m2);
    }
}
class polymorphism
{
    int multi(int a, int b)
    {
        return a*b;
    }

    double multi(double a, double b)
    {
        return a*b;
    }


}
// overriding

class Vehical
{
	void run()
	{
		System.out.println("Vehical is running");
	}
}
class Bike extends Vehical
{
	void run()
	{
		System.out.println("Bike is running");
	}
}
class Car extends Vehical
{
	void run()
	{
		System.out.println("Car is running");
	}
}
class FunOverride
{
	public static void main(String args[])
	{
		Vehical v;
		v=new Bike();
		v.run();
		v=new Car();
		v.run();

	}
}
// Interface
interface printable1
{
	void printmsg1();
}
interface printable2
{
	void printmsg2();
}
class A implements printable1, printable2
{
	public void printmsg1()
	{
		System.out.println("Hello1");
	}
	public void printmsg2()
	{
		System.out.println("Hello2");
	}
	public static void main(String args[])
	{
		A obja=new A();
		obja.printmsg1();
		obja.printmsg2();
	}
}


//block initilizer
class Salary
{
	double basic, hra, incentives;
	Salary(double a, double b)
	{
		basic=a; hra=b;
		double s=basic+basic*1.30+hra+incentives;
		System.out.println("Your salary is "+s+" Rs/month");
	}
	Salary(double a)
	{
		basic=a;
		double s=basic+incentives;
		System.out.println("Your consolidated salary is "+s+" Rs/month");
	}
	{
		incentives=2000;
	}
	public static void main(String args[])
	{
		Salary regular=new Salary(20000,6000);
		Salary consolidated=new Salary(35000);
	}
}
//final modifier
class Bike1
{
	final int speed=100;
	void run()
	{
		speed=200;
		System.out.println("in constructor\n Speed is:"+speed);
	}

	public static void main(String args[])
	{
		Bike1 b1=new Bike1();
		b1.run();
	}
}
*/