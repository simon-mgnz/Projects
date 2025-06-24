public class CharChain {
    
    /*
     * String est immuable (le contenu n'est pas modifiable)
     *     > concat() → plus rapide que +
     *     > length() → nombre de caractère de la variable
     *     >
     */

    public static void main(String[] args) {

    String s = "hello";
    String s2 = "tout le monde";

    System.out.println(s); // Affiche "hello"
    System.out.println(s.length()); // Affiche la longueur de la chaîne, ici 5

    System.out.println(s+ " "+s2); //C'est très lourd, mais le compilateur optimise
    System.out.println(s.concat(" ").concat(s2)); // Marche mieux (plus rapide)

    s = "bonjour"; //On créé une nouvelle chaîne à chaque fois ! Pas très performant...

    }
}
