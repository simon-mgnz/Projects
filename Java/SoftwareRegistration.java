
/*
 * [Accesseurs]
 *  getters : accès à un attribut (lecture)
 *  setters : modification d'un attribut
 */

public class SoftwareRegistration
{

    public SoftwareRegistration(int expiration)
    {
        if(mNumberOfRegistrations>0)
        {
            this.mExpirationYear = expiration;
            mNumberOfRegistrations--;
            System.out.println("Enregistrement du produit, valide jusqu'en " + this.mExpirationYear);
            System.out.println("Enregistrement restant :" + this.mNumberOfRegistrations); //A Chaque instance le nombre diminue
        }        
        else
        {
            System.out.println("Max de validations effectuées ! Gros rat ;) ");
        }
    }

    public int getExpirationYear() //C'est le getter
    {
        String access = "Yep";
        
        if(access=="Yep")
            return this.mExpirationYear;
        else
            return 0; // Tout peut être contrôlé par ces attributs
    }

    public void setExpirationYear(int expiration) //C'est le setter
    {
        this.mExpirationYear=expiration;
    }

    int mExpirationYear; //On met en privé si on fait les accesseurs

    private static int mNumberOfRegistrations = 2; //ça sera la même variable pour TOUTES les instances

}