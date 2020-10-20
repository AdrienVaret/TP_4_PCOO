package intervalles;

public class Test {

	public static void testIntervalleOuvert(IntervalleOuvert inter) {
	      inter.changerBornes(2,6);
	      if (inter.contient(2) || inter.contient(6))
	    	  System.out.println("Ce n’est pas un intervalle ouvert."); else System.out.println("Test réussi.");
	}
	
	public static void testIntervalleFerme(IntervalleFerme inter) {
	      inter.changerBornes(2,6);
	      if (!inter.contient(2) || !inter.contient(6))
	    	  System.out.println("Ce n’est pas un intervalle ferm ́e."); else System.out.println("Test réussi.");
	}
	
	public static void main(String [] args) {
		
		IntervalleOuvert interOuvert = new IntervalleOuvert(0, 0);
		IntervalleFerme interFerme = new IntervalleFerme(0, 0);
		Test.testIntervalleOuvert(interOuvert);
		Test.testIntervalleFerme(interFerme);
	}
	
}
