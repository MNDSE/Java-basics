
public class Inheritance33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Food food = new Food();
Yassa yassa = new Yassa();
Maffe maffe = new Maffe();
yassa.order();
yassa.thanks();
maffe.thanks();

System.out.println(yassa.price);
System.out.println(maffe.price);
System.out.println(food.price);
	}

}
