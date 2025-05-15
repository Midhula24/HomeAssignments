package homeAssignments.week3.day1.listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStringSorting {

	public static void main(String[] args) {
		String[] array1 =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> list1 = new ArrayList<String>();
		for (String a : array1) {
			list1.add(a);
		}
		Collections.sort(list1);
		System.out.println("After reverse sorting the given collection of strings : ");
		for (int i=list1.size()-1;i>=0;i--) {
			System.out.print(list1.get(i)+", ");
		}
	}

}
