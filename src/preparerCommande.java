
/*
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
}*/
