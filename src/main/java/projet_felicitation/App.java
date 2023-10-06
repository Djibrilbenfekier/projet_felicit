package projet_felicitation;

import java.util.Scanner;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Initialistion des variations
        int salaire = 400;
        int prime = 250;
        int quota = 10;

        // Récupérer le nombre de ventes
        System.out.print("Combien de ventes avez-vous conclues cette semaines ?");
        Scanner clavier = new Scanner(System.in);
        int nbVentes = clavier.nextInt();
        clavier.close();

        // Test : prime ou pas ?
        if (nbVentes >= quota) {
            System.out.println("Félicitations! Vous avez rempli le quota");
        } else {
            int manque;
            manque = quota - nbVentes;
            System.out.println("Il vous manque : " + manque + " pour atteidre le quota");
        }
    }

}