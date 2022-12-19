package Collection;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>();
		al.add("Na Peru Surya Na Illu India");
		al.add("vedam");
		al.add("Varudu");
		al.add("Bhadrinath");
		al.add("Happy with karunakaran");
		al.add("Arya 2");
		System.out.println("***By Using For Loop***");
	   for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
	   }
	   System.out.println("***By Using Enhanced For Loop***");
	   for(String s:al) {
		     System.out.println(s);
		}
	   System.out.println("***By Using Iterator Interface***");
		ListIterator itr=al.listIterator();
		System.out.println("In forward Direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		System.out.println("In backwackward Direction");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
			
		}
		System.out.println("***By Using Lambad Expressio And forEach loop***");
		al.forEach(a->{
			System.out.println(a);
		});
	}

}
