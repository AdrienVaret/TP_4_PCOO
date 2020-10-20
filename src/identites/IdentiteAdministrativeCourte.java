package identites;

public class IdentiteAdministrativeCourte extends IdentiteAdministrative{

	
	public IdentiteAdministrativeCourte(String nom, String prenom1, String prenom2) {
		super(nom, prenom1, prenom2);
	}

	@Override
	String getPrenomsUtilises() {
		return getPrenom1();
	}
}
