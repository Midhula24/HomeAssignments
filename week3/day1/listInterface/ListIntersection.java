package homeAssignments.week3.day1.listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		int[] array1 = {3, 2, 11, 4, 6, 7};
		int[] array2 = {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		for (int a : array1) {
			list1.add(a);
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		for (int a : array2) {
			list2.add(a);
		}
		
		int count = 0;
		System.out.println("***** Printing common elements in the list ***** ");
		for (int a : list1) {
			if(list2.contains(a)) {
					System.out.print(a+" ");
					count++;
				}
			}
		if(count == 0) {
			System.out.println("No matching elements found!");
		}
	}

}
