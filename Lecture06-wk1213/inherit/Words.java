class Words {

  public static void main (String[] args) {

      Dictionary webster = new Dictionary ();

      webster.page_message();
      webster.definition_message();   

   }  // method main

}  // class Words

//Class Book
class Book {

   protected int pages = 1500;

   public void page_message () {

      System.out.println ("Number of pages: " + pages);

   }  // method page_message

}  // class Book

class Dictionary extends Book {

   private int definitions = 52500;

   public void definition_message () {

      System.out.println ("Number of definitions: " + definitions);
      System.out.println ("Definitions per page: " + definitions/pages);

   }  // method definition_message

}  // class Dictionary

