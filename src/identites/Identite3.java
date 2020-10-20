package identites;

public class Identite3 extends Identite{

	private OrdreIdentite ordre;
    private PrenomsUtilises prenoms;
	
	public Identite3(String nom, String prenom1, String prenom2, OrdreIdentite ordre, PrenomsUtilises prenoms) {
		
		super(nom, prenom1, prenom2);
		this.ordre = ordre;
		this.prenoms = prenoms;
	}

	@Override
	public String enonce() {
		
		return ordre.ordonne(prenoms.parmi(getPrenom1(), getPrenom2()), getNom());
	}

}
