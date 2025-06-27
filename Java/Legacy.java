import entities.Horse;
import entities.Pegasus;

public class Legacy {
    public static void main(String[] args) {
        Horse h = new Horse("Garzo");
        h.move(150,200);

        Pegasus p = new Pegasus("Gizmo");
        p.move(2000,100);
        p.fly(50);

        if(p instanceof Pegasus)
            System.out.println("C'est un pégase !");
    }
}
