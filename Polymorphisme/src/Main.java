
public class Main {

	public static void main(String[] args) {
		//Polymorphism = The ability of an object to identify as more than one type 
		/* Basically, here we take device as an object and makes it identify other type of devices*/
		
Laptop laptop = new Laptop();
Smartphone smartphone = new Smartphone();
Tablette tablette = new Tablette();

Device [] connection = {laptop, smartphone, tablette};
laptop.internet();
smartphone.internet();
tablette.internet();

for ( Device x : connection) {
	
	laptop.internet();
	
}


	}

}
