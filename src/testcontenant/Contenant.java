package testcontenant;

public abstract class Contenant {
	

    private int contenance;
    private int reste;
    
    int getContenance() { return contenance; }
    int getReste() { return reste; }
    void setReste(int reste) { this.reste = reste; }
    
    Contenant(int contenance, int reste) {
        this.contenance = contenance;
        this.reste = reste;
    }
    
    void verserDans(int quantite, Verre verre) {
        reste = reste - quantite;
        verre.setReste(verre.getReste() + quantite);
    }
}
