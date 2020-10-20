package contenants;

public class Ouvrable implements Ouverture {
	
    private boolean ouvert = false;
    
    public boolean estOuvert() { 
    	return ouvert; 
    }
    
    void setOuvert(boolean b) { 
    	ouvert = b; 
    }
    
    void ouvrir() { 
    	ouvert = true; 
    }
}
