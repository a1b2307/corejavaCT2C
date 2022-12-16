package Practice;

public class Student1 {
	int rollno;
	String name;
	String city;
   Student1(int rollno,String name,String city){
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
    public String toString() {                 
    	return rollno+"  "+name+"  "+city;
    }
	
	public static void main(String args[]) {
		Student1 s1=new Student1(10, "RajKumar","Tanuku");
		Student1 s2=new Student1(11, "Kiran","Marteru");
		Student1 s3=new Student1(12, "Karan","Bhimavaram");
		Student1 s4=new Student1(13, "Rakesh","Kavitam");
		Student1 s5=new Student1(14, "Sukumar","Ravulapalem");
		 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		
	}
	

}
