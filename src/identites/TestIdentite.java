package identites;

public class TestIdentite {

	public static void main(String [] args) {
		IdentiteUsuelleCourte id1 = new IdentiteUsuelleCourte("Dupont", "Charles", "Robert"); 
		System.out.println(id1.enonce()); // affiche : Charles Dupont 
		IdentiteAdministrativeLongue id2 = new IdentiteAdministrativeLongue("Dupont", "Charles", "Robert"); 
		System.out.println(id2.enonce()); // affiche : Dupont Charles Robert
	}
}
