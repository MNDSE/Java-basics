package codebro;

import java.util.ArrayList;

public class Arraylist2d20 {

	public static void main(String[] args) {
		/* 2d ArrayLIst = a dynamic lists of lists
		 * you can change the size of these lists during runtimes
		 */

		
	ArrayList<String> Bakerylist = new ArrayList<String>();
	ArrayList<ArrayList<String>> grocerylist = new ArrayList();
	Bakerylist.add("pasta");
	Bakerylist.add("garlic bread");
	Bakerylist.add("donuts");
	
	ArrayList<String> producelist = new ArrayList<String>();
	
	producelist.add("tomatoes");
	producelist.add("cheese");
	
	ArrayList<String>drinklist = new ArrayList<String>();
	
	drinklist.add("water");
	drinklist.add("coffe");
	
	grocerylist.add(Bakerylist);
	grocerylist.add(producelist);
	grocerylist.add(drinklist);
	
	
	System.out.println(grocerylist.get(2).get(1));
	}

}
