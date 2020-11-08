package fr.gino;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Agence.creerAgenceNantes();
        Agence.creerAgenceBrest();
        Agence.creerAgenceRennes();

        Client loueur1 = new Client("Manu");
        Client loueur2 = new Client("Guillaume");
        Voiture voitPetitPrix2 = new Voiture("Dacia", "Diesel", 50000, 5, 50, 50, false, false);
        Voiture voitPetitPrix23 = new Voiture("Dacia", "Diesel", 50000, 5, 10, 50, true, false);
        loueur1.louerVehicule(loueur1, voitPetitPrix2);
        loueur2.louerVehicule(loueur2, voitPetitPrix23);
        voitPetitPrix23.alerteReserve(voitPetitPrix23);
        voitPetitPrix23.rechargerEnergie(voitPetitPrix23);

    }
}
