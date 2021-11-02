
public class Main {

	public static void main(String[] args) {
		// Interface = template that can be applied to a class.
		// similar to inheritance, but specifies what a class has/must do
		// classes can apply more than one interface, inheritance is limited to 1 super class
		
		/* Basically the interface serves as an outside mirror we can use to put some method that we will lately use on one of our classes*/
 
		
		macbook Macbook = new macbook();
		Macbook.editing();
		
		hp Hp = new hp ();
		Hp.game();
		
		asus Asus = new asus();
		Asus.editing();
		Asus.game();
	}
	

}
