package identites;

public class IdentiteUsuelleCourte extends IdentiteUsuelle{

	public IdentiteUsuelleCourte(String nom, String prenom1, String prenom2) {
		super(nom, prenom1, prenom2);
	}

	@Override
	String getPrenomsUtilises() {
		return getPrenom1();
	}

}
