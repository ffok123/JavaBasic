// Print the length of arrays
public class array_length {
	static char c[] = new char[5];
	static long l[] = new long[10];
	static int n[] = {10000,20000,30000,40000,
			50000,60000,70000,80000};
	static short s[] = {1, 2, 3};

	public static void main (String args[]) {
	int i;
	i = c.length;
	System.out.println("The length of c[] is " + i);
	i = l.length;
	System.out.println("The length of l[] is " + i);
	i = n.length;
	System.out.println("The length of n[] is " + i);
	i = s.length;
	System.out.println("The length of s[] is " + i);
	}
}