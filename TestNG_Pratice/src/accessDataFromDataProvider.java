import org.testng.annotations.Test;


public class accessDataFromDataProvider {
	

	@Test(priority=1,dataProviderClass=Data_Provider.class,dataProvider="CommonDataProvider")
	public void firstTest(String usrID,
						  String pwd,
						  String env){
		System.out.println("this is First Testcase");
	}
	
	
	@Test(priority=2,dataProviderClass=Data_Provider.class,dataProvider="CommonDataProvider")
	public void secondTest(String userid,
							String passw){
		System.out.println("Second Test");
	}
}
