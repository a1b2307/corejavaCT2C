package MyPrograms;
                              //method overriding
class Bank {
	int getRateOfInterest()
	{
		return 0;
	}

}
class SBI extends Bank{
	int getRateOfInterest()
	{
		return 8;
	}
}
class ICICI extends Bank{
	int getRateOfInterest()
	{
		return 7;
	}
}
class Axis extends Bank{
	int getRateOfInterest()
	{
		return 9;
	}
}
class MOR
{
	public static void main(String ars[]) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		Axis a=new Axis();
		System.out.println("SBI Raterest is "+s.getRateOfInterest());
		System.out.println("ICICI Raterest is "+i.getRateOfInterest());
		System.out.println("Axis Raterest is "+a.getRateOfInterest());
		
	}
}