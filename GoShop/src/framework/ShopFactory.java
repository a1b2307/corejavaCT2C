package framework;

public interface ShopFactory {
	
	public abstract PrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int accNo,String AccNm,float charges,float deliverycharge);
	

}
