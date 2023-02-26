import java.util.ArrayList;

public class Facture {


    private Client client;
    private ArrayList<Produit> produits;
    private double total;

    public Facture(Client client, ArrayList<Produit> produits) {
        this.client = client;
        this.produits = produits;
    }


    public Client getClient() {
        return client;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }


    public double calculerTotal() {
        double total = 0;
        for (Produit produit : produits) {
            total += produit.calculerPrixTotal(produit.getQuantite());
        }
        return total;
    }
}
