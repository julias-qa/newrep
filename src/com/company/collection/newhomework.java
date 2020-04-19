package collection;
import java.util.LinkedList;
import java.util.Queue;

public class newhomework {
    public static void main(String[] args) {
       String town; //объявляется переменная town

        Queue<String> queue = new LinkedList<>(); //создается некоторая очередь
        queue.offer("Head of List"); // голова
        queue.offer("Enter");
        queue.offer("Delete");
        queue.offer("CapsLock");
        queue.offer("Home");
        queue.offer("End");
        queue.offer("Instance");
        queue.offer("Shift");

        while ((town = queue.poll()) != null) { //сначала прописала peek, но тогда выводится первый элемент очереди бесконечно, т.к. никогда не NULL, а poll возвращает головной элемент и как бы "вырезает" его
            System.out.println(town); //почему выводится весь список, а не только первый элемент - неясно :(
        }
    }
}

