package contenants;

public class TransferableSiOuvert implements Transferabilite {
	
    public boolean estTransferable(Contenant contenant, int quantite){
        return contenant.getOuverture().estOuvert();
    }
}
