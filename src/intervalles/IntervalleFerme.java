package intervalles;

public class IntervalleFerme extends Intervalle {

	public IntervalleFerme(int min, int max) {
		super(min, max);
	}

	@Override
	public boolean contient(int valeur) {
		return valeur >= min & valeur <= max;
	}
}