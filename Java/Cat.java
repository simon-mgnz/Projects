public class Cat
{
    public Cat(String name, int age) //C'est l'équivalent d'une fonction !
    {
        System.out.println("Nouveau chat créé : " + this); //this donne l'instance ! On a un chat différent à chaque execution

        this.mName = name; //On modifie les valeurs à chaque fois en fonction de ce qu'on mets dans la fonction, les variables ont une durée de vie
        this.mAge = age;
        System.out.println(this.mName + " - "  + this.mAge);
        //System.out.println(miaou.mName); ne marche pas car mName est privé à cat.java
    }

    private String mName; //Par habitude on mets un m pour savoir que c'est un attribut
    private int mAge; //C'est mieux de les mettres en private
}