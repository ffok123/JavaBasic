public class Morph1 {
	public static void main(String args[]) {
		
		Student s[] = new Student[2];
	
	s[0] = new CIT_Student(1001, "Chan Tai Man");
	s[1] = new Logistics_Student(1002, "Wong Tai Mui");
	
	for (int x=0; x<s.length; x++) {
		System.out.print("Subject name of Student " + 
						s[x].getId());
		System.out.println(" = \t"+ s[x].getSubjName());
	}
	}
}
