package training;
import java.util.Scanner;
import java.util.Scanner;
interface Operator{
	public void operate(int num);
}

public class Lambda {
	public static void main(String args[]) {
		int n;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Operator op=num->System.out.println("Increasing the number by 2:"+(num+2));
		op.operate(n); 
	}



}
