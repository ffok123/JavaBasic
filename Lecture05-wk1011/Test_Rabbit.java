class Rabbit {
		int age;
		char sex;
		int speed;
		
		public void run( ){ 
				
		} 
		
		public void sleep(){ 
				
		}
		
		public Rabbit(int age, char sex, int speed){ 
			this.age=age;
			this.sex=sex;
			this.speed=speed;
		}
		
}
public class Test_Rabbit 
{
   public static void main( String args[] )
   {
			
			Rabbit bunny = new Rabbit(10,'M',500);
			System.out.println("The age is "+bunny.age);
			System.out.println("The sex is "+bunny.sex);
			System.out.println("The speed is "+bunny.speed);
			
			
	 }
}	 
	 