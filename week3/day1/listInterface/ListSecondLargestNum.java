package homeAssignments.week3.day1.listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSecondLargestNum {

	public static void main(String[] args) {
		int[] array1 = {3, 2, 11, 4, 6, 7};
		List<Integer> list1 = new ArrayList<Integer>();
		for (int a : array1) {
			list1.add(a);
		}
		
		Collections.sort(list1);
		System.out.println("The second largest number is : "+list1.get((list1.size())-2));
	}

}
