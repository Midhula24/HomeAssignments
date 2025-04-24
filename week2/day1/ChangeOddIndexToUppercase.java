package homeAssignments.week2.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		//Declaring the string
		String test = "changeme";
		
		//converting string to char array
		char[] array = test.toCharArray();
		
		//for loop to iterate through the array
		for(int i=0;i<array.length;i++) {
			
			//checking for odd index
			if(i%2!=0) {
				
				//changing the lowercase letter to uppercase letter
				array[i] = Character.toUpperCase(array[i]);
			}
		}
		//printing the string after modifications
		System.out.println("The string after converting is : "+new String(array));

	}

}
