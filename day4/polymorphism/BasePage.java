package homeAssignments.week2.day4.polymorphism;

//method overriding
//base class with 4 methods
public class BasePage {
	public void findElement() {
		System.out.println("Element found!");
	}
	public void clickElement() {
		System.out.println("Element clicked!");
	}
	public void enterText(String text) {
		System.out.println("Text entered is : "+text);
	}
	public void performCommonTasks(String username, String password) {
		System.out.println("Inside base class...");
		System.out.println("Username : "+username+" and Password : "+password);
	}
}
