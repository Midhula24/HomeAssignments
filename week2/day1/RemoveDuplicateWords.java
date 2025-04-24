package homeAssignments.week2.day1;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		
		//declaring the string
		String text = "We learn Java basics as part of java sessions in java week1";
		
		//splitting the sentence to array of words
		String[] words = text.split(" ");
		
		//initializing the count variable
		int count = 0;
		
		//first for loop to iterate through the words
		for(int i=0;i<words.length;i++) {
			
			//second for loop to iterate through the words for comparing
			for(int j=i+1;j<words.length;j++) {
				
				//checking for a match
				if(words[i].equalsIgnoreCase(words[j])) {
					
					//replacing the matched word with empty string
					words[j] = "";
					
					//incrementing the count to ensure duplicates found
					count++;
				}
			}
		}
		//checking if count is incremented
		if(count>0) {
			
			//printing the modified string
			System.out.println("The modified String is : ");
			for (String string : words) {
				System.out.print(string+" ");
			}
		}
		//printing the original string if no duplicates found
		else {
			System.out.println("No duplicates found and the original string is :\n"+text);
		}
	}

}
