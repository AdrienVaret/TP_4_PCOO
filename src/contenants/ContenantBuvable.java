package contenants;

public abstract class ContenantBuvable extends Contenant {
	
    ContenantBuvable(int contenance, int reste, Ouverture ouverture){
        super(contenance, reste, ouverture);
    }
    public void boire(int quantite) {
        if(Contenant.getTransferabilite().estTransferable(this, quantite)){
            setReste(getReste() - quantite);
        }
    }
}
