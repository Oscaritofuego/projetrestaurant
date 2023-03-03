public class Menuduj {
  private Entree entree;
  private Plat plat;
  private Dessert dessert;

  public Menuduj(Entree entree, Plat plat, Dessert dessert) {
    this.entree = entree;
    this.plat = plat;
    this.dessert = dessert;
  }

  public Entree getEntree() {
    return entree;
  }

  public void setEntree(Entree entree) {
    this.entree = entree;
  }

  public Plat getPlat() {
    return plat;
  }

  public void setPlat(Plat plat) {
    this.plat = plat;
  }

  public Dessert getDessert() {
    return dessert;
  }

  public void setDessert(Dessert dessert) {
    this.dessert = dessert;
  }
}