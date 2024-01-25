package encapsulationPrograms;
/*
 * Encapsulation is the concept of binding the data members in a class.
 * 
 * In order to set values to the private variable we make setters.
 * Syntax of setter:-
 * public void setVariableName(variableDatatype variableName){
 * 	this.variableName=variableName;
 * 
 * In order to get the values of the private variables we make getters.
 * Syntax of getter:-
 * public variableDatatype getVariableName(){
 * 	return variableName;
 * }
 * }
 */

class Book{
	
	private int bookId;
	private String bookName;
	private String author;
	
	public void setBookId(int bookId) {
		
		this.bookId=bookId;
	}
	
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public int getBookId() {
		
		return bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		
		Book b=new Book();
		b.setBookId(101);
		b.setBookName("The Secret");
		b.setAuthor("Rhonda Byrne");
		
		
		System.out.println("Book name= "+b.getBookName());
		

	}

}
