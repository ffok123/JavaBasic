//Example 2

class A{
	int i;
}

class B extends A {
	int i;  // this i hide the one(i) in superclass A
	public B (int a , int b) {
	super.i=a;  //i in A
	this.i=b;   //i in A
	}
	public void show(){
	System.out.println("i in superclass is: " + super.i);
	System.out.println("i in subclass is: " + this.i);
	}
	
}

public class InherTest {
	public static void main(String args[]) {
		B subobj = new B(10,20);
		subobj.show();
	}
}
