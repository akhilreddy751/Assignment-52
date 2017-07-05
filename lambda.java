import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class lambda {

	public static void main(String[] args) {
	ArrayList<Player> players = new ArrayList<Player>();
	players.add(new Player("22", "musani", "akhil reddy", "70000"));
	players.add(new Player("24", "daggubati", "vijay", "60000"));
	
	ArrayList<Player> players2 = (ArrayList<Player>) players.clone(); 
	
	Comparator<Player> c1 = new Comparator<Player>() {
		public int compare(Player p1, Player p2) {
			return p1.lastname.compareTo(p2.lastname);
		}
	};
	Collections.sort(players,c1);
	System.out.println(players);
	Comparator<Player> c2 = (Player p1, Player p2) -> p1.age.compareTo(p2.age);
	Collections.sort(players2,c2);
	System.out.println(players2);
	
	Comparator<Player> c3 = (Player p1, Player p2) -> p1.firstname.compareTo(p2.firstname);
	Collections.sort(players2,c3);
	System.out.println(players2);
	
	Comparator<Player> c4 = (Player p1, Player p2) -> p1.lastname.compareTo(p2.lastname);
	Collections.sort(players2,c4);
	System.out.println(players2);
	
	Comparator<Player> c5 = (Player p1, Player p2) -> p1.salary.compareTo(p2.salary);
	Collections.sort(players2,c5);
	System.out.println(players2);
		
	}
	
		
		
		
	}


