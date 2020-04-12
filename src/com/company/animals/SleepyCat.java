package animals;

public class SleepyCat extends Bond {
    public void bondSays() {                       //используем метод из класса Bond
        Bond myBond = new Bond();                  //задаем имся клаааса, который собираемся использовать в текущем классе
        myBond.toString("Hrrrrr");           //вызываем метод класса, к которому обращаемся
    }
}
