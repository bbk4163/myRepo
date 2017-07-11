import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;


public class AssertionTest {

	
	@Test(priority=1)
	public void testLogin(){
		
		String var1="Hi Hello";
		String var2="Hi Hellow";
		
		System.out.println("Before Comparing from testLogin Method");
		//Assert.assertEquals(var1, var2, "Not sure what to put here");
		Assert.assertEquals(var1, var2);
		System.out.println("After Comparing");
		
		
	}
	
	
	@Test(priority=2)
	public void verifyLogin(){
		
		//going to verify soft assertion 
		String var1="Hi Hello";
		String var2="Hi Hellow";
		SoftAssert softAssert = new SoftAssert();
		
		//softAssert.assertEquals(var1, var2);
		//System.out.println("Failed but want to check from verifyLogin");
		
		softAssert.fail("Failed by force");
		//softAssert.assertAll();
		//softAssert.fail();
		
		

		
	}
	
}
