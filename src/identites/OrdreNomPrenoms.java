package identites;

public class OrdreNomPrenoms implements OrdreIdentite {
	
    public String ordonne(String prenomsUtilises, String nom) {
    	
        return nom + " " + prenomsUtilises;
    }
}
