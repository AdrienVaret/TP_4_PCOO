package contenants;

public class Carafe extends Contenant implements ContenantRemplissable {
	    
	Carafe(int contenance) {
		super(contenance, 0, new ToujoursOuvert());
	}
	
	@Override
	public int getContenance() {
		return super.getContenance();
	}
}
