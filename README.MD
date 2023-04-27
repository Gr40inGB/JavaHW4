Задача 1.

Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
```java
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        //Пусть дан LinkedList с несколькими элементами.
        //Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
        LinkedList<Integer> list = getList(10, 1, 9);
        System.out.println(list);
        System.out.println(getReverseList(list));
    }

    public static LinkedList<Integer> getList(int size, int min, int max) {
        LinkedList<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(min, max + 1));
        }
        return list;
    }

    public static List<Integer> getReverseList(LinkedList<Integer> list) {
        LinkedList<Integer> resultList = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            resultList.add(iterator.previous());
        }
        return resultList;
    }
}
```

Задача 2 + *

Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.

```java
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
        System.out.println(myQueue.viewAll());
        System.out.println(myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.first());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.empty());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.size());
        System.out.println(myQueue.viewAll());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}

```

Class - MyQueue
```java
import java.util.Arrays;

public class MyQueue {
    private String[] arr = new String[10];
    private int size = 0;
    private int currentFirst = 0;

    int size() {
        return size - currentFirst;
    }

    boolean empty() {
        return size == 0;
    }

    void enqueue(String s) {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, size * 2);
        }
        arr[size++] = s;
    }

    String first() {
        if (size > 0) return arr[currentFirst];
        else return null;
    }

    String dequeue() {
        if (size - currentFirst > 0) return arr[currentFirst++];
        else return null;
    }

    String viewAll() {
        StringBuilder sb = new StringBuilder(size-currentFirst);
        for (int i = currentFirst; i < size; i++) {
            sb.append(arr[i] + " ");
        }
        return sb.toString();
    }
}
```

Задача 3

Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
Используйте итератор

```java
import java.util.LinkedList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
//        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
//        Используйте итератор
        LinkedList<Integer> list = getList(5, 1, 9);
        System.out.println(list);
        System.out.println(getSumm(list));
    }

    public static LinkedList<Integer> getList(int size, int min, int max) {
        LinkedList<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(min, max + 1));
        }
        return list;
    }

    public static int getSumm(LinkedList<Integer> l) {
        int sum = 0;
        // foreach под капотом сам создает итератор
        for (Integer number : l) {
            sum +=number;
        }
        return sum;
    }
}
```