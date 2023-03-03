import java.io.File;
import java.io.IOException;


public class main {

public static void meniou(String[] args) {
    Entree entree = new Entree("Salade", 10);
    Plat plat = new Plat("Steak frites", 15);
    Dessert dessert = new Dessert("Crème brûlée", 12);

    Menuduj menuDuJour = new Menuduj(entree, plat, dessert);
	}
public static Commande lireCommande(String nomFichier) {
    ObjectMapper mapper = new ObjectMapper();
    Commande commande = null;
    try {
        commande = mapper.readValue(new File(nomFichier), Commande.class);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return commande;
}
public static void preparerCommande(Commande commande, Stock stock) {
    List<String> platsNonPreparables = new ArrayList<>();
    for (String plat : commande.getPlats()) {
        int quantite = stock.getQuantite(plat);
        if (quantite > 0) {
            stock.setQuantite(plat, quantite - 1);
        } else {
            platsNonPreparables.add(plat);
        }
    }
    if (platsNonPreparables.isEmpty()) {
        System.out.println("Commande préparée avec succès !");
    } else {
        System.out.println("Impossible de préparer la commande. Plats non préparables : " + platsNonPreparables);
    }
}
}