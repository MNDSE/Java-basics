package codebro;

import java.util.Scanner;

public class AND9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Logical operators = used to connect two or more expressions
		//		&& = (AND) both condition must be true
		//		|| = (OR) either condition must be true
		//		! = (NOT) reverses boolean value of condition
		
		
	//	int temp = 15;
		
	//	if(temp>45) {
	//		System.out.println("You go out you die");	
	//	}
	//	else if(temp>=20 && temp<=30) {
	//		System.out.println("You can go outside safely");
	//	}
	//	else {
	//		System.out.println("fucking go outside");
		
	//	Scanner scanner = new Scanner(System.in);
		
	//	System.out.println("You are playing a game! Press q or Q to quit");
	//	String response= scanner.next();
		
	//	if (response.equals("q")|| response.equals("Q")) {
	//		System.out.println("You quit the game");
	//	}
	//	else {
	//		System.out.println("You are still playin the game");
		Scanner scanner = new Scanner(System.in);
		System.out.println(" You are in the game! Press q or Q to leave");
		
		String response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("you still want to play baby");
		}
		else {
			System.out.println("You leave the game");
		}
	}
	 
	
	}


 