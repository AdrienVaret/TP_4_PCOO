package identites;

abstract class Identite2 extends Identite {
	
    public Identite2(String nom, String prenom1, String prenom2) {
        super(nom, prenom1, prenom2);
    }
    
    public String enonce() {
        return misAvant() + " " + misApres();
    }
    
    abstract String getPrenomsUtilises(); // le ou les prenoms utilises 
    abstract String misAvant();
    abstract String misApres();
}
