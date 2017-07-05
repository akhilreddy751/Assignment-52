
public class Player {
	public String age;
	public String lastname;
	public String firstname;
	public String salary;
	
	

	public Player(String n1, String fn, String ln, String n2)
	{
		age = n1;
		lastname = ln;
		firstname = fn;
		salary = n2;
		
	}
	public String toString() {
		return age+ ","+ lastname + "," + firstname + "," +salary;
	
	}

}
