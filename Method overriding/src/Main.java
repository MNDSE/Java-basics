
public class Main {

	public static void main(String[] args) {
		
	//	Method overriding = declare a method in subclass,
	//			which is already present in parent class	
		//		done so that a child class can give its own implementation
		
Person person = new Person(); // creating an object
person.build();
Woman woman = new Woman();
woman.build();

	}

}
