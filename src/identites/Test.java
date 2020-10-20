package identites;

public class Test {

	public static void test1() {
		System.out.println("Test question 1. : ");
		IdentiteCourte id1 = new IdentiteCourte("Dupont", "Charles", "Robert"); 
		IdentiteLongue id2 = new IdentiteLongue("Dupont", "Charles", "Robert");
	
		System.out.println(id1.enonce()); // affiche : Charles Dupont IdentiteLongue id2 = new IdentiteLongue("Dupont", "Charles", "Robert"); 
		System.out.println(id2.enonce()); // affiche : Charles Robert Dupont
		System.out.println("");
	}
	
	public static void test2() {
		System.out.println("Test question 4. : ");
		Identite3 id1 = new Identite3("Dupont", "Charles", "Robert", new OrdrePrenomsNom(), new LesDeuxPrenoms());
		Identite3 id2 = new Identite3("Dupont", "Charles", "Robert", new OrdreNomPrenoms(), new UnSeulPrenom());
		
		System.out.println(id1.enonce()); // affiche : Charles Robert Dupont	 
		System.out.println(id2.enonce()); // affiche : Dupont Charles
		System.out.println("");
	}
	
	public static void test3() {
		System.out.println("Test question 5. : ");
		Identite4 id1 = new Identite4("Dupont", "Charles", "Robert"); 
		Identite4 id2 = new Identite4("Carpentier", "Michel", "Henri");
		
		System.out.println(id1.enonce()); // affiche : Charles Dupont 
		System.out.println(id2.enonce()); // affiche : Michel Carpentier 
		
		Identite4.setOrdreIdentite(new OrdreNomPrenoms()); 
		
		System.out.println(id1.enonce()); // affiche : Dupont Charles 
		System.out.println(id2.enonce()); // affiche : Carpentier Michel 
		
		Identite4.setPrenomsUtilises(new LesDeuxPrenoms()); 
		
		System.out.println(id1.enonce()); // affiche : Dupont Charles Robert 
		System.out.println(id2.enonce()); // affiche : Carpentier Michel Henri
		
		System.out.println("");
	}
	
	public static void main(String [] args) {
		test1();
		test2();
		test3();
	}
}
