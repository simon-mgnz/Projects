package entities;

public class Tiger extends LivingSpecies { //On étends à la classe abstraite !
    public Tiger()
    {
        mName = "Tigre";
    }

    public void eat()
    {
        System.out.println(this.mName + " mange de la viande.");
    }

    public void drink()
    {
        System.out.println(this.mName + " bois de l'eau.");
    }
}
