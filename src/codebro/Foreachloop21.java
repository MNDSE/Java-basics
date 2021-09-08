package codebro;

import java.util.ArrayList;

public class Foreachloop21 {

	public static void main(String[] args) {
		// for each= traversing technique to iterate through the elements in an array/collection
		//	less steps, more readable
		// less flexible

// String[]animals = {"cat","dog","bird","snake"};

		ArrayList<String>animals = new ArrayList<String>();
		 animals.add("dog");
		 animals.add("snake");
		 animals.add("birds");
		 
		// for( int i =0; i <animals.size();i++);
for(String i : animals) {
	System.out.println(i);
	
}
		
		
		
	}

}
