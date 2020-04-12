package animals;

public class Energy extends Bond {
    private int eng;
    public void bondSays(int eng){                 //переопределяется метод bondSays с новым телом метода
        Bond myBond = new Bond();
        if (eng >= 98){
            myBond.toString("Meow");
        }
        else {
            myBond.toString("Hrrrrr");
        }

    }
}
