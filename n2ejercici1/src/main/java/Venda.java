
import java.util.ArrayList;

public class Venda {

    private ArrayList<Producte> llistaProductes;
    private int preutotal;



    public Venda(ArrayList<Producte> llistaProductes,int preutotal) {
        this.llistaProductes = llistaProductes;
        this.preutotal=preutotal;
    }

    public int getPreutotal() {
        return preutotal;
    }

    public ArrayList<Producte> getLlistaProductes() {
        return llistaProductes;
    }

    public ArrayList<Producte> afegirProducte(Producte producteafeg) {
        llistaProductes.add(producteafeg);
        return llistaProductes;
    }

    public void calcularTotal() throws VendaBuidaException{
        if (llistaProductes.isEmpty()){
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }
        else {
            for (int i = 0; i < llistaProductes.size(); i++) {
                preutotal=preutotal+llistaProductes.get(i).getPreu();
            }

        }

    }
}