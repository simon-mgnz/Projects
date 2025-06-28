package entities;

abstract public class LivingSpecies { //Une classe où au moins une des méthodes qui est abstraite. On ne peux pas l'instancier !
    protected String mName;

    public String whoAmI()
    {
        return mName;
    }

    abstract public void eat(); //Il faut les implémenter dans chaque être vivant !
    abstract public void drink();
}
