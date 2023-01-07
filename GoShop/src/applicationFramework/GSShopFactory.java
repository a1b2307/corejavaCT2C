package applicationFramework;

import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class GSShopFactory implements ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsp=new GSPrimeAcc(accNo,accNm,charges, isPrime);
		return gsp;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String AccNm, float charges, float deliverycharge) {
		GSNormalAcc gsn=new GSNormalAcc(accNo, AccNm, deliverycharge, deliverycharge);
		return gsn;
	}
	
	

}
