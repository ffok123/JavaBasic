class Rabbit {
		int age;
		char sex;
		int speed;
		
		public void run(String name, boolean running, int min ){ 
			if(running && min>0)
				System.out.println(name+ " can run for "+min+ " minutes");
			else
				System.out.println(name+ " cannot run!");
		} 
		
		public void sleep(String name, int min){ 
			if(min>0)
				System.out.println(name+ " can sleep for "+min+ " minutes");
			else
				System.out.println("invalid input"); 
		}
		public Rabbit() {}
				
		/*public Rabbit(int age, char sex, int speed){ 
			this.age=age;
			this.sex=sex;
			this.speed=speed;
		}*/
		
}
public class TestRabbit {
   public static void main( String args[] )
   {
			/*Rabbit bunny; // bunny is null now
			bunny = new Rabbit(10,'M',500);
			System.out.println("The age is "+bunny.age);
			System.out.println("The sex is "+bunny.sex);
			System.out.println("The speed is "+bunny.speed);
			*/
			Rabbit bug01 = new Rabbit();
			System.out.println("The age is "+bug01.age);
			System.out.println("The sex is "+bug01.sex);
			System.out.println("The speed is "+bug01.speed);
			bug01.run("bug01",true, 3); // bunny can run for 3 minutes
			bug01.sleep("bug01", 5); // bugs sleeps for 5 minutes
			
	 }
}	 
	 