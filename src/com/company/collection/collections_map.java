import java.util.HashMap; // импортируется интерфейс ArrayList для возможности хранить значения в случайном порядке и находить нужные значения

public class collections_map { //создается класс с названием
        public static void main(String[] args) { //определяется метод

            HashMap myHashMap = new HashMap(); //создается объект с именем "myHashMap"
            myHashMap.put("paper", "001");     //методом put добавляем произвольные значения
            myHashMap.put("stapler", "020");   //методом put добавляем произвольные значения
            myHashMap.put("pen", "098");       //методом put добавляем произвольные значения
            myHashMap.put("eraser", "893");    //методом put добавляем произвольные значения
            myHashMap.put("notepad", "32");    //методом put добавляем произвольные значения - дубликат
            myHashMap.put("folder", "45787");  //методом put добавляем произвольные значения
            myHashMap.put("notepad", "32");    //методом put добавляем произвольные значения - дубликат
            myHashMap.put("sticker", "345");   //методом put добавляем произвольные значения
            myHashMap.put("pricelist", "pricelist");   //методом put добавляем произвольные значения

            System.out.println("Do we have duplicates? " + myHashMap.containsKey("notepad")); //с помощью поиска по ключу ищем дубикат и получаем его
            System.out.println("Do we have blank elements? " + myHashMap.containsKey("blank elements")); //с помощью поиска по ключу ищем пустое и не получаем его
            System.out.println("stapler is here? " + myHashMap.containsKey("stapler"));
            System.out.println("Do we have pricelist? " + myHashMap.containsKey("pricelist"));
        }
    }