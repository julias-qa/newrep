package animals;

public class Bond {
    public void eat() {
        toString("give food!");
    }

    public void bondSays() {              //новый метод
        toString("Meow");
    }


    public void food()  {
        toString("take it");
    }

    public void nofood()  {
        toString("stop it!");
    }

    public void play(boolean b) {
        if (b == true) {
            toString("Destroy this world!");
        }
        if (b == false) {
            toString("really, dude?");
        }
    }

    public void toString(String info) {     //надо ли было менять с private на public?
        System.out.println(info);
    }
}
