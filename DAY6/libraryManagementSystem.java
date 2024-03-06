import java.util.*;

class Book{
	public int bookId;
	public String title = new String();
	public String author = new String();
	public boolean isAvailable;

	Book(){
		bookId = 201;
		title = "Java Programming";
		author = "John Deo";
		isAvailable = true;	
	}

	public void borrowBook(int bookId){
		if(this.bookId == bookId && isAvailable){
			System.out.println("Book borrowed successfully!");
			isAvailable = false;
		}
		else{
			System.out.println("Sorry at this moment no books are available.");
		}
		
	}

	public void returnBook(int bookId){
		if(!isAvailable && this.bookId == bookId){
			System.out.println("Book returned successfully!");
			isAvailable = true;
		}
		else{
			System.out.println("Invalid BookId.");
		}
		
	}

	public void displayAvailableBooks(){
		if(isAvailable){
			System.out.println("Book ID: " + bookId + ", Title: " + title + " ,Author: " + author);
		}
		else{
			System.out.println("Sorry at this moment no books are available.");
		}
	}
	
	public void displayBorrowedBooks(){
		if(!isAvailable){
			System.out.println("Book ID: " + bookId + ", Title: " + title + " ,Author: " + author);
		}
		else{
			System.out.println("No borrowed books.");
		}
	}	
}

class User extends Book{
	int userId;
	String name = new String();
	int bookBorrowed = 0;
	
	User(int userId, String name){
		this.userId = userId;
		this.name = name;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		User userObj = new User(101, "Sahil");

		System.out.println("Welcome to the Virtual Library Management System!");
		System.out.println("-------------------------------------------------");
		System.out.println("1. Borrow a Book.");
		System.out.println("2. Return a Book.");
		System.out.println("3. Display Available Book.");
		System.out.println("4. Display Borrowed Book.");
		System.out.println("5. Exit.");
		System.out.println("-------------------------------------------------");
		System.out.print("Enter your Choice: ");
		int choice = sc.nextInt();

		while(choice != 5){
			switch(choice){
				case 1:
					System.out.println("Enter your user ID: ");
					int userId = sc.nextInt();
					System.out.println("Enter the book ID you want to borrow: ");
					int bookId = sc.nextInt();
					userObj.borrowBook(bookId);
					break;
				case 2:
					System.out.println("Enter your user ID: ");
					userId = sc.nextInt();
					System.out.println("Enter the book ID you want to borrow: ");
					bookId = sc.nextInt();
					userObj.returnBook(bookId);
					break;
				case 3:
					System.out.println("Available Books:");
					userObj.displayAvailableBooks();
					break;
				case 4:
					System.out.println("Borrowed Books:");
					userObj.displayBorrowedBooks();
					break;
				default:
					System.out.println("Invalid Choice Entered.");
					break;
			}
			System.out.println("-------------------------------------------------");
			System.out.print("Enter your Choice: ");
			choice = sc.nextInt();
		}
		System.out.println("Exiting Virtual Library Management System. Thank you!");
		
	}
}