package codebro;
import java.util.Random;
public class Random6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Random random = new Random(); // creating a random method
		int x = random.nextInt(10); // assigning x 10 but add 1 to get the value 10
		
		double y = random.nextDouble(); 
		
		boolean w = random.nextBoolean();
		System.out.println(x);
	}

}
