package MyPrograms;

public class MOL {                       //Method Overloading
	void sum(int a,int b)            //Method with int parameter type
	{
		System.out.println("The Sum Of The Parameters Is"+(a+b));
	}
	void sum(float a,float b)           //Method with float parameter type
	{
		System.out.println("The Sum Of The Parameters Is"+(a+b));
	}
	public static void main(String args[])
	{
		MOL m=new MOL();
		m.sum(6987,4540);
		m.sum(45.8f,567.6f);
	}

}
