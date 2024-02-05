import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum = 0, moyenne;
        Scanner scanner = new Scanner(System.in);
        double[] tabNotes = new double[5];
        System.out.println("Entrer les notes");

        for (int i = 0; i < tabNotes.length; i++) {
            do {
                tabNotes[i] = scanner.nextDouble();
                if (tabNotes[i] > 20) {
                    System.out.println("La note doit être inférieure ou égale à 20. Veuillez entrer une nouvelle note :");
                }
            } while (tabNotes[i] > 20);

            sum += tabNotes[i];
        }

        moyenne = sum / tabNotes.length;

        System.out.println("Somme des notes : " + sum);
        System.out.println("Moyenne des notes : " + moyenne);
    }
}
