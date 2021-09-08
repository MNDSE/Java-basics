package codebro;

public class arrays2d15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // 2D arrays = an array in arrays, just like having rows and columns
		
	//		String [][] cars = new String[3][3];
		
	//	cars[0][0] = "camaro";
	//	cars[0][1] = "Ford";
		//	cars[0][2] = "Kia";
//				cars[1][0] = "camaro";
//					cars[1][1] = "Ford";
//					cars[1][2] = "Kia";
//					cars[2][0] = "camaro";
//					cars[2][1] = "Ford";
//					cars[2][2] = "Kia";
		
		
		String[][] cars ={
				{" camaro","ford","kia"}, {"camaro","ford","kia"},{"camaro","ford","kia"}
		};
		
		for(int i = 0; i<cars.length;i++) {
			System.out.println();
		
		for(int j=0; j<cars[i].length;j++) {
		
				
			System.out.println(cars[i][j]+"");
	}
	}
}
}
