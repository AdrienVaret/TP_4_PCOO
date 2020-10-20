package identites;

public abstract class IdentiteUsuelle extends Identite2{

	public IdentiteUsuelle(String nom, String prenom1, String prenom2) {
		super(nom, prenom1, prenom2);
	}

	@Override
	public String misAvant() { 
		return getPrenomsUtilises(); 
	}
	
	@Override
    public String misApres() { 
		return getNom(); 
	}
}
