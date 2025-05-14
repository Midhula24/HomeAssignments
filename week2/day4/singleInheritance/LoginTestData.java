package homeAssignments.week2.day4.singleInheritance;

//Single inheritance
//Subclass with 2 methods
public class LoginTestData extends TestData{
	public void enterUsername(String username) {
		System.out.println("Username is : "+username);
	}
	public void enterPassword(String password) {
		System.out.println("Password is : "+password);
	}
	public static void main(String[] args) {
		//Creating object for subclass and calling both parent and child class methods
		LoginTestData loginTestData = new LoginTestData();
		loginTestData.enterCredentials();
		loginTestData.enterUsername("Midhula");
		loginTestData.enterPassword("testleaf@111");
		loginTestData.navigateToHomePage();
	}
}
