package fr.gino;

public class Vehicule {
    String marque;
    int niveauMax;
    int niveauEnergie;
    boolean enStock;
    boolean isLoue;

    public Vehicule(String marque, int niveauEnergie, int niveauMax, boolean enStock, boolean isLoue) {
        this.marque = marque;
        this.niveauEnergie = niveauEnergie;
        this.niveauMax = niveauMax;
        this.enStock = enStock;
        this.isLoue = isLoue;
    }

    public void alerteReserve(Vehicule vehicule) {
        if (vehicule.niveauEnergie <= 10) {
            System.out.println("Votre niveau d'énergie est faible, vous arrivez en réserve!");
        }
    }

    public void rechargerEnergie(Vehicule vehicule) {

        if (vehicule.niveauEnergie <= 10) {
            vehicule.niveauEnergie = vehicule.niveauMax;
            System.out.println("Le véhicule a été rechargé !");
        }

    }

    public String toString() {
        return "vehicule: " + this.marque + "-" + "véhicule en stock: " + (this.enStock ? "oui" : "non");
    }
}
