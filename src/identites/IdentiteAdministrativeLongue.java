package identites;

public class IdentiteAdministrativeLongue extends IdentiteAdministrative{

	public IdentiteAdministrativeLongue(String nom, String prenom1, String prenom2) {
		super(nom, prenom1, prenom2);
	}

	@Override
	String getPrenomsUtilises() {
		return getPrenom1() + " " + getPrenom2();
	}
}
