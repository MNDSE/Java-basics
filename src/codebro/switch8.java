 package codebro;

import java.util.Scanner;

public class switch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch = statement that allows a variable to be tested for equality against a list of value
		String student;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
			student = scanner.next();

switch(student) {
case "Ansou": System.out.println("welcome student Ansou");
break;
case "Daouda": System.out.println("welcome student Daouda");
break;
case "Fatou": System.out.println("welcome student Fatou");
break;
case "Amina": System.out.println("Welcome student Amina");
break;

default: System.out.println("your are not a student here");
}

	
	}

}
