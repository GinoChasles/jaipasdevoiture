package fr.gino;

public class Client {
    String nomClient;
    Vehicule vehiculeReserver;

    public Client(String nomClient) {
        this.nomClient = nomClient;
    }

    public void louerVehicule(Client client, Vehicule vehicule) {

        if ((vehicule.enStock == true) && (vehicule.isLoue == false)) {
            vehicule.isLoue = true;
            vehicule.enStock = false;
            client.vehiculeReserver = vehicule;

            System.out.println(client.nomClient + " a loué une " + vehicule + ".");

        } else {
            System.out.println("Veuillez nous excuser " + client.nomClient + ".");
            System.out.println("Ce vehicule est actuellement indisponible.");
        }
    }
}
