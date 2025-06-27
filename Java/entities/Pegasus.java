package entities;

public final class Pegasus extends Horse //Il prend le variable de horse ;  final dit qu'on ne peut plus étendre pégase !
{
    public Pegasus(String name)
    {
        super(name); //Remplace les coordonées par ceux du cheval
        this.mPosZ = 0;
    }

    public void move(int x, int y)//On force l'exe de move et pas celui du cheval
    {
        super.move(x, y); //On fait la même chose mais on change juste le print
        System.out.println(this.mName +" (pegase) se déplace et se retrouve en x = "+this.mPosX+" et y = " +this.mPosY);
    }
 
    public void fly(int z)
    {
        this.mPosZ = z;
        System.out.println(this.mName +" s'élève jusqu'en z = "+this.mPosZ);
    }

    private int mPosZ;

    
}
