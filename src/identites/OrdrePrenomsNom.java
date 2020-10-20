package identites;

public class OrdrePrenomsNom implements OrdreIdentite {
	
    public String ordonne(String prenomsUtilises, String nom) {
    	
        return prenomsUtilises + " " + nom;
    }
}
