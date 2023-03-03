public class Stock {
    private int quantiteEntrees;
    private int quantitePlats;
    private int quantiteDesserts;

    public Stock(int quantiteEntrees, int quantitePlats, int quantiteDesserts) {
        this.quantiteEntrees = quantiteEntrees;
        this.quantitePlats = quantitePlats;
        this.quantiteDesserts = quantiteDesserts;
    }

    public void miseAJourStock(Menuduj menuDuJour) { //soustrait 
        this.quantiteEntrees -= menuDuJour.getEntree().getQuantite();
        this.quantitePlats -= menuDuJour.getPlat().getQuantite();
        this.quantiteDesserts -= menuDuJour.getDessert().getQuantite();
    }
//getters et setters apres
	public int getQuantiteEntrees() {
		return quantiteEntrees;
	}

	public void setQuantiteEntrees(int quantiteEntrees) {
		this.quantiteEntrees = quantiteEntrees;
	}

	public int getQuantitePlats() {
		return quantitePlats;
	}

	public void setQuantitePlats(int quantitePlats) {
		this.quantitePlats = quantitePlats;
	}

	public int getQuantiteDesserts() {
		return quantiteDesserts;
	}

	public void setQuantiteDesserts(int quantiteDesserts) {
		this.quantiteDesserts = quantiteDesserts;
	}
    
}