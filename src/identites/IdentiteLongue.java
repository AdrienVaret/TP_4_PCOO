package identites;

public class IdentiteLongue extends Identite{

	public IdentiteLongue(String nom, String prenom1, String prenom2) {
		super(nom, prenom1, prenom2);
	}

	@Override
	public String enonce() {
		return getPrenom1() + " " + getPrenom2() + " " + getNom();
	}
	
	

}
