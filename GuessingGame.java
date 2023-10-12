import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Willkommen zum Ratespiel!");
        System.out.println("Bitte wählen Sie Schwierigkeitsgrad aus:");
        System.out.println("1 = leicht");
        System.out.println("2 = mittel");
        System.out.println("3 = schwer");
        System.out.println("4 = sehr schwer");
        int mode = input.nextInt();

        int maxValue = 0;
        int maxTry = 0;

        switch (mode) {  //Schwierigkeitsgrade mit switch case von 1 bis 4
            case 1:
                maxValue = 5;
                maxTry = 3;
                break;
            case 2:
                maxValue = 8;
                maxTry = 3;
                break;

            case 3:
                maxValue = 12;
                maxTry = 3;
                break;
            case 4:
                maxValue = 20;
                maxTry = 3;
                break;
            default:
                System.out.println("Falsche Eingabe. Bitte starten Sie das Spiel neu.");
                System.exit(0);
        }

        int randomNumber = rand.nextInt(maxValue) + 1;
        System.out.println("Bitte geben Sie Ihre Zahl zwischen 1 und " + maxValue + " ein.");
        System.out.println("Sie haben " + maxTry + " Versuche.");


        for (int i = 0; i < maxTry; i++) {
            System.out.println("Versuch " + (i + 1) + ":");
            int guess = input.nextInt();

            if (guess > maxValue || guess < 1) {
                System.out.println("Falsche Eingabe. Bitte starten Sie das Spiel neu.");
                System.exit(0);
            }

            if (guess == randomNumber) {
                System.out.println("Glückwunsch! Sie haben die Zahl erraten.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Die Zahl ist größer als " + guess + ".");
            } else {
                System.out.println("Die Zahl ist kleiner als " + guess + ".");
            }

            if (i == maxTry - 1) {
                System.out.println("Sie haben alle Versuche aufgebraucht. Die Zahl war " + randomNumber + ".");
            }
        }
        System.out.println("Vielen Dank fürs Spielen!");
    }


}
