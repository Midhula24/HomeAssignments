package homeAssignments.week3.day1.listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMissingElement {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> list1 = new ArrayList<Integer>();
		for (int a : array1) {
			list1.add(a);
		}
		Collections.sort(list1);
		 System.out.println("Missing numbers in the sequence:");
	        for (int i = 0; i < list1.size() - 1; i++) {
	            if ((list1.get(i + 1) - list1.get(i)) > 1) {
	                for (int j = list1.get(i) + 1; j < list1.get(i + 1); j++) {
	                    System.out.println(j);
	                }
	            }
	        }
	}

}
