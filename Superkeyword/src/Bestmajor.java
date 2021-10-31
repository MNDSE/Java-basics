
public class Bestmajor extends Major{
	String getajob;

	Bestmajor(String name, String level, int passinggrade,double price, String getajob ){ // constructor
		
		
		// the super just allow the inheritance class to use the declaration of the parent class
		super(name,level,passinggrade,price);
		this.getajob = getajob;
		
	}
}
