package evenements;

public class EvenementClavier implements Evenement{
	
	private char c;
	
	public EvenementClavier(char c) {
		this.c = c;
	}

	@Override
	public void afficher() {
		System.out.println("Clavier : " + c);
	}
	
	
}
