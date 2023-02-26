public class Produit {
    private String nom;
    private String categorie;
    private double prixUnitaire;
    private int quantite;

    public Produit(String nom, String categorie, double prixUnitaire, int quantite) {
        this.nom = nom;
        this.categorie = categorie;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    public String getNom() {
        return nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public double calculerPrixTotal(int quantite){
        return getPrixUnitaire() * getQuantite();
    }
}