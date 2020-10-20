package contenants;

public abstract class Contenant {
	
	private Ouverture ouverture;
	private int contenance;
	private int reste;
	
	private static Transferabilite transferabilite = new TransferableSiOuvert();
	
	public Contenant(int contenance, int reste, Ouverture ouverture){
        this.contenance = contenance;
        this.reste = reste;
        this.ouverture = ouverture;
	}
	
	int getContenance() { 
		return contenance; 
	}
	     
	public int getReste() { 
		return reste; 
	}
	
	public void setReste(int reste) { 
		this.reste = reste;
	}
	
	Ouverture getOuverture() { 
		return ouverture; 
	}
	
	static void setTransferabilite(Transferabilite transferabilite) {
		Contenant.transferabilite = transferabilite;
	}
	
	static Transferabilite getTransferabilite() { 
		return transferabilite; 
	}
	    
	void verserDans(int quantite, ContenantRemplissable contenant) {
		if(transferabilite.estTransferable(this, quantite)){

			int quantiteAVerser;
			if (reste > quantite)
				quantiteAVerser = quantite;
			else 
				quantiteAVerser = reste;
			
			if (contenant.getContenance() >= contenant.getReste() + quantiteAVerser) {
				contenant.setReste(contenant.getReste() + quantiteAVerser);
				reste -= quantiteAVerser;
			}
			
			else {
				int quantiteVersee = contenant.getContenance() - contenant.getReste();
				contenant.setReste(contenant.getContenance());
				reste -= quantiteVersee;
			}			
		}
	} 
}