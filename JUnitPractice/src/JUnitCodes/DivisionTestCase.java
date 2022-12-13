package JUnitCodes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class DivisionTestCase {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("In beforeClass method.");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("In afterClass method.");
	}
	@Before
	public void before() {
		System.out.println("In before method.");
	}
	@After
	public void after() {
		System.out.println("In after method.");
	}
	@Test
	public void testCase1() {
		System.out.println("In testcase1.");
	}
	@Test
	public void testCase2() {
		System.out.println("In testcase2.");
	}
	@Ignore
	@Test
	public void testCase3() {
		System.out.println("In testcase3.");
		
	}
	
	



}
