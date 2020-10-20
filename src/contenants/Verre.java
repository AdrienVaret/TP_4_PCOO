package contenants;

public class Verre extends ContenantBuvable implements ContenantRemplissable {
	
    Verre(int contenance){
        super(contenance, 0, new ToujoursOuvert());
    }

	@Override
	public void setReste(int quantite) {
		super.setReste(quantite);
	}

	@Override
	public int getReste() {
		return super.getReste();
	}
	
	@Override
	public int getContenance() {
		return super.getContenance();
	}
}