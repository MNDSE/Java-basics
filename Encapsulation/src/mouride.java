
public class mouride {
	private String clothe;
	private String name;
	private int number;

	
	mouride(String clothe, String name, int number){
		this.setclothe(clothe);
		this.clothe = clothe;
		this.name = name;
		this.setnumber(number);
	
		}
	/* as we cannot call the mouride method from the main class because of the private modifier 
	 we have to create a public get method, called getter */
	
	/* if we want to update a method we need to make a set method*/
	
	public String getclothe() {
		return clothe;
	}
	public String getname() {
		return name;
	}
	public int getnumber() {
		return number;
	}
	public void setclothe(String clothe) {
		this.clothe = clothe;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setnumber(int number) {
		this.number = number;
	}
	
}


