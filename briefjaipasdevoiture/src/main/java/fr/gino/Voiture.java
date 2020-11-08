package fr.gino;

public class Voiture extends Vehicule {
    String typeEnergie;
    int km;
    int nbPlaces;

    public Voiture(String marque, String typeEnergie, int km, int nbPlaces, int niveauEnergie, int niveauMax,
            boolean enStock, boolean isLoue) {
        super(marque, niveauEnergie, niveauMax, enStock, isLoue);
        this.typeEnergie = typeEnergie;
        this.km = km;
        this.nbPlaces = nbPlaces;
    }

    public String toString() {
        return "voiture: " + this.marque + " - " + "type d'énergie:" + this.typeEnergie + " - " + "nb de places: "
                + nbPlaces + " - " + "véhicule en stock: " + (this.enStock ? "oui" : "non");
    }
}
