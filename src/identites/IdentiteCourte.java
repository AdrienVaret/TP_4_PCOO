package identites;

public class IdentiteCourte extends Identite{

	public IdentiteCourte(String nom, String prenom1, String prenom2) {
		super(nom, prenom1, prenom2);
	}

	@Override
	public String enonce() {
		return getPrenom1() + " " + getNom();
	}

	
}
