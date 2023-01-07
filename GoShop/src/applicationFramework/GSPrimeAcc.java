package applicationFramework;

import framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	private float charges=0;
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	
	}
	
	public void bookProduct(float charges) {
		System.out.println("Dear Prime User, Your Product charges Are "+charges);
		
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [charges=" + charges + "]";
	}
	

	
	
	
	
	
	
	

}
