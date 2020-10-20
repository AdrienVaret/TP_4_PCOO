package testcontenant;

public class Verre extends Contenant {
    Verre(int contenance){
        super(contenance, 0);
    }
    void boire(int quantite) {
        setReste(getReste() - quantite);
} }
