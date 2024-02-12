import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MyQueue {
    public static void main(String[] args) {
        System.out.println("ArrayDeque");
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.offer("hello");
        arrayDeque.offer("hello");
        arrayDeque.offer("hola");
        arrayDeque.offer("你好");

        arrayDeque.poll();

        Iterator<String> iterator = arrayDeque.iterator();
        while(iterator.hasNext()) {
            String i = iterator.next();
            System.out.println(i);
        }

        System.out.println("PriorityQueue");

        PriorityQueue<Person> priorityQueue = new PriorityQueue<Person>(new PersonAgeComparator());

        priorityQueue.offer(new Person("张三", 19));
        priorityQueue.offer(new Person("李四", 18));
        priorityQueue.offer(new Person("王五", 20));

        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

    }
}
