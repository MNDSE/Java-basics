
public class Friends {

	String name;
	static int NumberofFriends;
	
	Friends(String name){
		this.name= name;
		NumberofFriends++;
	}
	static void displayfriend() {
		System.out.println("The number of friends is "+NumberofFriends+ " Friends");
	}
}
