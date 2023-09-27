public class Dinner {

   public static void main (String[] args) {

      Pepperoni slice = new Pepperoni();

      System.out.println (slice.slogan());

   }  // method main

}  // class Dinner


abstract class Food {
   abstract public String slogan();

}  // class Food


class Pepperoni extends Food {
   public String slogan() {
      return "It is great to have pizza!";
   }  // method slogan

}  // class Pepperoni


