import java.io.BufferedReader;
import java.io.InputStreamReader; //Ne pas oublier l'importation
import java.util.Scanner;

public class Keylogger {
    /*
     * BufferedReader → Synchrone, thread-safe mais une lecture de caractères. Tampon de 8192
     *  read() : Lire un caractère
     *  readLine() : lire une chaine
     *  skip(N) : ignore N caractère
     * Scanner → Asynchrone, not thread-safe, lecture de donnée + parsing, très couteux en ressource. Tampon de 1024 caractères
     * 
     *  nextLine()
     *  nextChar()
     *  nextByte()
     *  nextFloat()
     *  nextDouble()
     *  nextInt()
     *  nextBoolean()
     */

     public static void main(String[] args) throws Exception { //On lève l'exception

        InputStreamReader isr = new InputStreamReader(System.in); //Prend tous ce qui rentre
        BufferedReader br = new BufferedReader(isr); //L'assigner aux BufferedReader

        System.out.println("Comment t'appelles-tu ?");
        String name = br.readLine();


        Scanner sc = new Scanner(System.in);

        System.out.println("Accerder à quel niveau");
        int game_level = sc.nextInt(); //On précise qu'on attend un int

        System.out.println(game_level);

     }
}
