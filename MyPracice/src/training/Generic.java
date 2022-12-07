package training;

class GenericClass<T>{
	T data;
	public GenericClass(T data) {
		super();
		this.data=data;
	}
	public T getData() {
		return this.data=data;
	}
}
public class Generic {
	public static void main(String args[]) {
		GenericClass<Integer> obj=new GenericClass<Integer>(56775);
		System.out.println("The Value Of The Data Is "+obj.getData());
		
		
		GenericClass<String> obj1=new GenericClass<String>("Hello Java");
		System.out.println("The Value Of The Data Is "+obj1.getData());
		
		GenericClass<Float> obj2=new GenericClass<Float>(5345.78f);
		System.out.println("The Value Of The Data Is "+obj2.getData());
		
		
		
	}

}
