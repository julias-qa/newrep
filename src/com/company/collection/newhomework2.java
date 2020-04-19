package collection;
import java.util.PriorityQueue;

public class newhomework2 {
    public static void main(String[] args) {

        PriorityQueue<String> myPriorityQueue = new PriorityQueue<>();
        myPriorityQueue.add("Customer");
        myPriorityQueue.add("Sailor"); //эту роль нужно удалить
        myPriorityQueue.add("Manager");
        myPriorityQueue.add("Developer");
        myPriorityQueue.add("Sales");
        myPriorityQueue.add("CEO");
        System.out.println("Roles: " + myPriorityQueue);

        myPriorityQueue.remove("Sailor"); //указываем - кого убрать
                System.out.println("Extra role: Sailor"); //показываем кого убрали

        System.out.println("Roles after editing: " + myPriorityQueue); //выводится очередь после удаления лишней роли*/
    }
}
