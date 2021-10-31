import javax.swing.JOptionPane;

public class Dishes {
	String name;
	String choice;
	int proteine;
	double price;
	String sidedishe;
	
	Dishes(String name, String choice,int proteine,double price,String sidedishe){
		this.name = name;
		this.choice = choice;
		this.proteine = proteine;
		this.price = price;
		this.sidedishe = sidedishe;
	}
		void nextchoice(Dishes dishe3, Dishes dishe32,int proteine,double price,Dishes dishe33) {
			String nextchoice = JOptionPane.showInputDialog("Enter your next choice");
			JOptionPane.showMessageDialog(null, "this is your choice: "+this.name);
			
			
		}
		void nextchoice(String name, String choice,int proteine,double price,String sidedishe) {
			String nextchoice = JOptionPane.showInputDialog("Enter your next choice");
			JOptionPane.showMessageDialog(null, "this is your choice: "+this.name);
	}

}