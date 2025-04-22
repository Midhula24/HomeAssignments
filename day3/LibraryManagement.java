package homeAssignments.week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		//Object creation for Library class from LibraryManagement class
		Library library = new Library();
				
		//Calling addBook method of Library class and printing the o/p returned from the method 
		System.out.println("The book added is : "+library.addBook("Ponniyin Selvan"));
				
		//Calling issueBook method of Library class
		library.issueBook();

	}

}
