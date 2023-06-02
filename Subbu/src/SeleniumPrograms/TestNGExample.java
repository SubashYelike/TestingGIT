package SeleniumPrograms;

import org.testng.annotations.*;

public class TestNGExample {

	@BeforeSuite
	public void BS() {
		System.out.println("This is Before Suite");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("This is Before Test");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("This is Before Class");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("This is Before Method");
	}
	
	@Test
	public void Test() {
		System.out.println("Hi I am Subash");

	}
	
	@AfterMethod
	public void AM() {
		System.out.println("This is After Method");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("This is After Class");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("This is After Test");
	}
	

}
