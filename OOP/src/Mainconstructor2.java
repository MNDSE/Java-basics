
public class Mainconstructor2 {

	public static void main(String[] args) {
		// constructor = special method that is called when an object is instantiated(created)
		// allow to assign different attribute unlike method
		
	Human human1 = new Human("Ndende", 28,60);
	Human human2 = new Human("Cool", 23, 70);
	System.out.println(human1.weight);
	
	human2.eat();
	human1.drink();

	}

}
