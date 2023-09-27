import javax.swing.*; 
class Book {

	//instance variables
	private String bookName;
	private int price;
	
	// constructor to initialize instance variables
	public Book(String name, int amt){
			bookName=name;
	   	price=amt;
	}
	   
	public void displayMessage(){
		System.out.println( "Welcome to the my Book!" );
	} 
	
	public String getBookName(){
		return bookName;
	}
	
	public int getPrice(){
		return price;
	}
	   
	public void setBook(String name, int amt) throws NumberFormatException{
	   	if(amt<0) throw new NumberFormatException();
	   	
	   	bookName=name;
	   	price=amt;
	}
	   
} // end class 


public class BookCombine {
	public static void main(String args[]){ 
		try{
				Book myBook = new Book("Java 123",100);
				myBook.displayMessage();
				System.out.println();
				
			  System.out.println(myBook.getBookName());
			  System.out.println(myBook.getPrice());
			        
			  myBook.setBook("Java",102);
			  System.out.println(myBook.getBookName());
			  System.out.println(myBook.getPrice());
		}//end try

		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null ,"Please input a valid integer",
			"Number Format Error", JOptionPane.ERROR_MESSAGE );
		}//end catch
	} // end main
} // end class 