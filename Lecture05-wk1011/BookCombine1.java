public class BookCombine1 {
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