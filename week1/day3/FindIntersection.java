package homeAssignments.week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
		// Step 1 : Initializing array1 and array2
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7,7};
		
		// Step 2 : Declaring a for loop to iterate through array1
		for(int i=0;i<array1.length;i++) {
			
			// Step 3 : Declaring a nested for loop to iterate through array2
			for(int j=0;j<array2.length;j++) {
				
				//Step 4 : Comparing the arrays using conditional statement(if)
				if(array1[i]==array2[j]) {
					
					//Step 5 : Print the value of array1 if a match found
					System.out.println("Match found for : "+array1[i]);
					
					//Step 6 : Breaking the current loop if a match is found
					break;
				}
			}
		}
	}
}
