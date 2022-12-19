package Practice;

class Parent{
	String name="Hi";
}
class Child extends Parent{
	String name="Hello";
	void display() {
		String name="WelCome";
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println(name);
		
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();
		ch.display();

	}

}
