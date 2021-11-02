import java.util.InputMismatchException;
import java.util.Scanner;

public class Mainexception {

	public static void main(String[] args) {
		// Exception = an event that occurs during the execution of a program that disrupts the normal flow of instructions
		// if we want to use the finally statement to close the scanner; we have to take out scanner from the try block.
		
		Scanner scanner = new Scanner(System.in);
		try {
		
		System.out.println("Please enter you current balance: ");
		
		int balance = scanner.nextInt();
		
		System.out.println("Please enter the amount you want to withdraw: ");
		int withdraw = scanner.nextInt();
		
		int newbalance= balance - withdraw;
		
		System.out.println("You have " + newbalance );
		

	}
		catch(InputMismatchException e) {
			System.out.println("Only numbers are accepted");
		}
		catch(Exception e) {
			System.out.println("Not valid entry, please try again");
	
		}  finally {
			scanner.close();
		}
		}

}

