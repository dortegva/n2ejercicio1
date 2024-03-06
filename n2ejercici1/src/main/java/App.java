import java.util.ArrayList;

public class App {

    public static void main (String[]args) {
        ArrayList<Producte> productes = new ArrayList<Producte>();
        Venda prim=new Venda(productes,0);

        try {
            prim.calcularTotal();
        }
        catch(VendaBuidaException ex){
            System.err.println(ex.getMessage());

        }
        Producte prod1=new Producte("llapis",23);
        Producte prod2=new Producte ("llibreta",56);
        prim.afegirProducte(prod1);
        prim.afegirProducte(prod2);

        try {
        prim.calcularTotal();
        System.out.println(prim.getPreutotal());}

        catch(VendaBuidaException ex){
            System.err.println(ex.getMessage());
        }

    }

}
