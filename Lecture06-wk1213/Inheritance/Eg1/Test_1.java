public class Test_1 {
	public static void main(String args[]) {
	CIT_Student cit = new CIT_Student(1001, 
			"Chan Tai Man");
	cit.setCIT_grade(99.9f); 	// subclass member
	cit.setYear(2);				// inherited method
	System.out.println("CIT Student info: ");
	System.out.println("id: \t"+ cit.getId());
	System.out.println("name: \t"+ cit.getName());
	System.out.println("year: \t"+ cit.getYear());
	System.out.println("CIT: \t"+ cit.getCIT_grade());
	//System.out.println(cit.toString()); // Object method
	}
}
