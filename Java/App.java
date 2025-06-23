/* 
 * Un attribut est une variable pour une classe !
 */


public class App
{
    public static void main(String []args)
    {
        Cat miaou = new Cat("Kitty",1); //on créé des chats mdr et on les mets dans la variable.

        int age = 0;
        System.out.println(age);
        age = 15;
        System.out.println(age);
        //D'autres choses
        age = 11;
        System.out.println(age);
        
        // Peut se simplifer en ...
        prog(0);
        prog(15);
        prog(11);

        say("Hello");

        System.out.println(sum(2,5));
        System.out.println(sum(2.3,5.5)); // Java va analyse au cas par cas quelle méthode est bonne ! C'est la surcharge de méthode

        Player p1 = new Player();
        Player p2 = new Player("Jason");
        Player p3 = new Player("Jason",2); //Les caractères sont ici optionnels, la fonction changera en fonction !

        p2.attack(); //La méthode attack s'execute pour p2

        SoftwareRegistration sr = new SoftwareRegistration(2020);
        SoftwareRegistration sr2 = new SoftwareRegistration(2022);//Chaque instance à sa propre variable
        SoftwareRegistration sr3 = new SoftwareRegistration(2020); //La variable sera trop faible donc plus dispo !

        sr.mExpirationYear = 2050;
        System.out.println(sr.mExpirationYear); //On peut tout modifier si c'est pas en privé

        sr.setExpirationYear(2050);
        System.out.println(sr.getExpirationYear()); //On utilisera donc des accesseurs

    }

    public static void prog(int age) //C'est comme une fonction sur python 
    {
        System.out.println(age);
    }

    public static int getNumber() //On remplace void par le type de retour
    {
        boolean coucou = true;
        
        if(coucou)
            return 1; //On termine la méthode.
        else
            return 0;
    }

    public static void say(String msg) //Prend pour paramètre un mot et le renvoie, il y a quand même un void
    {
        System.out.println(msg);
    }

    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static double sum(double a, double b)
    {
        return a + b;
    }

}