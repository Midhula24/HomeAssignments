package homeAssignments.week2.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		//declaring the string
		String test = "I am a software tester";
		 
		//splitting the sentence to array of words
		String[] words = test.split(" ");
		 
		System.out.println("The modified String is :");
		 
		//first for loop to iterate through the words
		for(int i=0;i<words.length;i++) {
			
			//checking for odd index
			if(i%2!=0) {
				 
				 //converting the word to character array
				 char[] characters = words[i].toCharArray();
				 
				 //traversing from last index of the character array to reverse the string
				 for(int j=characters.length-1;j>=0;j--) {
					 System.out.print(characters[j]);
				 }
			 }
			 //printing the string as it is incase of even index
			 else {
				 System.out.print(words[i]);
			 }
			 //printing a space after each word
			 System.out.print(" ");
		 }

	}

}
