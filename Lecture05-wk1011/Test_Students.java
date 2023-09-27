class Students {
	private int id;
	private float grade=90;
	private String name;
	private char certgrades[];

	public boolean promoteToNextYear() {
		return ((grade >= 40) ? true : false);
	}
	public void setID (int id) {
		this.id=id;
		
	}
	public void setGrade (float grade) {
		if (grade>=0)
		this.grade=grade;
		
	}
	public float getGrade () {
		return grade;
		
	}
	public int getID () {
		return id;
		
	}
	public String getName() {
		return name;
		
	}
	//constructor1
	public Students () {	
		name = "unknown";
		certgrades = new char[5];
	}
	//constructor2
	public Students (String newName) {
		name = newName;
		certgrades = new char[5];
	}

	//constructor3
	public Students (int newId, String newName) {
		id = newId;
		name = newName;
		certgrades = new char[5];
	}

	//constructor4
	public Students (int newId, String newName, int gradesCount) {
		id = newId;
		name = newName;
		certgrades = new char[gradesCount];
	}

}

public class Test_Students {
	public static void main (String args[] ) {
		/*Students s;		// reference to an object
		s = new Students();	
		s.setID(12345);	
		s.setGrade(99.5f);	
				
		Students s1 = new Students();	
		s1.setID(52525);	
		s1.setGrade(99.0f);	
		
		Students s2 = new Students();	
		s2.setID(54321);	
		s2.setGrade(90.5f);	
		*/
		Students[] s=new Students[4];
		s[0] = new Students();
		s[1] = new Students("Mary Ma");
		s[2] = new Students(1002, "Larry Lau");
		s[3] = new Students(1003,"Florence Fok", 12);
		/*
		System.out.print("Student " + s.getID());
		if (s.promoteToNextYear())
			System.out.println(" will be promoted.");
		else
			System.out.println(" will repeat.");
			
			System.out.print("Student " + s1.getID());
		if (s.promoteToNextYear())
			System.out.println(" will be promoted.");
		else
			System.out.println(" will repeat.");
			
					System.out.print("Student " + s2.getID());
		if (s.promoteToNextYear())
			System.out.println(" will be promoted.");
		else
			System.out.println(" will repeat.");		
		*/
		for (int i=0; i<s.length; i++) {	
		System.out.print("Student " + s[i].getName() + " with " + s[i].getID());
		if (s[i].promoteToNextYear())
			System.out.println(" will be promoted.");
		else
			System.out.println(" will repeat.");
		}	
		
	}
}
