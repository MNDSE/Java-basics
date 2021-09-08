package codebro;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Scanner5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// doing the same thing using scanner
		
	//	double x;
	//	double y;
	//	double z;
		
	//	Scanner scanner = new Scanner(System.in);
		
	//System.out.println("Enter side x: ");
	//double x= scanner.nextDouble();
		
	//System.out.println("Enter side y: ");
	// double y= scanner.nextDouble();
	
	//double z = Math.sqrt((x*x) +(y*y));
	//System.out.println("The hypotenuse is : "+z);
		

// doing the same thing using GUI
	
	int x =Integer.parseInt (JOptionPane.showInputDialog("Enter the side x: "));
	JOptionPane.showMessageDialog(null," x is:"+x);
		
	int y =Integer.parseInt (JOptionPane.showInputDialog("Enter the side y: "));
	JOptionPane.showMessageDialog(null," y is:"+y);
	
	 JOptionPane.showMessageDialog(null,"press okey ");
	
	int height1 = Math.max(x, y);
	JOptionPane.showMessageDialog(null," the height is: "+height1);
	
int height11 =20;

int height111 = Integer.parseInt(JOptionPane.showInputDialog("enter height"));
	
	if(height111>=20) {
		
		JOptionPane.showMessageDialog(null, "good");
	}
	
}
}