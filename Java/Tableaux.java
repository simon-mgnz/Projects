

/*
 * Les types de tableaux en Java
* int tab[] = new int[3]; // On crée un tableau de 3 entiers
* int tab[] = {1, 2, 3}; // On crée un tableau de 3 entiers initialisé avec les valeurs 1, 2 et 3
* int tab[] = new int[]{1, 2, 3}; // On crée un tableau de 3 entiers initialisé avec les valeurs 1, 2 et 3
 */

import java.util.Arrays;

public class Tableaux {
    public static void main(String[] args) {
        int[] tab = new int[3]; //On créé un tableau de 3 entiers, collé dans la mémoire (contrairement aux variables qui sont dans la pile)
        //new int ne met pas de valeur par défaut alors que pour :
        int[] tab2 = {1, 2, 3}; //On créé un tableau de 3 entiers initialisé avec les valeurs 1, 2 et 3

        System.out.println(tab); // Affiche l'adresse mémoire du tableau
        System.out.println(tab2[0]); // Affiche la première valeur du tableau tab2
        System.out.println(tab2[1]); // Affiche la deuxième valeur du tableau tab2
        System.out.println(tab2[2]); // Affiche la troisième valeur du tableau tab2

        for(int i = 0 ; i <tab.length ; i++) { // On parcourt le tableau tab
            System.out.println(tab[i]); // Affiche la valeur du tableau tab à l'index i
        }

        for(int el : tab2) { // On parcourt le tableau tab2
            System.out.println(el); // Affiche la valeur de l'élément el du tableau tab2, c'est la même chose que ce qu'on a fait avant !
        }

        int[][] tab3 = new int[2][3]; // On crée un tableau de 2 lignes et 3 colonnes, c'est une matrice
        tab3[0][0] = 1; // On affecte la valeur 1 à la première case de la première ligne par exemple

        int[][] tab4 = { // On crée un tableau de 2 lignes et 3 colonnes initialisé avec les valeurs 1, 2, 3, 4, 5 et 6
            {1, 2, 3},//Tableau 1
            {4, 5, 6}//Tableau 2
        };
        System.out.println(tab4[1][1]); // Affiche la deuxième valeur de la deuxième ligne du tableau tab4

        for(int i = 0 ; i < tab4.length ; i++) { // On parcourt le tableau tab4
            for(int j = 0 ; j < tab4[i].length ; j++) { // On parcourt la ligne i du tableau tab4
                System.out.println(tab4[i][j]+" "); // Affiche la valeur du tableau tab4 à l'index [i][j], on affiche toutes les valeurs du tableau tab4
            }
            System.out.println(); // On passe à la ligne suivante
        }

        for(int[] i : tab4)
            for(int number : i) { // On parcourt le tableau tab4
                System.out.println(number); // Affiche la valeur de l'élément number du tableau tab4, c'est la même chose que ce qu'on a fait avant !
                
        }

        int[] tab5 = {1, 2, 3, 4, 5};
        printTab(tab5); // Appelle la méthode printTab avec le tableau tab5 en paramètre

        int[] tab6 = new int[10];
        Arrays.fill(tab6, 5); // Remplit le tableau tab6 avec la valeur 5

        for(int el : tab6) { 
            System.out.println(el);
        }


    }

    public static void printTab(int[] t)
    {
         for(int element : t)
            System.out.println(element); // Affiche la valeur de l'élément element du tableau t
    }


}