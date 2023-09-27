//determine the output
public class StrTest1{

		public static void main(String args[]){
		String x = "LN CIT", y;
		y = x;
		System.out.println( " x == y is " + (x == y) );
		String z = new String("LN CIT");
		
		System.out.println( " x == z is " + (x == z) );
		System.out.println( " x.equals(z) is " + x.equals(z));

		System.out.println( " x.length() is " + x.length());
		System.out.println( " charAt(1) of " + x + " is " + x.charAt(1));

		z+=" student";
		System.out.println(z);
		
		System.out.println(z.toLowerCase());
		System.out.println(z.toUpperCase());
		System.out.println(z.substring(0,4));
	}//end class
}
