package classAndObject;

class Book{
	
	int bookid;
	String bookName;
	String author;
	
	public Book() {
		System.out.println("Non parameterized constructor...");
	}
	
	public Book(int bookId, String bookName) {
		
		System.out.println("This has two parameters");
		System.out.println("bookId: "+bookId);
		System.out.println("book name: "+bookName);
	}
	
	public Book(int bookId, String bookName, String author) {
		System.out.println("This has three parameters");
		System.out.println("bookId: "+bookId);
		System.out.println("book name: "+bookName);
		System.out.println("author: "+author);
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		
		Book b=new Book(1, "Lord of the Ring", "Tolkien");

	}

}
