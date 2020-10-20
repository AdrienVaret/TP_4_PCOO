package identites;

public abstract class IdentiteAdministrative extends Identite2{

	public IdentiteAdministrative(String nom, String prenom1, String prenom2) {
		super(nom, prenom1, prenom2);
	}
	
	@Override
	public String misAvant() { 
		return getNom();
	}
	
	@Override
    public String misApres() { 
		return getPrenomsUtilises(); 
	}
}
