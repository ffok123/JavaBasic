public class StrTest {
	public static void main(String args[]) {
		String s1="Java";
		String s2=s1;
		String s3="Java";
		
		String s4="ja";
		String s5=s4+"va";
		String s6="java";
	
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		
		System.out.println(s5==s6);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		System.out.println(s5.equals(s6));
		
	}
}