public class sayNameAndAge {

public static void main (String args[]) {
	String s;
	Short i;
	s = args[0]; 
        i = Short.parseShort(args[1]);
	sayNameAndAge(s, i); //i is promoted to integer
	}

public static void sayNameAndAge(String name, int age) {
	System.out.println("My name is " + name);
	System.out.println("I am " + age + " years old.");
	}
}