import javax.swing.JOptionPane;

public class ClassEx{
	public static void main(String args[]){
		//declare variables;
		double radius=0.0;
		String strRadius;
		double volume;
		
		strRadius=JOptionPane.showInputDialog("Enter the radius in double");
		
		// convert string to double
		radius=Double.parseDouble(strRadius);
		
		//Call method calSphereVol
		volume=calSphereVol(radius);
		
		System.out.println("The final vol is " + volume );
		
	}//end main
	
	public static double calSphereVol(double r){
		double vol;
		vol=(4.0/3.0) * Math.PI* Math.pow(r,3);
		vol=Math.floor(vol*100.0+0.5)/100.0;
		return vol;

	}// end calSphereVol



}//end class