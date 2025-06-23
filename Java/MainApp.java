import java.lang.Math;

// 1 ligne
/*
 Plusieurs lignes
 */

/*
 * Compilation
 * javac [App].java, on peut tout faire avec javac *.java
 */



/*
 * Entier : 14
 * 18666 - 18_666
 * 10000000000000 - 10_000_000_000_000
 * Bases : décimale 0 à 9)
 * binaire (0 et 1) : 0b11011011
 * octale (0 à 7) : 0755
 * hexadécimale (0 à F) : 0x766
 */

/*
 * \n : nouvelle ligne
 * \t : tabulation
 * \r : retour chariot (supprime tout avant !)
 * \b : retour arrière
 * \f : nouvelle page
 * \[charactère] pour protéger un caratère
 */

/*
 * Nommer une variable :
 * - Pas de caractère spéciaux, pas d'espaces
 * - Commence par une lettre ou underscore
 * 
 * CamelCase : uneVariableUnPeuLongue
 * PascalCase : UneVariable
 * SnakeCase : une_variable
 * CamelCase pour les variables et PascalCase pour les class
 */

/*
 * Opérateurs
 * = → Affectation (voir variable)
 * + → Concaténation/Addition
 * - Soustraction
 * * Multiplication
 * / Division
 * % Modulo (reste de la division euclidienne)
 * // Quotien (quotien de la division euclidienne)
 * Math.pow(a,b) pour a^b (import java.lang.Math;)
 * 
 * == Comparaison
 * != Différent de
 * ! inverse de (négation)
 * && Et
 * || ou
 * < ou <=
 * >= ou >
 * [opérateur]= nous donne varible = variable [opérateur] valeur assignée
 * Cas particulier : --A ou A++ → A+=1 et A-- ou --A → A-=1
 * A++ != ++A car A++ donne A = A + 1 et ++A donne A = (A + 1)
 * ++A est plus rapide pour le PC !
 */


public class MainApp
{
    public static void main(String[] args)
    {
        System.out.println("Bonjour tout le monde !");

        int ageUtilisateur = 18;
        System.out.println(ageUtilisateur);

        final double PI = 3.14;
        // final permet de définir une constante, on met tout en MAJUSCULE
        System.out.println(PI);

        System.out.println("Le nombre pi  est" + PI + " !");

        int rayon = +5;
        //On peut mettre un plus si on veux
        double result = PI * Math.pow(rayon,2);
        // Attention à mettre double ici car PI est en double
        System.out.println("L'aire d'un disque de rayon " + rayon + " est " + result);

        int experience = 0;
        experience += 10;
        //On incrémente de 10 
        System.out.println(experience);

        int nb1 = 1;
        int nb2 = nb1++; //nb2 = nb1 puis nb1 += 1
        System.out.println(nb1 +" et "+ nb2);

        int nb3 = 1;
        int nb4 = ++nb3; // nb3 += 1 puis nb4 = nb3
        System.out.println(nb3 +" et "+ nb4);
    
        /*
         * Conditions
         */


        int value = 16;
        //On en mets jamais de ; après une condition
        if(value == 24) //si c'est false, y'a rien d'exe à l'intérieur
            System.out.println("Value = 24");
            //Ici les { et } sont optionnelle (seulement pour  une seule ligne sinon il faut les metre)
        
        if(value == 16)
        {
            System.out.println("Value = 16");
        }
        
        //Cela peut se simplifier :
        if(value == 24 || value == 15)
            System.out.println("C'est bon");
        else if (value >20) //On peut mettre autant d'else if qu'on veut
            System.out.println("Toujours pas bon");
        else //La dernier condition possible (tous les autres cas)
            System.out.println(value);
            if(value<20)
                System.out.println("Value est petit");

        int option = 1;

        switch(option) //Ne marche que pour une variable
        {
            case 1: //Cela équivaut à if(option == 1)
                System.out.println("option = 1");
                break; //Ne pas oublier pour éviter de tous chercher !
            
            default:// Équivalent du else pour un switch
                System.out.println("Option != 1"); 
        } //Ne pas oublier les {}
    
        /*
         * Boucles
         */


        int i = 0;
        
        while(i!=10)
        {
            ++i; //Voir pré-incrémentation

            if(i==5)
                continue; //Ignore la suite de la boucle et la recommence !
                //break; //Stop la boucle ou la condition

            System.out.println(i); //Ici 5 est sauté
        }
        
        i = 0;
        do
        {
            i++;
            //System.out.println(i);
        }
        while(i!=10); //On fait le teste qu'après (on doit au moins faire le "do" une fois)
        
        int j;
        
        for(j = 0 ; j != 10 ; j++) //for(intialisation; point d'arrêt; incrémentation)
        {
            //System.out.println(j);
        }
    } 

} 
