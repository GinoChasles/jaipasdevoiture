package fr.gino;

import java.util.ArrayList;

public class Agence {
    String nomAgence;
    String nomCommercial;
    Adresse adresse;
    ArrayList<Vehicule> stockVehicule;

    public Agence(String nomAgence, String nomCommercial) {
        this.nomAgence = nomAgence;
        this.nomCommercial = nomCommercial;
        this.stockVehicule = new ArrayList<Vehicule>();
    }

    public void ajouterAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void stockerVehicule(Vehicule vehicule) {
        if ((vehicule.enStock == false) && (vehicule.isLoue == false)) {
            this.stockVehicule.add(vehicule);
            vehicule.enStock = true;
            System.out.println(String.format("Le véhicule %s a été ajouté au stock de l'agence %s", vehicule.marque,
                    this.nomAgence));
        } else
            System.out.println(String.format("Le véhicule %s a déjà été ajouté au stock de l'agence de %s",
                    vehicule.marque, this.nomAgence));
    }

    public void verifierStock() {
        System.out.println("Stock");
        for (Vehicule vehicule : stockVehicule) {
            System.out.println(vehicule);
            vehicule.enStock = true;
        }
    }

    public String toString() {
        return ("agence: " + this.nomAgence + " - " + this.nomCommercial + " - " + this.adresse.ville);
    }

    public static void creerAgenceNantes() {
        Agence agenceNantes = new Agence("Agence de Nantes", "Gino");
        Adresse adresse = new Adresse("rue des moulins", "44200", "Nantes");
        agenceNantes.ajouterAdresse(adresse);
        System.out.println(agenceNantes);

        Voiture voitPetitPrix = new Voiture("Dacia", "Diesel", 50000, 5, 50, 50, false, false);
        Voiture voitureChere = new Voiture("HamzaTesla", "Electrique", 0, 3, 100, 100, false, false);
        Velo velo = new Velo("BMX", "manuel", 0, 0, false, false);
        Velo veloElectrique = new Velo("BMX", "électrique", 100, 100, false, false);
        agenceNantes.stockerVehicule(voitPetitPrix);
        agenceNantes.stockerVehicule(veloElectrique);
        agenceNantes.stockerVehicule(velo);
        agenceNantes.stockerVehicule(voitureChere);

        agenceNantes.verifierStock();
    }

    public static void creerAgenceRennes() {
        Agence agenceRennes = new Agence("Agence de Rennes", "Hamza");
        Adresse adresse = new Adresse("rue des moulins", "44200", "Rennes");
        agenceRennes.ajouterAdresse(adresse);
        System.out.println(agenceRennes);

        Voiture voitPetitPrix2 = new Voiture("Dacia", "Diesel", 50000, 5, 50, 50, false, false);
        Voiture voitureChere2 = new Voiture("HamzaTesla", "Electrique", 0, 3, 100, 100, false, false);
        Velo velo2 = new Velo("BMX", "manuel", 0, 0, false, false);
        Velo veloElectrique2 = new Velo("BMX", "électrique", 100, 100, false, false);
        agenceRennes.stockerVehicule(voitPetitPrix2);
        agenceRennes.stockerVehicule(veloElectrique2);
        agenceRennes.stockerVehicule(velo2);
        agenceRennes.stockerVehicule(voitureChere2);

        agenceRennes.verifierStock();
    }

    public static void creerAgenceBrest() {
        Agence agenceBrest = new Agence("Agence de Brest", "Franckyy");
        Adresse adresse = new Adresse("rue des moulins", "56200", "Brest");
        agenceBrest.ajouterAdresse(adresse);
        System.out.println(agenceBrest);

        Voiture voitPetitPrix3 = new Voiture("Dacia", "Diesel", 50000, 5, 50, 50, false, false);
        Voiture voitureChere3 = new Voiture("HamzaTesla", "Electrique", 0, 3, 10, 100, false, false);
        Velo velo3 = new Velo("BMX", "manuel", 0, 0, false, false);
        Velo veloElectrique3 = new Velo("BMX", "électrique", 100, 100, false, false);
        agenceBrest.stockerVehicule(voitPetitPrix3);
        agenceBrest.stockerVehicule(veloElectrique3);
        agenceBrest.stockerVehicule(velo3);
        agenceBrest.stockerVehicule(voitureChere3);
        agenceBrest.verifierStock();
    }

    public void reserverPremierVehicule(Client client) {
        Vehicule voiture = this.stockVehicule.get(0);
        client.vehiculeReserver = voiture;
        voiture.enStock = false;
        voiture.isLoue = true;
        this.verifierStock();
    }

}
