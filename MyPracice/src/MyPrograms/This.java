package MyPrograms;

public class This {
	int x=136;                        //global variable
	public void display() {
		int x=134;                         //local vaiable
		System.out.println(x);
		System.out.println(this.x);       //to access global variable
	}
	public static void main(String args[]) {
		This t=new This();
		t.display();
	}

}
