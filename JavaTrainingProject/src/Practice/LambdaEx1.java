package Practice;
interface Calculator{
	int cal(int a,int b);
}

public class LambdaEx1 {
	public static void main(String args[]) {
		Calculator A=(a,b)->(a+b);
		System.out.println(A.cal(200,100));
		
		Calculator S=(a,b)->(a-b);
		System.out.println(S.cal(200,100));
		
		Calculator M=(a,b)->(a*b);
		System.out.println(M.cal(200,100));
		
		Calculator D=(a,b)->(a/b);
		System.out.println(D.cal(200,100));
		
		Calculator R=(a,b)->(a%b);
		System.out.println(R.cal(200,196));
		
	}

}
