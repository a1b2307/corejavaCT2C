package shopmain;

import applicationFramework.GSNormalAcc;
import applicationFramework.GSPrimeAcc;
import applicationFramework.GSShopFactory;

public class ShopMain {
	
	public static void main(String args[]) {
		GSShopFactory gsfactory=new GSShopFactory();
		//gsfactory.getNewPrimeAccount(101,"mahesh",6784,true);
		//gsfactory.getNewNormalAcc(102,"sairam", 75689,50);
		
		GSPrimeAcc gsprime=new GSPrimeAcc(101,"mahesh",6784,true);
		gsprime.bookProduct(6784);
		
		GSNormalAcc gsnormal=new GSNormalAcc(102,"sairam",75689,50);
		gsnormal.bookProduct(75689);
		
		
		gsprime.toString();
		gsnormal.toString();
	}
	


}
