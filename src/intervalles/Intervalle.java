package intervalles;

public abstract class Intervalle {

	protected int min, max;
	
	public Intervalle (int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public abstract boolean contient(int valeur);
	
	public void changerBornes(int min, int max) {
		this.min = min;
		this.max = max;
	}
}
