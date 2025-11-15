/**Pour le premier projet nous allos créé une calculatrice
 * cette calculatrice doit être capable de faire l'addition, la soustraction, la multiplication et la division de nombre de tous types
 * Notre calculatrice doit pouvoir gérer les erreurs (division par 0)
 * Ce que fait notre calculatrice concrètement : demander deux nombre à l'utilisateur et effectuer une opération arithmétique sur elles
 * l'utilisateur doit pouvoir choisir l'opération qu'il veut effectuer
 * 
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class projet_Aris_Jimmy {

    public static String clean(float n) {
            return String.valueOf(n).replaceAll("\\.0$", "");
        }
        
    public static void addition(Scanner scanner) {

            try {
                 System.out.println("entrer le premier nombre\n") ;

                float nombre1 = scanner.nextFloat() ;
           
                System.out.println("entrer le nombre suivant\n") ;
                float nombre2 = scanner.nextFloat() ;
                
                float somme = nombre1 + nombre2 ;
            
                System.out.printf("la somme de %s et %s est : %s + %s = %s\n", clean(nombre1), clean(nombre2), clean(nombre1), clean(nombre2), clean(somme));
            }
            catch (InputMismatchException e) {
                System.out.println("veillez entré des valeurs valides\n") ;
                return;
            }
        }
                
    public static void soustraction(Scanner scanner) {

            try {
                System.out.println("entrez le premier nombre:");
                float nombreA = scanner.nextInt();

                System.out.println("entrez le deuxième nombre:");
                float nombreB = scanner.nextInt();

                float resultat2 = nombreA - nombreB;

                System.out.printf("le résultat de la soustraction de %s et %s est : %s - %s = %s: ",clean(nombreA), clean(nombreB), clean(nombreA), clean(nombreB), clean(resultat2));

            } catch (InputMismatchException e) {
                System.out.println("Erreur veillez entré une valeur entière");
                return;
            }
    }

    public static void multiplication(Scanner scanner) {

            try {
                System.out.println("entrez le premier nombre");
                float nombreM = scanner.nextFloat();

                System.out.println("Entrez le deuxième nombre") ;
                float nombrem = scanner.nextFloat();

                float resultat3 = nombreM * nombrem ;

                System.out.printf("La multiplication de %s et %s est : %s * %s = %s", clean(nombreM), clean(nombrem), clean(nombreM), clean(nombrem), clean(resultat3) );
            }
            catch (InputMismatchException e) {
                System.out.println("Erreur veillez entré une valeur valide");
                return;
            }
    }   

    public static void division(Scanner scanner) {

            try {
                System.out.println("Entrez le premier nombre");
                float nombreD1 = scanner.nextFloat();

                System.out.println("Entrez le deuxième nombre");
                float nombreD2 = scanner.nextFloat();

                if (nombreD2 == 0) {
                    System.out.println("Erreur! Impossible de faire la division par 0");
                    return;
                }
                else if (nombreD1 ==0 && nombreD2 == 0) {
                    System.out.println("Erreur! Impossible de faire la division de 0 par zero");
                    return;
                }

                float resultat4 = nombreD1 / nombreD2;

            System.out.printf("la division de %s par %s est : %s / %s = %s",clean(nombreD1), clean(nombreD2), clean(nombreD1), clean(nombreD2), clean(resultat4));
            }

            catch (InputMismatchException e) {
                System.out.printf("Erreur veillez entré une valeur valide !");
                return;
            }
    }

   
    public  static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez l'opération que vous voulez effectué\n") ;

        System.out.println("1 --> Addition\n") ;
        System.out.println("2 --> Soustraction\n") ;
        System.out.println("3 --> Multiplication\n") ;
        System.out.println("4 --> Division\n") ;
        System.out.println("5  -- Quitter --\n") ;

        int choix = scanner.nextInt();
    

            switch (choix) {
            case 1:
                addition(scanner);
                break;
            case 2:
                soustraction(scanner);
                break;
            case 3:
                multiplication(scanner);
                break;
            case 4:
                division(scanner);
                break;
            case 5:
                scanner.close();
                return;
            default:
                System.out.println("Option invalide!");
            }

    }
}

