package homeAssignments.week2.day4.polymorphism;

//method overriding
//child class extending baseclass-BasePage
public class LoginPage extends BasePage{

	//Overridden method
	@Override
	public void performCommonTasks(String username, String password) {
		
		//calling the parent class method using super keyword
		super.performCommonTasks(username, password);
		System.out.println("Inside child class...");
		System.out.println("Username : "+username+" and Password : "+password);
	}
	public static void main(String[] args) {
		LoginPage loginPage = new LoginPage();
		loginPage.findElement();
		loginPage.clickElement();
		loginPage.enterText("Testleaf");
		loginPage.performCommonTasks("Midhula", "testleaf@111");
		//BasePage basePage = new BasePage();
		//basePage.performCommonTasks("Midhula", "testleaf@111");
	}

}
