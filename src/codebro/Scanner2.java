package codebro;
import java.util.Scanner;
public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in); // (scanner object) this help to put an input user
	
	System.out.println("What is your name");
	String name = scanner.nextLine(); // entering the input
	
	System.out.println("How old are you");
	int age = scanner.nextInt();   // entering the input
	
	System.out.println("Where do you live");
	String place = scanner.next();
	
	System.out.println("What is your favorite food"); //entering input
	String food = scanner.next();
	
	System.out.println("how many plats of bolognese can you eat");
	int plats = scanner.nextInt();
	
	System.out.println("Hello "+name); // printing the input
	System.out.println("You are "+age+" years old" );
	System.out.println("You live in "+place);
	System.out.println("Haha You like "+food+" very delicious");
	System.out.println("Woow "+plats+" you are a big ass "+food+" eater");
}
}
