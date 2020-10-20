package intervalles;

public class IntervalleOuvert extends Intervalle{
	
	public IntervalleOuvert(int min, int max) {
		super(min, max);
	}
    
    public boolean contient(int v) { 
    	return v > min & v < max; 
    }
}