package animals;

public class Bond {
    public void eat() {
        System.out.println("give food!");
    }

    public void food()  {
        System.out.println("take it");
    }

    public void nofood()  {
        System.out.println("stop it!");
    }

    public void play(boolean b) {
        if (b == true) {
            System.out.println("Destroy this world!");
        }
        if (b == false) {
            System.out.println("really, dude?");
        }
        return;
    }
}
