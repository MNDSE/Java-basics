
public class Arrayofobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		Food[] refrigerator = new Food [3];
		
		Food food1 = new Food("mbaxalou saloum");
		Food food2 = new Food("thiepbou wekhe");
		Food food3 = new Food("lakhe");
		
		refrigerator[0] = food1;
		refrigerator[1]= food2;
		refrigerator[2]= food3;
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
	}

}
