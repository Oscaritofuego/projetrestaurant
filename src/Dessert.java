
public class Dessert {
	private String nom;
	private int quantite;
	
	public Dessert( String nom, int quantite){
	this.nom=nom;
	this.quantite=quantite;
	}

	public String getNom() {
		return nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}	

}
