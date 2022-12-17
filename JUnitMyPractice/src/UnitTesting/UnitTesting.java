package UnitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTesting {
	int Square(int x) {
		return x*x;
	}
	@Test
	public void TestUnit() {
		
		UnitTesting obj=new UnitTesting();
		int output=obj.Square(5);
		assertEquals(25,output);
	}

}
