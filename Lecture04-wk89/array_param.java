// Passing arrays to method
public class array_param {

	public static void main (String args[]) {
	short s[] = {1, 2, 3};
	int p = 18;

	System.out.println("Before calling triple:");
	System.out.println("\tp = " + p);
	System.out.print("\ts = ");
	for (int i=0; i < s.length; i++)
		System.out.print(s[i]+" ");

	triple(p, s);

	System.out.println("\nAfter calling triple:");
	System.out.println("\tp = " + p);
	System.out.print("\ts = ");
	for (int i=0; i < s.length; i++)
		System.out.print(s[i]+" ");
	}

	public static void triple(int i, short a[]) {
		i *= 3;
		for (int m=0; m < a.length; m++) 
			a[m] *= 3;
	}
}