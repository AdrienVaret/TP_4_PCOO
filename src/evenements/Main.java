package evenements;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String [] args) {
		
		List<Evenement> evenements = new ArrayList<Evenement>();
		
		evenements.add(new EvenementSouris(10,10, EvenementSouris.Bouton.Gauche));
		evenements.add(new EvenementClavier('a'));
		evenements.add(new EvenementClavier('z'));
		evenements.add(new EvenementSouris(40,20, EvenementSouris.Bouton.Aucun));
		
		for (Evenement e : evenements)
			e.afficher();
	}
}
