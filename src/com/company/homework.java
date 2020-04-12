import animals.Bond;
import animals.SleepyCat;
import animals.Energy;
// package animals; почему не срабатывает? как сделать, чтобы срабатывало без перемещения по папкам?

public class homework {
    public static void main(String[] args){
        Bond myCat = new Bond();
        SleepyCat sleep = new SleepyCat();
        Energy myEn = new Energy();
        /*myCat.eat();
        myCat.food();
        myCat.play(true);*/
        sleep.bondSays();
        myCat.bondSays();
        myEn.bondSays(97);
        myEn.bondSays(98);
        myEn.bondSays(100);
    }
}