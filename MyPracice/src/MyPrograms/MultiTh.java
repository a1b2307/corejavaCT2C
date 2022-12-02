package MyPrograms;

public class MultiTh implements Runnable {
	String name;
	MultiTh(String name1){
		name=name1;
	}
	public void run()
	{
		for(int i=0;i<=10;i++) {
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(name+":"+i);
		}
	}
	public static void main(String args[]) {
		MultiTh m1=new MultiTh("Thread1");
		MultiTh m2=new MultiTh("Thread2");
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		t1.start();
		t2.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("main"+i);
		}
	}
	
	

}
