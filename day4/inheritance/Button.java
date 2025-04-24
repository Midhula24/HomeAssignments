package homeAssignments.week2.day4.inheritance;

//single inheritance, hierarchical inheritance
//Created subclass with one method and inheriting the properties of baseclass-WebElement
public class Button extends WebElement{
	public void submit() {
		System.out.println("Submitted successfully!!!");
		System.out.println("*****");
	}

}
