package codebro;

import javax.swing.JOptionPane;

public class Paneoption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name = JOptionPane.showInputDialog("What's your name");
	
		JOptionPane.showMessageDialog(null, " welcome on board ");	
	int age = Integer.parseInt( JOptionPane.showInputDialog("How old are you"));
			JOptionPane.showMessageDialog(null,"your are "+age+" years old ");
	double height = Double.parseDouble( JOptionPane.showInputDialog("what's your hieght"));
	JOptionPane.showMessageDialog(null,"You are "+ height+" cm");
	
	}

}
