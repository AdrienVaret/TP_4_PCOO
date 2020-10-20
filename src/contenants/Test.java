package contenants;

public class Test {
	
    public static void main(String[] args){
        BouteilleRefermable b1 = new BouteilleRefermable(100);
        Canette c = new Canette(33);
        Verre v = new Verre(20);
        b1.ouvrir();
        //b1.fermer();
        b1.verserDans(10, v);
        c.ouvrir();
        c.verserDans(50, v);
        c.boire(3);
        System.out.println(b1.getReste() + " " + v.getReste() + " " + c.getReste());
    }
}

