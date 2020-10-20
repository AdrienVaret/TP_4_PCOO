package identites;

public class Identite4 extends Identite3{

	private static OrdreIdentite ordre = new OrdrePrenomsNom();
    private static PrenomsUtilises prenoms = new UnSeulPrenom();
    
    public Identite4(String nom, String prenom1, String prenom2) {
    	
        super(nom, prenom1, prenom2, ordre, prenoms);
    }
    
    public String enonce() {
    	
        return ordre.ordonne(prenoms.parmi(getPrenom1(), getPrenom2()), getNom());
    }
    
    public static void setOrdreIdentite(OrdreIdentite ordre) { 
    	
    	Identite4.ordre = ordre;
    }
    
    public static void setPrenomsUtilises(PrenomsUtilises prenoms) { 
    	
    	Identite4.prenoms = prenoms;
    }
}
