import entities.Tiger;

public class AbstractClass {
    public static void main(String[] args) {
        Tiger ti = new Tiger();
        System.out.println(ti.whoAmI());
    }
} //Ici, il faut définir drink et eat pour chaque méthode, et si y'a la même chose pour chaque classe
//Il faut le définir comme le whoAmI dans la classe abstraite
//Si on veux changer la valeur par défaut, il suffit d'écraser la méthode avec une nouvelle méthode dans la classe spécifique.
//Attention : Une classe abstraite ne peux pas être instanciée