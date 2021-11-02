import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// dynamic polymophisme =  the ability of an object to identify as more than one type
		
		Clothe clothe;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" what type of clothe are you going to wear");
		System.out.println(" *1= Shirt && 2 = Coat*");
		
		int choice = scanner.nextInt();
		if (choice == 1) {
			clothe = new Shirt();
			clothe.wear();
			
		}
		else if (choice == 2) {
			clothe = new Coat();
			clothe.wear();
		
		}
		else { clothe = new Clothe();
		System.out.println("that choice was invalide");
		clothe.wear();
		}
		

	}

}
