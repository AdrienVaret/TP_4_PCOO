package testcontenant;

public class BouteilleNonRefermable extends Contenant{

	private Bouteille bouteille;
	
	BouteilleNonRefermable(int contenance, int reste) {
		super(contenance, reste);
	}
	
	void ouvrir() { 
		bouteille.ouvrir(); 
	}
    
    void verserDans(int quantite, Verre verre) {
        if(bouteille.estOuvert())
            super.verserDans(quantite, verre);
    }
}
