import java.util.ArrayList;
import java.util.Iterator;

public class businessTrip {
    public static void main(String[] args)
    {
        ArrayList<String> bag = new ArrayList<>();
        bag.add("Зубная щетка");
        bag.add("Блокнот");
        bag.add("Ручка");
        bag.add("Галстук");
        bag.add("Словарь");
        bag.add("Носки");

        Iterator trip = bag.iterator();
        for (String str:bag){
            System.out.println(str);
        }
    }
}
