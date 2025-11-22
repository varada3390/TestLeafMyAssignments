package week2.day1;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book Added Successfully");
		return bookTitle;
		
	}
	
	public void issueBook() { 
		System.out.println("Book Issued Successfully");
		
	}

	public static void main(String[] args) {

		Library library = new Library();
		library.addBook("Book Title is TestLeaf Notes");
		library.issueBook();
	}

}
