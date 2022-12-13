package training;
 
class Syn implements Runnable{
	int count;
	public synchronized void run() {
		for(int i=1;i<=10000;i++) {
			count++;
		}
	}
}

public class Thsyn {
	public static void main(String args[]) {
		Syn s=new Syn();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(s.count);
		
	}
	
	

}
