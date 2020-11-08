package fr.gino;

public class Velo extends Vehicule {
    String typeEnergie;

    public Velo(String marque, String typeEnergie, int niveauEnergie, int niveauMax, boolean enStock, boolean isLoue) {
        super(marque, niveauEnergie, niveauMax, enStock, isLoue);
        this.typeEnergie = typeEnergie;
    }

    public String toString() {
        return "velo: " + this.marque + " - " + "type d'énergie:" + this.typeEnergie + " - " + "véhicule en stock: "
                + (this.enStock ? "oui" : "non");
    }
}
