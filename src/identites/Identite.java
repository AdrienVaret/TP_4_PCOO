package identites;

abstract class Identite {
	
    private String nom;
    private String prenom1;
    private String prenom2;
    
    public String getNom() { 
    	return nom; 
    }
    
    public String getPrenom1() { 
    	return prenom1; 
    }
    
    public String getPrenom2() { 
    	return prenom2; 
    }
    
    public Identite(String nom, String prenom1, String prenom2) {
        this.nom = nom;
        this.prenom1 = prenom1;
        this.prenom2 = prenom2;
    }
    
    public abstract String enonce(); // Comment on  ́enonce l’identit ́e 
 }
