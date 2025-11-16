import java.util.Scanner;
import calculs.*;

public class Main {

    public static void addition(Scanner scanner) {
        System.out.println("Entrez le premier nombre : ");
        float nombre1 = scanner.nextFloat();
        System.out.println("Entrez le deuxième nombre : ");
        float nombre2 = scanner.nextFloat();

        addition add = new addition();
        float resultat = add.calcul(nombre1, nombre2);

        System.out.println("Le résultat de l'addition est : " + operations.clean(resultat));
    }

    public static void soustraction(Scanner scanner) {
        System.out.println("Entrez le premier nombre : ");
        float nombreA = scanner.nextFloat();
        System.out.println("Entrez le deuxième nombre : ");
        float nombreB = scanner.nextFloat();

        soustraction sous = new soustraction();
        float resultat = sous.calcul(nombreA, nombreB);

        System.out.println("Le résultat de la soustraction est : " + operations.clean(resultat));
    }

    public static void multiplication(Scanner scanner) {
        System.out.println("Entrez le premier nombre : ");
        float nombreM = scanner.nextFloat();
        System.out.println("Entrez le deuxième nombre : ");
        float nombrem = scanner.nextFloat();

        multiplication mul = new multiplication();
        float resultat = mul.calcul(nombreM, nombrem);

        System.out.println("Le résultat de la multiplication est : " + operations.clean(resultat));
    }

    public static void division(Scanner scanner) {
        System.out.println("Entrez le premier nombre : ");
        float nombreD1 = scanner.nextFloat();
        System.out.println("Entrez le deuxième nombre : ");
        float nombreD2 = scanner.nextFloat();

        division div = new division();

        try {
            float resultat = div.calcul(nombreD1, nombreD2);
            System.out.println("Le résultat de la division est : " + operations.clean(resultat));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez l'opération que vous voulez effectuer :");
        System.out.println("1 → Addition");
        System.out.println("2 → Soustraction");
        System.out.println("3 → Multiplication");
        System.out.println("4 → Division");
        System.out.println("5 → Quitter");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1: addition(scanner); break;
            case 2: soustraction(scanner); break;
            case 3: multiplication(scanner); break;
            case 4: division(scanner); break;
            case 5: System.out.println("Au revoir !"); break;
            default: System.out.println("Choix invalide.");
        }

        scanner.close();
    }
}
