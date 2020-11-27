package co.simplon;

import java.util.ArrayList;

public class Agence {
  static Agence agenceNantes;

  String nom;
  String nomCommercial;
  Adresse adresse;
  ArrayList<Vehicule> stockDeVehicules;

  Agence(String nom, String nomCommercial) {
    this.nom = nom;
    this.nomCommercial = nomCommercial;
    this.stockDeVehicules = new ArrayList<Vehicule>();
  }

  void ajouterAdresse(Adresse adresse) {
    this.adresse = adresse;
  }

  void ajouterVehicule(Vehicule vehicule) {
    this.stockDeVehicules.add(vehicule);
  }

  void afficherStock() {
    System.out.println("Stock");
    for (Vehicule vehicule : stockDeVehicules) {
      System.out.println(vehicule);
      vehicule.disponible = true;
    }
  }

  public String toString() {
    return (
      "agence: " +
      this.nom +
      " - " +
      this.nomCommercial +
      " - " +
      this.adresse.ville
    );
  }

  static void creerAgenceNantes() {
    agenceNantes = new Agence("Agence de Nantes", "Gino");
    Adresse adresse = new Adresse("rue des moulins", "44200", "Nantes");
    agenceNantes.ajouterAdresse(adresse);
    System.out.println(agenceNantes);

    Voiture voitPetitPrix = new Voiture("Dacia", "blanc", 5, "essence", 30);
    Voiture voitureChere = new Voiture("Audi", "rouge", 5, "essence", 75);
    agenceNantes.ajouterVehicule(voitPetitPrix);
    agenceNantes.ajouterVehicule(voitureChere);
    // System.out.println(voitPetitPrix);

    agenceNantes.afficherStock();
  }

  static void reserverPremierVehicule(Client client) {
    Vehicule voiture = agenceNantes.stockDeVehicules.get(0);
    client.reservation = voiture;
    voiture.disponible = false;
    agenceNantes.afficherStock();
  }
}
