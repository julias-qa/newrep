import java.util.ArrayList; // импортируется интерфейс ArrayList для возможности создания списков
import java.util.Iterator; // импортируется интерфейс Iterator для возможности перебирать список

public class businessTrip {                                                      //создается класс с определенным названием
    public static void main(String[] args)                                       //определяется метод
    {
        ArrayList bag = new ArrayList();                                        //создается объект с именем "bag"
        bag.add("Зубная щетка");                                                //методом add объявили один предмет и далее до конца списка
        bag.add("Блокнот");
        bag.add("Ручка");
        bag.add("Галстук");
        bag.add("Словарь");
        bag.add("Носки");

        Iterator trip = bag.iterator();                                         //создаем объект с именем trip
        while(trip.hasNext()){                                                  //через цикл while задаем условие вывода списка + hasNext() узнает, есть ли следующий элемент - т.е. пока есть следующий элемент, список будет выводиться
            System.out.println(trip.next());                                    //выводим результат, используя метод next после hasNext, чтобы не было ошибки "NoSuchElementException"
        }
    }
}