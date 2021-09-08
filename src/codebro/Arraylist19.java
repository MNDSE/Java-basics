package codebro;

import java.util.ArrayList;

public class Arraylist19 {

	public static void main(String[] args) {
		// ArrayList = a resizable array.
		//			  Element can be added and removed after complication
		//			  Store reference data types
 		
ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("hamburg");
		food.add("hotdog");
		food.set(2, "bolognese");
		food.remove(2);
	//	food.clear();
		food.spliterator();
		
	for(int i =0; i<food.size();i++) {
	System.out.println(food.get(i));
	
	}
	}

}
