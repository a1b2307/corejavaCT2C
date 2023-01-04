package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		int n;
		System.out.println("enter the size of arrayList:");
		n=s.nextInt();
		
		System.out.println("enter the elements;");
		for(int i=0;i<=n;i++) {
			al.add(s.nextLine());
		}
		
		System.out.println("The Lis Is:");
		for(String value:al) {
			System.out.println(value);
		}
		
		
	}

}
