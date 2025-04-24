package homeAssignments.week2.day1;

import java.util.Arrays;

public class StringAnagram {
	//Method to check if two strings are anagram
	public static boolean anagram(String word1, String word2) {
		
		//if condition to check if length of strings are equal
		if(word1.length() == word2.length()) {
			
			//Converting string to character array 
			char[] array1 = word1.toCharArray();
			char[] array2 = word2.toCharArray();
			
			//Sorting the character array
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			//Comparing the arrays and returning the result
			return Arrays.equals(array1, array2);
		}
		
		//this else block returns false if array length mismatches
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		//Declaring two strings
		String word1 = "stops";
		String word2 = "potss";
		
		//calling the anagram method and verifying the results
		if(anagram(word1,word2)) {
			System.out.println("The given strings are anagram!");
		}
		else {
			System.out.println("The strings are not anagram");
		}
	}

}
