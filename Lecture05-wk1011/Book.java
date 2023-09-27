/*
 * BookCombine1.java
 *
 * Created on 2005 Oct 4, 5:00pm
 */
 
import javax.swing.*;
 
/**
 * BookCombine1 class. This is the main application for Javadoc exercise
 * @author  Florence
 * @version 1
 */

public class Book {

	//declare instance variables
	private String bookName;
	private int price;
	
	/**
 	* Book constructor which receive two variables
 	* @param name 	The name of the book
 	* @param amt		The price of the book
 	*/
	public Book(String name, int amt){
			bookName=name;
	   	price=amt;
	}//end Book constructor
	
	/**
 	* public method displayMessage() which displays welcome message
  */   
	public void displayMessage(){
		System.out.println( "Welcome to the my Book!" );
	} //end method displayMessage  

	/**
 	* public method getPrice() which returns the price of the book
 	* @return bookName 	The name of the book
  */	
	public String getBookName(){
		return bookName;
	} //end method getBookName 
	
	/**
 	* public method getPrice() which returns the price of the book
 	* @return an <code>integer</code> 	The price of the book
  */
	public int getPrice(){
		return price;
	}//end method getPrice 
	
	/**
 	* public method setBook() which receives two variables
 	* @param name 	The name of the book
 	* @param amt		The price of the book
 	* @throws NumberFormatException			In case of invalid price
 	*/   
	public void setBook(String name, int amt) throws NumberFormatException{
	   	if(amt<0) throw new NumberFormatException();
	   	
	   	bookName=name;
	   	price=amt;
	}//end method setBook 
	   
} // end Book class 
