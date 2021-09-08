package codebro;

public class Overloadmethode23 {

	public static void main(String[] args) {
		//  overloaded methods = methhods that shares the same name but have different parameters
		// 						 method name + parameters = method signature

		double w = add(1.0,2.0,3.0,4.0);
		System.out.println(w);
	}
static int add(int a, int b) {
	System.out.println("There is overloaded method 1");
	return a + b;
}

static int add(int a, int b, int c) {
	System.out.println("There is overloaded method 2");
	return a + b + c;
}
static int add(int a, int b, int c, int d) {
	System.out.println("There is overloaded method 3");
	return a + b+ c + d;
}

static double add(double a , double b, double c, double d) {
	
	System.out.println("There is overloaded method 4");
	return  a +b+c+d;
}
}
