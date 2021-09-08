package codebro;

import java.util.Scanner;

public class Whileloop10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// while loop = executes a block og code as long as its condition remains true
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.next();
		}
		System.out.println("Hello "+name);
		
		// do loop is a while variation but it execute the code once
		do {
			System.out.println("Enter your name: ");
			name = scanner.next();
		}
		while(name.isBlank());
			System.out.println("Hello "+name);
		}
	}


