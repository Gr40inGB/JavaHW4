import java.util.*;

public class Task2 {
    public static void main(String[] args) {
//        Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

        MyQueue myQueue = new MyQueue();
        String [] arr = ("Oh, I hope some day I'll make it out of here " +
                "Even if it takes all night or a hundred years").split(" ");
        for (String word : arr) {
            myQueue.enqueue(word);
        }

        System.out.println(myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.first());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.empty());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

        System.out.println(myQueue.size());

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

    }
}
