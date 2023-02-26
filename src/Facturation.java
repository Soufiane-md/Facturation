import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facturation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ArrayList<Client> clients = new ArrayList<>();
       ArrayList<Facture> factures = new ArrayList<>();
        ArrayList<Produit> produits = new ArrayList<>();

        while (true) {
            System.out.println("Voulez-vous ajouter un nouveau client ? (Oui/Non)");
            String reponse = scanner.nextLine();
            if (reponse.equalsIgnoreCase("non")) {
                break;
            }

            System.out.println("Nom du client :");
            String nom = scanner.nextLine();

            System.out.println("Adresse du client :");
            String adresse = scanner.nextLine();
            Client client = new Client(nom, adresse);
            clients.add(client);
        }

        while (true) {
            System.out.println("Voulez-vous créer une nouvelle facture ? (Oui/Non)");
            String reponse = scanner.nextLine();
            if (reponse.equalsIgnoreCase("non")) {
                break;
            }

            System.out.println("Choisissez le client :");
            for (int i = 0; i < clients.size(); i++) {
                System.out.println(i + 1 + " - " + clients.get(i).getNom());
            }
            int choixClient = Integer.parseInt(scanner.nextLine()) - 1;
            Client client = clients.get(choixClient);

            while (true) {
                System.out.println("Ajoutez un produit à la facture ? (Oui/Non)");
                reponse = scanner.nextLine();
                if (reponse.equalsIgnoreCase("non")) {
                    break;
                }

                System.out.println("Nom du produit :");
                String nom = scanner.nextLine();

                System.out.println("Catégorie du produit :");
                String categorie = scanner.nextLine();

                System.out.println("Prix du produit :");
                double prix = Double.parseDouble(scanner.nextLine());

                System.out.println("Quantité du produit :");
                int quantite = Integer.parseInt(scanner.nextLine());

                Produit produit = new Produit(nom, categorie, prix, quantite);

                produits.add(produit);
            }

            Facture facture = new Facture(client, produits);
            factures.add(facture);
        }

        for (Facture facture : factures) {
            Client client = facture.getClient();
            System.out.println("Client " + client.getNom() + " :");
            for (Produit produit : facture.getProduits()) {
                System.out.println(produit.getNom() + " (" + produit.getCategorie() + ") " + produit.getQuantite() + " " + produit.getPrixUnitaire());
            }
            double total = facture.calculerTotal();
            System.out.println("--------------------------------");
            System.out.println( "Total    " + total);
        }


    }



}
