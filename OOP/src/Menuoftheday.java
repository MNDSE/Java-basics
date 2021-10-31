import javax.swing.JOptionPane;

public class Menuoftheday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dishes dishe = new Dishes("salad poulet","halal",1200,1500.00,"patatoes");
		Dishes dishe2 = new Dishes("yassa poulet","halal",1200,1500.00,"cornichon");
		Dishes dishe3 = new Dishes("soupou kadjan","halal",1200,1500.00,"cornichon");
		String dishe1 = JOptionPane.showInputDialog("Enter dishe number");
		JOptionPane.showMessageDialog(null,"this is your dishe "+ dishe.name);
		
		dishe2.nextchoice(dishe1, dishe1, 0, 0, dishe1);
		dishe3.nextchoice(dishe3, dishe3, 0, 0, dishe3);
//		System.out.println(dishe.name);
	}

}
