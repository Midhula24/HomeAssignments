package homeAssignments.week2.day4.inheritance;

//Hybrid inheritance
//creating executable class-Elements that extends Button class
//created objects of all subclasses and accessed the methods (or) properties of its and its parent classes
public class Elements extends Button{
	public static void main(String[] args) {
		Elements elements = new Elements();
		TextField textField = new TextField();
		CheckBoxButton checkBoxButton = new CheckBoxButton();
		RadioButton radioButton = new  RadioButton();
		
		textField.click();
		textField.getText();
		textField.setText("Midhula");
		elements.submit();
		checkBoxButton.clickCheckButton();
		checkBoxButton.submit();
		radioButton.selectRadioButton();
		radioButton.submit();
	}
	
}
