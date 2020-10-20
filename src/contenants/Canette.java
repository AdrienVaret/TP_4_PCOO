package contenants;

public class Canette extends ContenantBuvable {
	
    public Canette(int contenance){
        super(contenance, contenance, new Ouvrable());
    }
    
    public void ouvrir() {
        ((Ouvrable)getOuverture()).ouvrir();
    }
}
