import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Accerder à quel niveau");
        int game_level = sc.nextInt(); //On précise qu'on attend un int

        System.out.println(game_level); //Si on ne dit pas un entier, ça ne marche pas !!

        Scanner sc2 = new Scanner(System.in);

        try //On fait ceci
        {
            System.out.println("Année de naissance : ");
            int yearOfBirth = sc.nextInt();
            System.out.println(yearOfBirth);

        }
        catch(InputMismatchException e) //Si c'est pas bon alors on fait ça, on fait un catch par exception
        {
            System.out.println("La date de naissance est invalide");
            e.printStackTrace(); //Il nous dit c'est quoi l'erreur
            System.out.println("Erreur : "+ e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("ça marche pas !");
        }
        finally //Que importe qu'il y ait une exception ou non, ce qu'il ce passe dans le bloc finally
        {
            System.out.println("ok");
        }
    }


}
