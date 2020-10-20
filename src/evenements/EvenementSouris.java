package evenements;

public class EvenementSouris implements Evenement{

	public enum Bouton { Aucun, Droite, Milieu, Gauche }
	
	private int x, y;
	private Bouton bouton;
	
	public EvenementSouris(int x, int y, Bouton bouton) {
		this.x = x;
		this.y = y;
		this.bouton = bouton;
	}
	
	@Override
	public void afficher() {
		System.out.println("Souris : (" + x + ", " + y + ") [" + bouton + "]");
	}
}
