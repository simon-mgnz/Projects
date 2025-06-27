package entities;

public class Horse
{
    public Horse(String name)
    {
        this.mName = name;
        this.mPosX = 0;
        this.mPosY = 0;
    }

    public void move(int x, int y)
    {
        this.mPosX += x;
        this.mPosY += y;
        System.out.println(this.mName +" se déplace et se retrouve en x = "+this.mPosX+" et y = " +this.mPosY);
    }

    protected int mPosX;
    protected int mPosY;
    protected String mName;//Comme private mais avec des classes qui  s'étendent
    
}
