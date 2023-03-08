public class Entree {
  private String nom;
  private int quantite;

  public Entree(String nom, int quantite) {
    this.nom = nom;
    this.quantite = quantite;
  }

  public String getNom() {
    return nom;
  }

  public int getQuantite() {
    return quantite;
  }

  public void setQuantite(int quantite) {//setter quantité
    this.quantite = quantite;
  }
  
}