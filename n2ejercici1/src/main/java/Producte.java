public class Producte {

    private String nom;
    private int preu;

    public Producte(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }
    public int getPreu(){
        return preu;
    }

    public String getNom() {
        return nom;
    }
}
