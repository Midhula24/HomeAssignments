package homeAssignments.week1.day3;

public class Library {
	
	//Method with input argument and a return value
	public String addBook(String bookTitle){
		System.out.println("Book added successfully!");
		return bookTitle;
	}
	
	//Method without input parameters and return value 
	public void issueBook() {
		System.out.println("Book issued successfully!");
	}

	//Main method
	public static void main(String[] args) {
		//Object creation for Library class
		Library library = new Library();
		
		//Calling addBook method and printing the o/p returned from the method
		System.out.println("The book added is : "+library.addBook("The Harry Potter"));
		
		//Calling issueBook method
		library.issueBook();
	}

}
