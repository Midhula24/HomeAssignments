package homeAssignments.week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		//Declaring an integer array
		int[] array1 = {1,4,3,2,8,6,7};
		
		//Sort the array
		Arrays.sort(array1);
		
		//for loop to iterate through the array
		for(int i=0;i<=array1.length;i++) {
			
			//Condition to check if the element is missing
			//this if block checks if the next element is present. If so, skip this iteration
			if(i+1<array1.length && array1[i+1]-array1[i]==1) {
				continue;
			}
			
			//this else if block checks if the iteration reached the last element and break the loop
			//because there is no need to check the next number of the last element
			else if(i+1 >= array1.length) {
				break;
			}
			
			//this else block contains the print statement to print if there is any missing element
			else {
				System.out.println("Element "+(array1[i]+1)+" is missing");
			}
		}

	}

}
