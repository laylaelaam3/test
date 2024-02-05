import java.util.Scanner;

public class ValeurCherche {
    public static void main(String[] args) {
        int[] number = new int[5];
        int valeurCherchée, compteur = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer les valeurs");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println("entrer la valeur a chercher");
        valeurCherchée = scanner.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (valeurCherchée == number[i]) {
                compteur++;

            }
        }
        if (compteur == 0) {
            System.out.println("la valeur n'existe pas dans le tableu");
        } else {
            System.out.println("la valeur existe dans le tableau " + valeurCherchée +"fois"+compteur);
        }

    }
}




