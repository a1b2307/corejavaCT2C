package applicationFramework;

import framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		
	}
	
    public void bookProduct(float charges) {
    	
    	System.out.println("Dear Normal User,Your Charges are "+charges+" with "+deliveryCharge);
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc []";
	}
	
    
	

}
