package co.simplon;

/**
 * Hello world!
 */
public final class App {

  private App() {}

  /**
   * Says hello to the world.
   * @param args The arguments of the program.
   */
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Agence.creerAgenceNantes();
    creerClientEtReserver();
  }

  static void creerClientEtReserver() {
    Client clientRiche = new Client("Trump", "0000");
    Agence.reserverPremierVehicule(clientRiche);
  }
}
