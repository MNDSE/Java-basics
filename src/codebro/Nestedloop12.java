package codebro;

import java.util.Scanner;

public class Nestedloop12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// nested loops = loop inside a loop^
		
	Scanner scanner = new Scanner(System.in);
	
	int rows;
	int columns;
	String symbol = "";
	
	System.out.println("Enter the number of rows");
	rows= scanner.nextInt();
	
	System.out.println("Enter the number of columns");
	columns= scanner.nextInt();
	
	System.out.println("enter a symbol");
	symbol = scanner.next();
	
	for(int i=1; i<=rows; i++) {
		System.out.println();
	}
	for(int j=1;j<=columns;j++) {
		System.out.println(symbol);
	}
	
		
	}

}
