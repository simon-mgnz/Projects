import java.util.StringTokenizer;

public class CharChain {
    
    /*
     * String est immuable (le contenu n'est pas modifiable)
     *     > concat() → plus rapide que +
     *     > length() → nombre de caractère de la variable
     *     > toUpperCase() tout en maj
     *     > toLowerCase() tout en min
     *     > trim() enlève les espaces
     *     > replace([truc à changer], [par quoi])
     *     > CharAt(nbr) emplacement du caractère (comme un tableau)
     *     > substring([index],[nb]) à partir du quel on commence à prendre les caractères et combien on en prend.
     *      
     *     > equals([2e chaine]) Vérifie si c'est égal
     *     > compareTo([2e chaine]) Compare par rapport à la table askii pour un seul caractère (ou plus, à voir)
     * 
     * StringBuilder / StringBuffer (peut varier) : muable (contenu modifiable)
     *     > length() longueur
     *     > capacity() espace aloué en mémoire (elle change en fonction de ce qu'il y a dedans)
     *     > append([str]), comme python, on ajoute des caractères
     *     > insert([index],[str]) pareil mais s'ajoute à l'index
     * 
     * Monothreadé : on manipule 1 seul thread (une route)
     * Multi-threadé : plusieurs threads (plusieurs routes)
     * sBuilder est Monothreadé (asynchrone) et sBuffer est Multi-threadé (synchronisée, thread-safe (on s'assure de l'ordre)).     * 
     */

    public static void main(String[] args) {

        String s = "hello";
        String s2 = "tout le monde";

        System.out.println(s); // Affiche "hello"
        System.out.println(s.length()); // Affiche la longueur de la chaîne, ici 5

        System.out.println(s+ " "+s2); //C'est très lourd, mais le compilateur optimise
        System.out.println(s.concat(" ").concat(s2)); // Marche mieux (plus rapide)

        s = "bonjour"; //On créé une nouvelle chaîne à chaque fois ! Pas très performant...
        
        System.out.println(s2.trim());
        System.out.println(s.replace("o","a")); // Marche mieux (plus rapide)

        System.out.println(s.equals(s2)); // Comme s == s2
        System.out.println(s.compareTo(s2));

        String s3 = "new/titre-de-la-news/14";
        StringTokenizer st = new StringTokenizer(s3, "/");

        while(st.hasMoreTokens())
            System.out.println(st.nextToken()); //Donne chaque bout des parties

        StringBuilder sBuilder = new StringBuilder("Bonjour");

        System.out.println(sBuilder.capacity());
        System.out.println(sBuilder.length());
        
        sBuilder.append("tout le monde");
        System.out.println(sBuilder); //On obtient les mêmes résultats avec sBuilder et sBuffer
    
    }
}
