package codebro;

public class Printf24 {

	public static void main(String[] args) {
		// printf() = an optional method to control, format, and display text to the console window
		// 	two arguments = format string + (object/variable/value)
		//	% [flags] [precision] [width] [conversion - character]
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "NDENDE";
		int myInt = 28;
		double myDouble = 1000;
		
		// [ Conversion character]
	//	System.out.printf("%b",myBoolean);
	//	System.out.printf("%c", myChar);
	//	System.out.printf("%S", myString);
	//	System.out.printf("%d", myInt);
	//	System.out.printf("%f",myDouble);
		
// [ Conversion to width] use to separate the distance making space
	//	System.out.printf("the result is %30b", myBoolean);
	//	System.out.printf("The result is %20S", myString);
		
		
		// [ Conversion to precision]	use to add how many zero to add at the end or
		
	//	System.out.printf("The result is %.3f", myDouble);
		
		// [ Conversion to flag]
		// Use flag to add sign such as +,-, or comma
		System.out.printf("The result is %+f",myDouble);
	}

}
