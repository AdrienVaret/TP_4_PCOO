package evenements;

public class EvenementMessage implements Evenement{

	private String message;
	
	public EvenementMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void afficher() {
		System.out.println("Message : " + message);
	}
}
