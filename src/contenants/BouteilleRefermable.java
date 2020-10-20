package contenants;

public class BouteilleRefermable extends Contenant {
	
    public BouteilleRefermable(int contenance){
        super(contenance, contenance, new Refermable());
    }
    
    public void ouvrir() {
        ((Ouvrable)getOuverture()).ouvrir();
    }
    public void fermer() {
        ((Refermable)getOuverture()).fermer();
    }
}
