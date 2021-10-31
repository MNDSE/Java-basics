
public class Mainoverloadedconstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pizza pizza = new Pizza("thick", "tomato", "camambere", "chicken");
		Pizza pizza = new Pizza("thick", "tomato", "camambere"); // with 3 parameters for the overloaded method
			System.out.println("Here is the composition of your Pizza");
			System.out.println(pizza.bread);
			System.out.println(pizza.sauce);
			System.out.println(pizza.cheese);
			System.out.println(pizza.topping);
			
			
		}
	}


