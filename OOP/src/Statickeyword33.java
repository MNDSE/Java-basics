
public class Statickeyword33 {

	public static void main(String[] args) {
		// Static = modifier. A single copy of a variable/method is created and shared 
		// The class "owns" the static member; does not need to create an object.
		
	Friends friends1 = new Friends("Amina");
	Friends friends2 = new Friends("ndende");
	Friends friend3 = new Friends("Ousmane");
	
System.out.println(Friends.NumberofFriends);
Friends.displayfriend();
	}

}
