class Eating {
     public static void main (String[] args) {
      Pizza special = new Pizza (275);
      System.out.println ("Calories per serving: " + special.calories_per_serving());
   }  // method main
}  // class Eating

class Food {
   final private int CALORIES_PER_GRAM = 9;
   private int fat;
   protected int servings;

   public Food (int num_fat_grams, int num_servings) {
      fat = num_fat_grams;
      servings = num_servings;
   }  // constructor Food

   private int calories() {
      return fat * CALORIES_PER_GRAM;
   }  // method calories

   public int calories_per_serving() {
      return (calories() / servings);
   }  // method calories_per_serving
}  // class Food

//Pizza Class
class Pizza extends Food {
   public Pizza (int amount_fat) {
      super (amount_fat, 8);
   }  // constructor Pizza
}  // class Pizza

