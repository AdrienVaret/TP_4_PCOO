package testcontenant;

public class Bouteille extends Contenant {
	
    private boolean est_ouvert = false;
    Bouteille(int contenance){
        super(contenance, contenance);
    }
    
    boolean estOuvert() {return est_ouvert;}
    
    void ouvrir() { est_ouvert = true; }
    void fermer() { est_ouvert = false; }
    void verserDans(int quantite, Verre verre) {
        if(est_ouvert)
            super.verserDans(quantite, verre);
} }
